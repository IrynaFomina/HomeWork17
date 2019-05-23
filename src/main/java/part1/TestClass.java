package part1;

import java.io.Serializable;

public class TestClass implements Serializable {
    int intVal;
    String stringVal;


    public TestClass(int intVal, String stringVal) {
        this.intVal = intVal;
        this.stringVal = stringVal;
    }
}
