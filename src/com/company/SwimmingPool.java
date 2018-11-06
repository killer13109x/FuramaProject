package com.company;

import java.util.Scanner;

public class SwimmingPool {
    private final static int OPENTIME = 10;
    public static String timeSwimming, lichDiBoi;

    public static void displayOpenTime() {
        System.out.println("Hồ bơi mở cửa vào lúc " + OPENTIME + " giờ");
    }

    public static void datLichBoi() {
        int gio,phut;
        Scanner sc = new Scanner(System.in);
        String hour = "", minute = "";
        int index = -1;
        do {
            System.out.print("Thời gian bạn muốn đi bơi: ");
            timeSwimming = sc.next();
            for (int i = 0; i < timeSwimming.length(); i++) {
                if (timeSwimming.charAt(i) >= 48 && timeSwimming.charAt(i) <= 57) {
                    hour += timeSwimming.charAt(i);
                } else {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                for (int i = index + 1; i < timeSwimming.length(); i++) {
                    if (timeSwimming.charAt(i) >= 48 && timeSwimming.charAt(i) <= 57) {
                        minute += timeSwimming.charAt(i);
                    } else {
                        break;
                    }
                }
            }else minute = "0";
            gio = Integer.parseInt(hour);
            phut = Integer.parseInt(minute);
            while (phut >= 60) {
                gio += phut / 60;
                phut = phut % 60;
            }
            if (gio > 0 && gio <= 24) {
                if (gio >= 10) {
                    break;
                } else {
                    displayOpenTime();
                    System.out.println("Vui lòng đặt lịch lại");
                }
            } else {
                System.out.println("Ko hợp lệ");
            }
        } while (true);
        lichDiBoi = String.valueOf(gio) + " giờ " + String.valueOf(phut);
    }

    public static void displayLichBoi() {
        System.out.println("Lịch đi bơi lúc " + lichDiBoi);
    }
}