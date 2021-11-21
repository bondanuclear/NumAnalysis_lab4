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
    }
}
