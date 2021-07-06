package com.benkyou.writer_;

import org.junit.Test;

public class Test_ {

    @Test
    public void testBuffered() {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFiles(10);
        bufferedReader_.readFile();

        BufferedReader_ bufferedReader_2 = new BufferedReader_(new StringReader_());
        bufferedReader_2.readStrings(5);
    }
}
