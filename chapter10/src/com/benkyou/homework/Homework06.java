package com.benkyou.homework;

public class Homework06 {
    public static void main(String[] args) {
        Person tangSeng = new Person("唐僧", new Horse());
        tangSeng.passRiver();
        tangSeng.common();
        tangSeng.passFireHill();
        tangSeng.passFireHill();
        tangSeng.passRiver();
        tangSeng.common();
    }
}

interface IVehicles {
    void work();
}

class Horse implements IVehicles {
    @Override
    public void work() {
        System.out.println("一般情况下,使用马儿前进.");
    }
}

class Boat implements IVehicles {
    @Override
    public void work() {
        System.out.println("过河的时候,使用小船前进.");
    }
}

class Airplane implements IVehicles {
    @Override
    public void work() {
        System.out.println("过火焰山的时候,使用飞机穿过.");
    }
}

class VehiclesFactory {
    // 将方法做成static

    // 马儿始终是同一匹
    private static Horse horse = new Horse();

    public static Horse getHorse() {
//        return new Horse();
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Airplane getAirplane() {
        return new Airplane();
    }

    private VehiclesFactory() {
    }
}

class Person {
    private String name;
    private IVehicles vehicles;

    public Person(String name, IVehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    // 把具体的要求封装成方法
    // 如何不浪费,在构建对象时,传入的交通工具对象
    public void common() {
        // 判断当前的 vehicles 属性是否为 null
        if (!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();
        }
        // 接口调用
        vehicles.work();
    }

    public void passRiver() {
        // 如何防止始终使用的是传入的马 instanceof
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void passFireHill() {
        if (!(vehicles instanceof Airplane)) {
            vehicles = VehiclesFactory.getAirplane();
        }
        vehicles.work();
    }
}