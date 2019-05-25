package part2;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxHandler extends DefaultHandler {
    private List<Worker> listWorker = new ArrayList<>();
    private Worker worker;
    private String currentElement;
    private String fileName;

    public SaxHandler(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void startDocument() {
        System.out.println("Start parse file " + fileName);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (attributes.getLength() != 0) {
            for (int i = 0; i < attributes.getLength(); i++) {
                if (attributes.getQName(i) == "sinceYear") {
                    worker.setSinceYear(Integer.parseInt(attributes.getValue(i)));
                } else if (attributes.getQName(i) == "company") {
                    worker.setCompany(attributes.getValue(i));
                }
            }
        }
        if (qName == "worker") {
            worker = new Worker();
        }
        currentElement = qName;
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        if (currentElement == "login") {
            worker.setLogin(new String(ch, start, length));
        } else if (currentElement == "position") {
            worker.setPosition(new String(ch, start, length));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName == "worker") {
            if (worker.getLogin()!=null) {
                listWorker.add(worker); 
            } else {
                System.out.println("Wrong configuration: login tag miss");
            }
        }
    currentElement="";
}

    @Override
    public void endDocument() {
        System.out.println("Finish parse file " + fileName);
        print(listWorker);
    }

    private static void print(List<Worker> listWorker) {
        System.out.println("Workers List:");
        listWorker.forEach(v -> System.out.println(v.toString()));
    }
}
