package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ThuePhong thuePhong = new ThuePhong();
        Customer customer = new Customer();
        SwimmingPool swimmingPool = new SwimmingPool();
        QuanLi quanLi = new QuanLi();

        quanLi.nhapThongTinKH();
        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("\t0.Exit");
            System.out.println("\t1.Chọn loại căn hộ muốn thuê");
            System.out.println("\t2.Tư vấn số ngày có thể ở vs số tiền bất kì");
            System.out.println("\t3.Hiển thị danh sách Khách sạn");
            System.out.println("\t4.Đặt lịch đi bơi");
            System.out.println("\t5.Thêm khách hàng");
            System.out.println("\t6.Hiện thị danh sách KH");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Thank you for using our service!!!");
                    break;
                case 1:
                    System.out.println("\t1.Villa");
                    System.out.println("\t2.House");
                    int chonKieuThue = sc.nextInt();
                    switch (chonKieuThue) {
                        case 1:
                            quanLi.hienThiDanhSachKS("Villa");
                            System.out.println("Chọn căn hộ muốn thuê");
                            int chonVilla = sc.nextInt();
                            String thayDoiTinhTrangVilla = "được thuê bởi ";
                            thayDoiTinhTrangVilla += Customer.name;
                            if (chonVilla == 1) {
                                quanLi.setThuocTinhDS("Villa",0,3, thayDoiTinhTrangVilla);
                            }else if (chonVilla ==2){
                                quanLi.setThuocTinhDS("Villa",1,3, thayDoiTinhTrangVilla);
                            }else quanLi.setThuocTinhDS("Villa",2,3, thayDoiTinhTrangVilla);
                            thuePhong.tinhTien("Villa");
                            quanLi.setArrKH();
                            System.out.println("------------------------------");
                            customer.hienThiInfo();
                            thuePhong.thongTinThuePhong();
                            System.out.println("------------------------------");
                            break;
                        case 2:
                            quanLi.hienThiDanhSachKS("House");
                            System.out.println("Chọn căn hộ muốn thuê");
                            int chonHouse = sc.nextInt();
                            String thayDoiTinhTrangHouse = "được thuê bởi ";
                            thayDoiTinhTrangHouse += Customer.name;
                            if (chonHouse == 1) {
                                quanLi.setThuocTinhDS("House",0,3, thayDoiTinhTrangHouse);
                            }else {
                                quanLi.setThuocTinhDS("House",1,3, thayDoiTinhTrangHouse);
                            }
                            thuePhong.tinhTien("House");
                            quanLi.setArrKH();
                            System.out.println("------------------------------");
                            customer.hienThiInfo();
                            thuePhong.thongTinThuePhong();
                            System.out.println("------------------------------");
                            break;
                        default:
                            System.out.println("Ko hợp lệ");
                            break;
                    }
                    break;
                case 2:
                    thuePhong.tuVanSoNgayCoTheO();
                    break;
                case 3:
                    thuePhong.traCuuCanHo();
                    break;
                case 4:
                    swimmingPool.displayOpenTime();
                    swimmingPool.datLichBoi();
                    quanLi.setArrKH();
                    System.out.println("------------------------------");
                    swimmingPool.displayLichBoi();
                    System.out.println("------------------------------");
                    break;
                case 5:
                    quanLi.themKH();
                    break;
                case 6:
                    quanLi.hienThiMangKH();
                    break;
                default:
                    System.out.println("Ko hợp lệ");
                    break;
            }
        } while (choice != 0);
    }
}