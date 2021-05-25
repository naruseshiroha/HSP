package com.benkyou.oop.recursion;

public class Maze {
    public static void main(String[] args) {

        // 思路
        // 1.先创建迷宫,用二维数组表示 int[][] map = new int[8][7];
        // 2.先规定 map 数组的元素值: 0表示可以走, 1表示障碍物
        int[][] map = new int[8][7];
        // 3.将最上面的一行和最想面的一行,全部设置为1
        for (int i = 0; i < map[0].length; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        // 4.将最右面的一列和最左面的一列,全部设置为1
        for (int i = 1; i < map.length - 1; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1; //测试回溯

        for (int[] o : map) {
            for (int o1 : o) {
                System.out.print(o1 + " ");
            }
            System.out.println();
        }

        System.out.println("--------------");

        MouseMaze mouseMaze = new MouseMaze();
//        mouseMaze.findWay(map,1,1);
        mouseMaze.findWay2(map,1,1);

        for (int[] o : map) {
            for (int o1 : o) {
                System.out.print(o1 + " ");
            }
            System.out.println();
        }

    }
}

class MouseMaze {
    /*
      1.findWay 方法就是专门来找出迷宫的路径
      2.如果找到,就返回 true,否则返回 false
      3.map 就是二维数组,即表示迷宫
      4.(i,j) 就是老鼠的位置,初始化的位置为 (1,1)
      5.规定 map 数组的各个值的含义, 0 表示可以走, 1 表示障碍物, 2 表示可以走, 3 表示走过,但是走不通是死路
      6.当 map[6][5] = 2 就说明找到通路,就可以结束,否则继续找
      7.先确定老鼠找路策略 下->右-上->左
     */
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) return true;
        if (map[i][j] == 0) { // 当前这个位置0,说明表示可以走
            map[i][j] = 2;
            // 使用找路策略,来确定该位置是否真的可以走通
            if (findWay(map, i + 1, j)) {
                return true;
            } else if (findWay(map, i, j + 1)) {
                return true;
            } else if (findWay(map, i - 1, j)) {
                return true;
            } else if (findWay(map, i, j - 1)) {
                return true;
            } else {
                map[i][j] = 3;
                return false;
            }
        } else {
            return false;
        }

    }

    public boolean findWay2(int[][] map, int i, int j) {
        if (map[6][5] == 2) return true;
        if (map[i][j] == 0) { // 当前这个位置0,说明表示可以走
            map[i][j] = 2;
            // 使用找路策略,来确定该位置是否真的可以走通
            if (findWay(map, i - 1, j)) {
                return true;
            } else if (findWay(map, i, j + 1)) {
                return true;
            } else if (findWay(map, i + 1, j)) {
                return true;
            } else if (findWay(map, i, j - 1)) {
                return true;
            } else {
                map[i][j] = 3;
                return false;
            }
        } else {
            return false;
        }

    }
}