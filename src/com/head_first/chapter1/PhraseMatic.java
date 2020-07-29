package com.head_first.chapter1;

public class PhraseMatic {
    public void phraseGenerator() {

        int x = (int) 23.3;

        String[] wordListOne = {
                "Carol", "Miguel", "Valentin",
                "Juanga", "Juan", "Edgar"
        };

        String[] wordListTwo = {
                "tiene","es",
                "puede que sea","era",
                "va a ser","sigue siendo"
        };

        String[] wordListThree = {
                "restrasado", "listo",
                "grasa","problemas", "subnormal"
        };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);


        System.out.println(Math.random());
        System.out.println(wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]);
    }
}
