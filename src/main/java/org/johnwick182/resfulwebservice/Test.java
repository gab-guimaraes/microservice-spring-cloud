package org.johnwick182.resfulwebservice;

public class Test {
    public static void main(String[] args) {
        System.out.println(recursiveMethod(5));

    }

    public static int recursiveMethod(int number) {
        if (number < 2) {
            return number;
        } else {
            return recursiveMethod(number - 1) + recursiveMethod(number -2);
        }
    }
}
