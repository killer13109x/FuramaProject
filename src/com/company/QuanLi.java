package com.company;

public class QuanLi {
    private static int n = 1; //tổng số khách hàng
    //quản lí khách hàng
    //hàng 0:tên, 1:tuổi, 2:kiểu thuê, 3:số ngày, 4:tiền, 5:thời điểm, 6:lịch bơi
    private static String[][] arr = new String[7][n];

    //quản lí khách sạn
    //cột 0:tên     1:số giường     2:số hồ bơi     3:tình trạng thuê;     mỗi hàng là 1 đối tượng
    public static String[][] arrVilla = {
            {"Villa 1", "3", "2", "còn trống"},
            {"Villa 2", "4", "1", "còn trống"},
            {"Villa 3", "2", "1", "còn trống"},
    };
    public static String[][] arrHouse = {
            {"House 1", "2", "1", "còn trống"},
            {"House 2", "3", "0", "còn trống"},
    };

    public void nhapThongTinKH() {
        Customer obj = new Customer();
        obj.inputInfoKH();
        arr[0][0] = obj.name;
        arr[1][0] = String.valueOf(obj.age);
    }

    public void themKH() {
        n++;
        String[][] temp = new String[7][n];
        //sao chép sang mảng tạm
        for (int i=0; i<n-1; i++){
            temp[0][i] = arr[0][i];
            temp[1][i] = arr[1][i];
            temp[2][i] = arr[2][i];
            temp[3][i] = arr[3][i];
            temp[4][i] = arr[4][i];
            temp[5][i] = arr[5][i];
            temp[6][i] = arr[6][i];
        }
        Customer obj = new Customer();
        obj.inputInfoKH();
        temp[0][n - 1] = obj.name;
        temp[1][n - 1] = String.valueOf(obj.age);
        arr = temp;
    }

    public void hienThiMangKH() {
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

    public void setArrKH() {
        ThuePhong tp = new ThuePhong();
        SwimmingPool sp = new SwimmingPool();
        arr[2][n-1] = tp.kieuThue;
        arr[3][n-1] = String.valueOf(tp.soNgay);
        arr[4][n-1] = String.valueOf(tp.tien);
        arr[5][n-1] = tp.thoiDiemThue;
        arr[6][n-1] = sp.lichDiBoi;
    }

    public void hienThiDanhSachKS(String s) {
        if (s.equals("Villa")){
            for (int i=0; i<arrVilla.length; i++){
                System.out.println((i+1)+ ". " + arrVilla[i][0] + ", số giường: " + arrVilla[i][1] + ", số hồ bơi: " + arrVilla[i][2] + ", tình trạng: " + arrVilla[i][3]);
            }
        }else if (s.equals("House")){
            for (int i=0; i<arrHouse.length; i++){
                System.out.println((i+1) + ". " +  arrHouse[i][0] + ", số giường: " + arrHouse[i][1] + ", số hồ bơi: " + arrHouse[i][2] + ", tình trạng: " + arrHouse[i][3]);
            }
        }else {
            System.out.println("=====VILLA=====");
            for (int i=0; i<arrVilla.length; i++){
                System.out.println("Tên: " + arrVilla[i][0] + ", số giường: " + arrVilla[i][1] + ", số hồ bơi: " + arrVilla[i][2] + ", tình trạng: " + arrVilla[i][3]);
            }
            System.out.println("=====HOUSE=====");
            for (int i=0; i<arrHouse.length; i++){
                System.out.println("Tên: " + arrHouse[i][0] + ", số giường: " + arrHouse[i][1] + ", số hồ bơi: " + arrHouse[i][2] + ", tình trạng: " + arrHouse[i][3]);
            }
        }
    }
    public void setThuocTinhDS(String kieu,int hang, int cot, String thayDoi){
        if (kieu.equals("Villa")){
            arrVilla[hang][cot] = thayDoi;
        }else arrHouse[hang][cot] = thayDoi;
    }
}