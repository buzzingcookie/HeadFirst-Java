package com.head_first.chapter1;

public class MyFirstApp {

    public void firstApp() {

        // COMMENTS
        int x = 2;
        double y = Math.random();
        boolean Hungry = true;

        String name = "Kristof";

        System.out.println("Hello Javaian!");

        System.out.println("Random Sum:");
        System.out.println( x + y);

        System.out.println("WHILE LOOP:");
        while(x <= 10){
            System.out.println(x);
            x = x + 1;
        }

        System.out.println("FOR LOOP:");
        for(x = 0; x <= 10; x++){
            System.out.println(x);
        }

        if(name == "Kristof") {
            System.out.println("Hey there " + name + "!");
        }
        else {
            System.out.println("You are not Kristof!");
        }

        int a = 1;

        while(a <= 2) {
            System.out.print("DooBee");
            a = a + 1;
        }

        if(a == 3) {
            System.out.print("Do");
        }
    }
}
