package com.company;

import java.util.Scanner;

public class SwimmingPool {
    private final static int OPENTIME = 10;
    private static int timeSwimming;

    public static void displayOpenTime(){
        System.out.println("Hồ bơi mở cửa vào lúc " + OPENTIME + " giờ");
    }
    public static void goSwimming(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Thời gian bạn muốn đi bơi: ");
            timeSwimming = sc.nextInt();
            if (timeSwimming > 0 && timeSwimming <= 24){
                if (timeSwimming >= 10) {
                    break;
                }else {
                    displayOpenTime();
                    System.out.println("Vui lòng đặt lịch lại");
                }
            }else {
                System.out.println("Ko hợp lệ");
            }
        }while (true);
    }
    public static void lichBoi(){
        System.out.println("Lịch đi bơi lúc " + timeSwimming + " giờ");
    }
}
