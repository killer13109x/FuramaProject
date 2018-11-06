package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThuePhong {
    private final static int GIAVILLA = 10, GIAHOUSE = 5;
    public static int soNgay, tien;
    public static String kieuThue = "chưa xác định", thoiDiemThue = "chưa xác định";
    public static void traCuuCanHo() {
        QuanLi quanLi = new QuanLi();
        System.out.println("Giá tiền thuê: Villa là "+ GIAVILLA + "$/ngày và House là " + GIAHOUSE + "$/ngày");
        quanLi.hienThiDanhSachKS("all");
    }

    public static int tinhTien(String s) {
        kieuThue = s;
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        thoiDiemThue = formatter.format(date);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số ngày muốn thuê: ");
            soNgay = sc.nextInt();
            if (soNgay > 0) break;
            else System.out.println("Ko hợp lệ");
        } while (true);
        if (s.equals("Villa")) {
            tien = soNgay * GIAVILLA;
            return tien;
        }else {
            tien = soNgay * GIAHOUSE;
            return tien;
        }
    }

    public static void tuVanSoNgayCoTheO() {
        Scanner sc = new Scanner(System.in);
        int money;
        do {
            System.out.print("Nhập số tiền bạn có (USD): ");
            money = sc.nextInt();
            if (money > 0) break;
            else System.out.println("Ko hợp lệ");
        } while (true);
        int timeInVilla, timeInHouse;
        if (money % GIAVILLA == 0) {
            timeInVilla = money / GIAVILLA;
            System.out.println("Bạn có thể ở dc trong Villa " + timeInVilla + " ngày");
        } else {
            timeInVilla = money / GIAVILLA;
            int tienThua = money % GIAVILLA;
            System.out.println("Bạn có thể ở dc trong Villa " + timeInVilla + " ngày và thừa " + tienThua + "$");
        }
        System.out.println("Hoặc");
        if (money % GIAHOUSE == 0) {
            timeInHouse = money / GIAHOUSE;
            System.out.println("Bạn có thể ở dc trong House " + timeInHouse + " ngày");
        } else {
            timeInHouse = money / GIAHOUSE;
            int tienThua = money % GIAHOUSE;
            System.out.println("Bạn có thể ở dc trong House " + timeInHouse + " ngày và thừa " + tienThua + "$");
        }
    }

    public static void thongTinThuePhong() {
        System.out.println("Loại hình muốn thuê: " + kieuThue + ", thời gian thuê: " + soNgay + " ngày, số tiền phải trả: " + tien + "$");
        System.out.println("Thời điểm thuê: " + thoiDiemThue);
    }

}
