package part1;

import java.io.*;
//*1) придумать любую класс - сущность и наполнить ее тестовыми свойствами
//
//
//    сохранить ее в файл используя Serializable
//    считать из файла
//    сохранить в файл используя Externalizable
//    считать из файла*/

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        OutputStream os = new ByteArrayOutputStream();
        TestClass testClass = new TestClass(5,"test");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TestClass.txt"));
        oos.writeObject(testClass);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("TestClass.txt"));

        TestClass receivedObject = (TestClass) ois.readObject();
        ois.close();
        System.out.println(receivedObject.intVal + " " + receivedObject.stringVal);

        TestClass2 testClass2 = new TestClass2(6,"test2");

        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("TestClass2.txt"));
        oos2.writeObject(testClass2);
        oos2.close();

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("TestClass2.txt"));

        TestClass2 receivedObject2 = (TestClass2) ois2.readObject();
        ois2.close();
        System.out.println(receivedObject2.intVal + " " + receivedObject2.stringVal);


    }
}
