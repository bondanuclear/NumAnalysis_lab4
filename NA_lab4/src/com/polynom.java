package com;

import java.math.BigInteger;
import java.util.ArrayList;

public class polynom {
    public static BigInteger funcPol(BigInteger x) {
        return (x.pow(18).multiply(BigInteger.valueOf(2)).add(x.pow(15))).add(x.pow(13).multiply(BigInteger.valueOf(3)));
    }
    public static void run() {
        ArrayList<BigInteger> storeArray = new ArrayList<>();
        for(BigInteger i = BigInteger.ZERO; i.compareTo(BigInteger.valueOf(14)) < 0; i =i.add(BigInteger.ONE)) {
            storeArray.add(funcPol(i));
            //System.out.println(i);
        }
//        ArrayList<Long> storeArray = new ArrayList<>();
//        for(long i = 0; i < 13; i++) {
//            storeArray.add(funct(i));
//        }
        for (int i = 0; i < storeArray.size(); i++) {
            System.out.println("y("+i+") = " + storeArray.get(i));
        }
        System.out.println("===================================================");
        for(BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(14)) < 0; i =i.add(BigInteger.ONE)) {
            for(BigInteger j = BigInteger.ONE; j.compareTo(BigInteger.valueOf(14)) < 0; j =j.add(BigInteger.ONE)) {
                System.out.println(i + "^" + j + " = " + i.pow(j.intValue()));
            }
        }
        System.out.println("1 0 0 0 0 0 0 0 0 0 0 0 0 0  0");
        for(BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(14)) < 0; i =i.add(BigInteger.ONE)) {
            System.out.print("1 ");
            for(BigInteger j = BigInteger.ONE; j.compareTo(BigInteger.valueOf(14)) < 0; j =j.add(BigInteger.ONE)) {
                System.out.print(i.pow(j.intValue()) + " " );
            }
            System.out.println(" " + storeArray.get(i.intValue()));
        }
    }
}
