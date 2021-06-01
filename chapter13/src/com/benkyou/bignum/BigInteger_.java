package com.benkyou.bignum;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("23333333333333333333333333");
        BigInteger bigInteger1 = new BigInteger("23333333333333333333333333");
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);

        BigDecimal bigDecimal = new BigDecimal("2333333333333333333333.3333");
        BigDecimal bigDecimal1 = new BigDecimal("2333333333333333333333.3333");
        BigDecimal add2 = bigDecimal.add(bigDecimal1);
        System.out.println(add2);
        BigDecimal subtract2 = bigDecimal.subtract(bigDecimal1);
        System.out.println(subtract2);
        BigDecimal multiply2 = bigDecimal.multiply(bigDecimal1);
        System.out.println(multiply2);
        BigDecimal divide2 = bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_CEILING);
        System.out.println(divide2);

    }
}
