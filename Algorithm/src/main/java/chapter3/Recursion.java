package main.java.chapter3;

public class Recursion {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
        greet2(name);
        System.out.println("getting ready to say bye...");
        bye();
    }

    public static void greet2(String name) {
        System.out.println("How are you, " + name + "?");
    }

    public static void bye() {
        System.out.println("ok bye !!");
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }

    public static void main(String[] args) {
        greet("Coma");
        System.out.println(factorial(3));
    }
}
