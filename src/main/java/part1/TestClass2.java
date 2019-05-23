package part1;

import java.io.*;

public class TestClass2 implements Externalizable {
    String stringVal;
    int intVal;

    public TestClass2() {
    }

    public TestClass2(int intVal, String stringVal) {
        this.intVal = intVal;
        this.stringVal = stringVal;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(stringVal);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.stringVal = (String) in.readObject();
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }

    public void setStringVal(String stringVal) {
        this.stringVal = stringVal;
    }
}
