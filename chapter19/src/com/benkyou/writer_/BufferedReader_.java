package com.benkyou.writer_;

public class BufferedReader_ extends Reader_ {

    private Reader_ reader_; // 属性是 Reader_

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void readFile() {
        reader_.readFile();
    }

    // 让方法更加灵活,多次读取文件
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    // 批量处理字符串数据
    public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
