package com.benkyou.houserent.service;

import com.benkyou.houserent.domain.House;

public class HouseService {

    public int numberId = 1;
    private int houseNums = 1;
    private House[] houses;

    public HouseService() {
    }

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "tom", "18670246233", "乡下", 2000, "未出租");
    }

    public House[] list() {
        return houses;
    }

    public boolean add(House house) {
        if (houseNums == houses.length) return false;
        house.setNumberId(++numberId);
        houses[houseNums++] = house;
        return true;
    }

    public boolean delete(int numberId) {
        int index = -1;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getNumberId() == numberId) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        if (houseNums - 1 - index >= 0) System.arraycopy(houses, index + 1, houses, index, houseNums - 1 - index);
//        for (int i = index; i < houseNums - 1; i++) {
//            houses[i] = houses[i + 1];
//        }
        houses[--houseNums] = null;
        return false;
    }

    public House getHouse(int numberId) {
        for (House house : houses) {
            if (house.getNumberId() == numberId) {
                return house;
            }
        }
        return null;
    }

    public boolean updateHouse(House house) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getNumberId() == house.getNumberId()) {
                houses[i] = house;
                return true;
            }
        }
        return false;
    }
}
