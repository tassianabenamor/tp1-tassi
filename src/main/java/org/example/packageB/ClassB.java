package org.example.packageB;
import org.example.packageC.ClassC;

public class ClassB {
    public String methodB() {
        ClassC c = new ClassC();
        return "ClassB.methodB -> " + c.methodC();
    }
}
