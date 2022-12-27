package com.tttea;

public abstract class Tea implements Consumable {
    String name = null;

    public Tea (String name) {
        this.name = name;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Tea)) return false; // Шаг 1
        if (name==null || ((Tea)arg0).name==null) return false; // Шаг 2
        return name.equals(((Tea)arg0).name); // Шаг 3
    }

    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
