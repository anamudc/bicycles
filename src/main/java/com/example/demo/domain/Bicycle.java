package com.example.demo.domain;

public class Bicycle {

    Long id;
    String type;
    String serial;
    String brand;

    public Bicycle(Long id, String type, String serial, String brand) {
        this.id = id;
        this.type = type;
        this.serial = serial;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
