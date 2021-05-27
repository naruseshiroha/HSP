package com.benkyou.extend_;

import com.benkyou.extend_.improve_.Graduate;
import com.benkyou.extend_.improve_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil("银角",17,69);
        pupil.testing();
        System.out.println(pupil);
        Graduate graduate = new Graduate("金角",19,89);
        graduate.testing();
        System.out.println(graduate);
    }
}

