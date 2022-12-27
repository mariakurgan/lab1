package com.tttea;

public class greenTea extends Tea {

    public greenTea() {
        super("зеленый");
    }

    public void consume() {
        System.out.println(this + " готов");
    }
}
