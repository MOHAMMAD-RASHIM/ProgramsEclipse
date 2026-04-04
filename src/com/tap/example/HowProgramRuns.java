package com.tap.example;

class Parent {
    static int staticVar = 10;   // Static variable

    int instanceVar = 20;        // Instance variable

    // Static block
    static {
        System.out.println("Parent Static Block Executed");
    }

    // Instance block
    {
        System.out.println("Parent Instance Block Executed");
    }

    // Constructor
    Parent() {
        System.out.println("Parent Constructor Executed");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Parent Static Method Called");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Parent Instance Method Called");
    }
}

class Child extends Parent {

    static int childStaticVar = 30;

    int childInstanceVar = 40;

    static {
        System.out.println("Child Static Block Executed");
    }

    {
        System.out.println("Child Instance Block Executed");
    }

    Child() {
        System.out.println("Child Constructor Executed");
    }

    static void childStaticMethod() {
        System.out.println("Child Static Method Called");
    }

    void childInstanceMethod() {
        System.out.println("Child Instance Method Called");
    }
}
/*
 
	Order:
	1. Parent instance variable
	2. Parent instance block
	3. Parent constructor
	4. Child instance variable
	5. Child instance block
	6. Child constructor
 */
public class HowProgramRuns{
    public static void main(String[] args) {

        System.out.println("Main Method Started");

//        Child.childStaticMethod(); // static method call

        Child obj = new Child();   // object creation

        obj.instanceMethod();     // inherited method
        obj.childInstanceMethod();

        System.out.println("Main Method Ended");
    }
}