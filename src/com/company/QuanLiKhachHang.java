package com.company;

public class QuanLiKhachHang {
    private static int n = 1;
    private static String[][] arr = new String[7][n];
    //hàng 0:tên, 1:tuổi, 2:kiểu thuê, 3:số ngày, 4:tiền, 5:thời điểm, 6:lịch bơi

    public void nhapThongTin() {
        Customer obj = new Customer();
        obj.inputInfoKH();
        arr[0][0] = obj.name;
        arr[1][0] = String.valueOf(obj.age);
    }

    public void themKH() {
        n++;
        String[][] temp = new String[7][n];
        //sao chép sang mảng tạm
        for (int i=0; i<arr[0].length; i++){
            temp[0][i] = arr[0][i];
            temp[1][i] = arr[1][i];
        }
        Customer obj = new Customer();
        obj.inputInfoKH();
        temp[0][n - 1] = obj.name;
        temp[1][n - 1] = String.valueOf(obj.age);
        arr = temp;
    }

    public void hienThiMang() {
        System.out.println("=====Danh sách khách hàng=====");
        for (int i = 0; i < n; i++) {
            System.out.println("Khách hàng: " + arr[0][i] + ", tuổi: " + arr[1][i]);
            if (arr[2][i] != null && arr[3][i] != null && arr[4][i] != null && arr[5][i] != null) {
                System.out.println("Kiểu thuê: " + arr[2][i] + ", số ngày: " + arr[3][i] + ", tiền: " + arr[4][i] + "$, thời điểm : " + arr[5][i]);
            } else System.out.println("Chưa thuê nhà nghỉ");
            if (arr[6][i] != null) {
                System.out.println("Lịch đi bơi vào lúc: " + arr[6][i]);
            } else System.out.println("Chưa đặt lịch bơi");
            System.out.println();
        }
        System.out.println("===============================");
    }

    public void setArr() {
        ThuePhong tp = new ThuePhong();
        SwimmingPool sp = new SwimmingPool();
        arr[2][n-1] = tp.kieuThue;
        arr[3][n-1] = String.valueOf(tp.soNgay);
        arr[4][n-1] = String.valueOf(tp.tien);
        arr[5][n-1] = tp.thoiDiemThue;
        arr[6][n-1] = sp.lichDiBoi;
    }
}