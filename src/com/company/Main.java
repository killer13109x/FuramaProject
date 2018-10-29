package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        ThuePhong thuePhong = new ThuePhong();
        SwimmingPool swimmingPool = new SwimmingPool();
        customer.inputInfoKH();
        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("\t0.Exit");
            System.out.println("\t1.Chọn loại căn hộ muốn thuê");
            System.out.println("\t2.Tư vấn thuê căn hộ");
            System.out.println("\t3.Tra cứu thông tin căn hộ");
            System.out.println("\t4.Đặt lịch đi bơi");
            System.out.println("\t5.Hiển thị thông tin khách hàng");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Thank you for using our service!!!");
                    break;
                case 1:
                    System.out.println("\t1.Villa");
                    System.out.println("\t2.House");
                    int chonCanho = sc.nextInt();
                    switch (chonCanho) {
                        case 1:
                            thuePhong.tienThueVilla();
                            System.out.println("------------------------------");
                            customer.hienThiInfo();
                            thuePhong.thongTinThuePhong();
                            System.out.println("------------------------------");
                            break;
                        case 2:
                            thuePhong.tienThueHouse();
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
                    thuePhong.tuVan();
                    break;
                case 3:
                    thuePhong.traCuuCanHo();
                    break;
                case 4:
                    swimmingPool.goSwimming();
                    System.out.println("------------------------------");
                    swimmingPool.lichBoi();
                    System.out.println("------------------------------");
                    break;
                case 5:
                    System.out.println("------------------------------");
                    customer.hienThiInfo();
                    thuePhong.thongTinThuePhong();
                    swimmingPool.lichBoi();
                    System.out.println("------------------------------");
                    break;
                default:
                    System.out.println("Ko hợp lệ");
                    break;
            }
        }while (choice != 0);
    }
}