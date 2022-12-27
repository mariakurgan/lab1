package com.tttea;

public class blackTea extends Tea {

    public blackTea() {
        super("черный");
    }

    public void consume() {
        System.out.println(this + " готов");
    }
}
