package com.genspark.config;

public class Phone implements Printable{
    private String mob;

    public Phone() {
        this("0");
    }

    public Phone(String mob) {
        this.mob = mob;
    }

    public String toText() {
        return String.format("Phone#'%s'", mob);
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
