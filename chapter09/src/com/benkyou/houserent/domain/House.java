package com.benkyou.houserent.domain;

public class House {
    private int numberId;
    private String master;
    private String telephone;
    private String address;
    private int rent;
    private String state;

    public House() {
    }

    public House(int numberId, String master, String telephone, String address, int rent, String state) {
        this.numberId = numberId;
        this.master = master;
        this.telephone = telephone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getNumberId() {
        return numberId;
    }

    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return numberId + "\t\t"
                + master + "\t\t"
                + telephone + "\t"
                + address + "\t\t\t"
                + rent + "\t"
                + state;
    }
}
