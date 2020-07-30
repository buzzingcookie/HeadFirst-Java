package com.head_first.chapter2;

public class Movie {

    public String title;
    public String genre;
    public int rating;

    public void playIt() {
        System.out.print("Playing the movie " + this.title);
    }
}
