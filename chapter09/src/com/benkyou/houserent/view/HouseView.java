package com.benkyou.houserent.view;

import com.benkyou.houserent.domain.House;
import com.benkyou.houserent.service.HouseService;
import com.benkyou.houserent.utils.Utility;

public class HouseView {

    private boolean loop = true;
    private static int numberId = 1;
    private HouseService houseService = new HouseService(2);

    public void mainMenu() {
        do {
            System.out.print("""
                    ----------房屋出租系统----------
                    \t\t1 新 增 房 源
                    \t\t2 查 找 房 源
                    \t\t3 删 除 房 屋
                    \t\t4 修 改 房 屋 信 息
                    \t\t5 房 屋 列 表
                    \t\t6 退      出
                    请输入您的操作(1-6)
                    """);
            char key = Utility.readChar();
            switch (key) {
                case '1' -> {
                    addHouse();
                    listHouse();
                }
                case '2' -> {
                    getHouse();
                    listHouse();
                }
                case '3' -> {
                    deleteHouse();
                    listHouse();
                }
                case '4' -> {
                    updateHouse();
                    listHouse();
                }
                case '5' -> listHouse();
                case '6' -> exit();
            }
        } while (loop);
    }

    public void listHouse() {
        System.out.print("""
                ----------房屋列表开始----------
                编号\t\t房主\t\t电话\t\t\t地址\t\t\t月租\t\t状态(未出租,已出租)
                """
        );
        for (House house : houseService.list()) {
            if (house == null) break;
            System.out.println(house);
        }
        System.out.println("---------房屋列表结束----------");
    }

    public void addHouse() {
        System.out.println("----------添加房屋----------");
        System.out.print("姓名:");
        String master = Utility.readString(5, "keySha");
        System.out.print("电话:");
        String telephone = Utility.readString(11, "12345678910");
        System.out.print("地址:");
        String address = Utility.readString(11, "123");
        System.out.print("月租:");
        int rent = Utility.readInt(2333);
        System.out.print("状态(未出租/已出租):");
        String state = Utility.readString(3, "未出租");
        House house = new House(1, master, telephone, address, rent, state);
        String msg = houseService.add(house) ? "添加成功" : "添加失败";
        System.out.println(msg);
        System.out.println("----------添加完成----------");
    }

    public void deleteHouse() {
        System.out.println("----------删除房屋----------");
        System.out.print("请选择删除房屋编号(-1退出):");
        int numberId = Utility.readInt(-1);
        if (numberId == -1) return;
        System.out.println("确认是否删除(Y/N):请小心选择");
        char flag = Utility.readConfirmSelection();
        if (flag == 'Y') {
            String msg = houseService.delete(numberId) ? "删除成功" : "删除失败";
            System.out.println(msg);
        } else {
            return;
        }
        System.out.println("----------删除完成----------");
    }

    public void updateHouse() {
        System.out.println("----------修改房屋信息----------");
        System.out.print("请输入要修改的numberId(-1表示退出):");
        int numberId = Utility.readInt();
        if (numberId == -1) return;
        House house = houseService.getHouse(numberId);
        System.out.printf("姓名%s:", house.getMaster());
        String master = Utility.readString(5, "");
        if (!"".equals(master)) house.setMaster(master);
        System.out.printf("电话%s:", house.getTelephone());
        String telephone = Utility.readString(11, "");
        if (!"".equals(telephone)) house.setTelephone(telephone);
        System.out.printf("地址%s:", house.getAddress());
        String address = Utility.readString(20, "");
        if (!"".equals(address)) house.setAddress(address);
        System.out.printf("月租%s:", house.getRent());
        int oldRent = house.getRent();
        int rent = Utility.readInt(oldRent);
        if (rent != oldRent) house.setRent(rent);
        System.out.printf("状态%s:", house.getState());
        String state = Utility.readString(3, "");
        if (!"".equals(state)) house.setState(state);
        if (houseService.updateHouse(house)) {
            System.out.println("修改成功");
        } else {
            System.out.println("不存在");
        }
        System.out.println("----------修改房屋完成----------");
    }

    public void getHouse() {
        System.out.println("----------查找房屋信息----------");
        System.out.print("请输入查找的numberId:");
        int numberId = Utility.readInt();
        House house = houseService.getHouse(numberId);
        if (house != null) System.out.println(house);
        else System.out.println("numberId:" + numberId + "房屋不存在");
        System.out.println("----------查找房屋完成----------");
    }

    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }
}
