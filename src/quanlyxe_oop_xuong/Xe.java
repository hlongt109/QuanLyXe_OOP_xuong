/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyxe_oop_xuong;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public abstract class Xe {

    private String maXe;
    private String tenXe;
    private String hangXe;
    private Double gia;
    private String mauSac;
    private String trangThai;
    private String bienSo;
    private Integer odo;
    Scanner sc = new Scanner(System.in);

    public Xe(String maXe, String tenXe, String hangXe, Double gia, String mauSac, String bienSo, Integer odo, String trangThai) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.gia = gia;
        this.mauSac = mauSac;
        this.bienSo = bienSo;
        this.odo = odo;
        this.trangThai = trangThai;
    }

    public Xe(String maXe, String tenXe, String hangXe, Double gia, String mauSac, String trangThai) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.gia = gia;
        this.mauSac = mauSac;
        this.trangThai = trangThai;
    }

    public Xe() {
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public Integer getOdo() {
        return odo;
    }

    public void setOdo(Integer odo) {
        this.odo = odo;
    }

    public String checkStatus() {
        String tinhTrangXe = "";
        if (odo == null) {
            tinhTrangXe = getTrangThai();
        } else {
            if (odo < 200) {
                tinhTrangXe = "Xe moi";
            } else if (odo <= 8000) {
                tinhTrangXe = "Xe luot moi";
            } else if (odo <= 100000) {
                tinhTrangXe = "Xe cu tot";
            } else if (odo <= 150000) {
                tinhTrangXe = "Xe cu kha";
            } else if (odo > 150000) {
                tinhTrangXe = "Xe qua cu";
            }
        }
        return tinhTrangXe;
    }

    public void nhap() {
        System.out.print("Nhap ma xe : ");
        maXe = sc.nextLine();
        System.out.print("Nhap ten xe : ");
        tenXe = sc.nextLine();
        System.out.print("Nhap hang xe : ");
        hangXe = sc.nextLine();
        System.out.print("Nhap gia xe : ");
        gia = Double.valueOf(sc.nextLine());
        System.out.print("Nhap mau xe : ");
        mauSac = sc.nextLine();
    }

//    public void xuat() {
//        System.out.printf("Mã : %s | Tên : %s | Hãng : %s | Giá : %.2f | Màu : %s \n",
//                this.maXe, this.tenXe, this.hangXe, this.gia, this.maXe);
//        System.out.printf("Loại xe : %s | Biển số : %s | Odo : %d | Trạng Thái : %s",
//                this.loaiXe, this.bienSo, this.odo, this.checkStatus());
//    }
    
//    public void xuat() {
//        System.out.printf("Ma : %s | Ten : %s | Hang : %s | Gia : %.2f | Mau : %s | Trang thai : %s \n ",
//                this.maXe, this.tenXe, this.hangXe, this.gia, this.mauSac, checkStatus());
//    }
    
    public void xuat() {
    // Độ rộng của từng cột
    int maXeWidth = 10;
    int tenXeWidth = 15;
    int hangXeWidth = 15;
    int giaWidth = 10;
    int mauSacWidth = 10;
    int trangThaiWidth = 15;

    String formatString = String.format("|Ma : %%-%ds |Ten : %%-%ds |Hang : %%-%ds |Gia : %%-%ds |Mau : %%-%ds |Trang thai : %%-%ds | \n",
            maXeWidth, tenXeWidth, hangXeWidth, giaWidth, mauSacWidth, trangThaiWidth);

    System.out.printf(formatString, this.maXe, this.tenXe, this.hangXe, this.gia, this.mauSac, checkStatus());
}
}
