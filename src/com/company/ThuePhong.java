package com.company;

import java.util.Scanner;

public class ThuePhong {
    private final static int VILLA = 10, HOUSE = 5;
    private final static int GIUONGVILLA = 1, GIUONGHOUSE = 4;
    private static int soNgay, tien;
    private static String kieuThue = "chưa xác định";

    public static void traCuuCanHo() {
        System.out.println("Loại hình thuê: Villa, mỗi phòng có: " + GIUONGVILLA + " giường, giá tiền: " + VILLA + "$/h");
        System.out.println("Loại hình thuê: House, mỗi phòng có: " + GIUONGHOUSE + " giường, giá tiền: " + HOUSE + "$/h");
    }

    public static int tienThueVilla() {
        kieuThue = "Villa";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số ngày muốn thuê: ");
            soNgay = sc.nextInt();
            if (soNgay > 0) break;
            else System.out.println("Ko hợp lệ");
        } while (true);
        tien = soNgay * VILLA;
        return tien;
    }

    public static int tienThueHouse() {
        kieuThue = "House";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số ngày muốn thuê: ");
            soNgay = sc.nextInt();
            if (soNgay > 0) break;
            else System.out.println("Ko hợp lệ");
        } while (true);
        tien = soNgay * HOUSE;
        return tien;
    }

    public static void tuVan() {
        Scanner sc = new Scanner(System.in);
        int money;
        do {
            System.out.print("Nhập số tiền bạn có (USD): ");
            money = sc.nextInt();
            if (money > 0) break;
            else System.out.println("Ko hợp lệ");
        } while (true);
        int timeInVilla, timeInHouse;
        if (money % VILLA == 0) {
            timeInVilla = money / VILLA;
            System.out.println("Bạn có thể ở dc trong Villa " + timeInVilla + " ngày");
        } else {
            timeInVilla = money / VILLA;
            int tienThua = money % VILLA;
            System.out.println("Bạn có thể ở dc trong Villa " + timeInVilla + " ngày và thừa " + tienThua + "$");
        }
        System.out.println("Hoặc");
        if (money % HOUSE == 0) {
            timeInHouse = money / HOUSE;
            System.out.println("Bạn có thể ở dc trong House " + timeInHouse + " ngày");
        } else {
            timeInHouse = money / HOUSE;
            int tienThua = money % HOUSE;
            System.out.println("Bạn có thể ở dc trong House " + timeInHouse + " ngày và thừa " + tienThua + "$");
        }
    }

    public static void thongTinThuePhong() {
        System.out.println("Loại hình muốn thuê: " + kieuThue + ", thời gian thuê: " + soNgay + " ngày, số tiền phải trả: " + tien + "$");
    }
}
