package com.mqz.test;

public class varibleTest1 {
    public static void main(String[] args) {
        int attacked1 = 220 , attacked2 = 210;
        double hp1 = 1012.5 , hp2 = 1223.3;
        int fangyu1 = 100 , fangyu2 = 120;
        double skill1 = 1.2 , skill2 = 1.3;
        hp2 -= attacked1 * skill1 - fangyu2;
        hp2 -= attacked1 - fangyu2;
        System.out.println(hp2);
    }
}
