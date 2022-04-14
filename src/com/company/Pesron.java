package com.company;

public class Pesron {

    private String Name;
    private int Age;
    private String Address;

    Pesron() {
        this.Name = "Ashton Cox";
        this.Age = 47;
        this.Address = "Roseville NH 11523";
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getAddress() {
        return Address;
    }
}

