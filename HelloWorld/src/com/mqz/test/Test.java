package com.mqz.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 生产一个7位数的随机数 表示彩票号码
        int number = (int)(Math.random()*9000000) + 1000000;
        // 用户输入一个7位数的号码 作为用户彩票号码
        System.out.println("请输入7位数的彩票号码：");
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        if(number == userNumber){
            System.out.println("恭喜你，中奖了！");
        }else{
            System.out.println("很遗憾，没有中奖！");
        }
        System.out.println("中奖的彩票号码是："+number);
        System.out.println("用户输入的彩票号码是："+userNumber);
        System.out.println("程序结束！");
    }
}
