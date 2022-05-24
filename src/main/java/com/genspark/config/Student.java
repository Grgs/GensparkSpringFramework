package com.genspark.config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student implements Printable {
    private int id;
    private String name;
    private Address address;

    private List<Phone> ph;

    public Student() {
        this(0, "null", new Address(),  new ArrayList<>(List.of(new Phone[]{new Phone()})));
    }

    public Student(int id, String name, Address address, List<Phone> ph) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ph = ph;
    }

    @Override
    public String toText() {
        return String.format("Student:id=%d, name='%s', address=%s, ph=%s", id, name, address.toText(), ph.stream().
                map(Phone::toText).collect(Collectors.toList()));
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", ph=" + ph +
                '}';
    }
}
