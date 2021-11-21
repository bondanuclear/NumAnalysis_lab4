package com;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

//    public static double funcF(int x) {
//        return Math.pow(x,18) - Math.pow(x,16) + 4*Math.pow(x,15);
//    }
//public static long powerN(long number, int power){
//    long res = 1;
//    long sq = number;
//    while(power > 0){
//        if(power % 2 == 1){
//            res *= sq;
//        }
//        sq = sq * sq;
//        power /= 2;
//    }
//    return res;
//}
    public static BigInteger func(BigInteger x) {
        return (x.pow(18).multiply(BigInteger.valueOf(2)).subtract(x.pow(16))).add(x.pow(15).multiply(BigInteger.valueOf(4)));
    }
    static void diffTable(int n, BigInteger y[][], BigInteger x[]) {
        for(int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                y[j][i] = (y[j][i - 1].subtract(y[j+1][i-1])).divide((x[j].subtract(x[i + j])));
                //System.out.println(y[j][i]);
            }

        }
    }
    static void printDiffTable(BigInteger y[][],int n)
    {
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.HALF_UP);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                String str1 = df.format(y[i][j]);
                System.out.print(str1+"  ");
            }
            System.out.println("");
        }
    }
//    public static long funct(long x) {
//        return  2*powerN(x,18) - powerN(x,16) +4*powerN(x,15);
//    }
    public static void main(String[] args) {
        ArrayList<BigInteger> storeArray = new ArrayList<>();
        for(BigInteger i = BigInteger.ZERO; i.compareTo(BigInteger.valueOf(13)) < 0; i =i.add(BigInteger.ONE)) {
            storeArray.add(func(i));
            //System.out.println(i);
        }
//        ArrayList<Long> storeArray = new ArrayList<>();
//        for(long i = 0; i < 13; i++) {
//            storeArray.add(funct(i));
//        }
        for (int i = 0; i < storeArray.size(); i++) {
            System.out.println("y("+i+") = " + storeArray.get(i));
        }
        int n = 13;
        BigInteger y[][] = new BigInteger[20][20];
        BigInteger x[] = {BigInteger.valueOf(0),BigInteger.valueOf(1),BigInteger.valueOf(2)
                ,BigInteger.valueOf(3),BigInteger.valueOf(4),
                BigInteger.valueOf(5),BigInteger.valueOf(6),BigInteger.valueOf(7),
                BigInteger.valueOf(8),BigInteger.valueOf(9),BigInteger.valueOf(10),BigInteger.valueOf(11),BigInteger.valueOf(12)};
        for(int i = 0; i < storeArray.size(); i++) {
            y[i][0] = storeArray.get(i);
            //System.out.println(y[i][0]);
        }
        System.out.println("===============================================");
        //diffTable(n, y, x );
        //printDiffTable(y,n);
        //test.testF();
        polynom.run();
    }
}
