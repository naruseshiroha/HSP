package com.benkyou.abstract_;

public class BB extends Template {

    @Override
    public void job() {
        var sum = 0;
        for (int i = 1; i <= 10000000; i++) {
            sum -= i & 1;
        }
    }
}
