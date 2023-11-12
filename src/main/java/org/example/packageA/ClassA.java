package org.example.packageA;
import org.example.packageB.ClassB;

public class ClassA {
    public String methodA() {
        ClassB b = new ClassB();
        return "ClassA.methodA -> " + b.methodB();
    }
}
