package com.company;

import java.util.Scanner;

public class Customer {
    public static String name;
    public static int age;

    public Customer(){
    }

    public static void inputInfoKH() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        name = name.toLowerCase();
        name = vietHoaTen(name);
        do {
            System.out.print("Nhập tuổi: ");
            age = sc.nextInt();
            if (age <= 0) {
                System.out.println("Lỗi");
            }else break;
        }while(true);
    }

    public static void hienThiInfo() {
        System.out.println("Khách hàng: " + name + ", tuổi: " + age);
    }

    public static String vietHoaTen(String ten) {
        char[] arr = ten.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[0] >= 97 && arr[0] <= 122) {
                    arr[0] -= 32;
                }
            } else {
                if (arr[i - 1] == ' ' && (arr[i] >= 97 && arr[i] <= 122)) {
                    arr[i] -= 32;
                }
            }
        }
        ten = "";
        for (int i = 0; i < arr.length; i++) {
            ten += arr[i];
        }
        return ten;
    }
}
