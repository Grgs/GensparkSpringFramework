package com.genspark.config;

public class Address implements Printable{
    private String city;
    private String state;
    private String country;

    public Address() {
        this("Columbus", "43210", "Ohio", "USA");
    }

    public Address(String city, String zipcode, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }
    public String toText() {
        return String.format("Address:%s, %s %s, %s.", city, state,zipcode, country);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    private String zipcode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
