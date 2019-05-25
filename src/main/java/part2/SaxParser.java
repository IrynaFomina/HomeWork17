package part2;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;

public class SaxParser {
    public final static String XML_FILE_NAME = "WorkerList.xml";

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        InputStream is = SaxParser.class.getResourceAsStream(XML_FILE_NAME);
        SaxHandler handler = new SaxHandler(XML_FILE_NAME);
        SAXParser saxParser = saxParserFactory.newSAXParser();
//        URL url = SaxParser.class.getResource(XML_FILE_NAME);
//        File xmlFile = new File(String.valueOf(url));
        saxParser.parse(is,handler);


    }
}
