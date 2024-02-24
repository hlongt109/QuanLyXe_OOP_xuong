/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyxe_oop_xuong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class MotorBike extends Xe {

    private String engineType;
    private Integer power;

    public MotorBike(String engineType, Integer power, String maXe, String tenXe, String hangXe, Double gia, String mauSac, String loaiXe, String bienSo, Integer odo, String trangThai) {
        super(maXe, tenXe, hangXe, gia, mauSac, bienSo, odo, trangThai);
        this.engineType = engineType;
        this.power = power;
    }

    public MotorBike() {
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap bien so xe : ");
        super.setBienSo(sc.nextLine());
        System.out.print("Nhap odo xe : ");
        super.setOdo(Integer.valueOf(sc.nextLine()));
        System.out.print("Nhap loai dong co :");
        engineType= sc.nextLine();
        System.out.print("Nhap ma luc xe (cc) :");
        power = Integer.valueOf(sc.nextLine());
    }
}
