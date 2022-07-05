package org.mir.saleem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running");
        Processor p = new Processor();
        System.out.println(p.execute().toString());
    }
}
