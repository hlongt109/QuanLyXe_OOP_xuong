/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlyxe_oop_xuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class QuanLyXe_OOP_Xuong {

    ArrayList<Xe> listXe = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    // nhap ds xe
    public void nhapThongTin() {
        while (true) {
            System.out.print("1. Car , 2. MotorBike, 3. Bicycle, 4. Bus, 5. Truck, 0. Exit  :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Car car = new Car();
                    car.nhap();
                    listXe.add(car);
                    break;
                case 2:
                    MotorBike mb = new MotorBike();
                    mb.nhap();
                    listXe.add(mb);
                    break;
                case 3:
                    Bicycle bc = new Bicycle();
                    bc.nhap();
                    listXe.add(bc);
                    break;
                case 4:
                    Bus bus = new Bus();
                    bus.nhap();
                    listXe.add(bus);
                    break;
                case 5:
                    Truck tk = new Truck();
                    tk.nhap();
                    listXe.add(tk);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Nhap sai moi chon lai");
                    continue;
                   
            }

            System.out.print("Co nhap xe nua khong ? (y or n) : ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    // xuat danh sach xe
    public void xuatThongTin() {
        System.out.println("-------------- Danh sach xe --------------");
        for (Xe xe : listXe) {
            xe.xuat();
        }
    }
    // tim theo ma
    public void timKiemTheoMa(){
        System.out.print("Nhap ma xe muon tim :");
        String ma = sc.nextLine();
        System.out.println("--------------- Thong tin xe muon tim ---------------");
        for (Xe xe : listXe) {
            listXe.indexOf(xe);
            if(xe.getMaXe().equalsIgnoreCase(ma)){
                xe.xuat();
            }
        }
    }
    // xoa theo ma
    public void xoaXeTheoMa(){
        System.out.print("Nhap ma xe muon xoa :");
        String ma = sc.nextLine();
        for (Xe xe : listXe) {
            if(ma.equalsIgnoreCase(xe.getMaXe())){
                listXe.remove(xe);
                break;
            }
        }
        xuatThongTin();
    }
    // cap nhat theo ma
    public void capNhatTheoMa(){
        System.out.print("Nhap ma xe muon cap nhat :");
        String ma = sc.nextLine();
        for (Xe xe : listXe) {
            if(xe.getMaXe().equalsIgnoreCase(ma)){
                System.out.println("------------ Cap nhat lai thong tin ------------");
                xe.nhap();
                xe.xuat();
            }
        }
    }
    // tim theo khoang gia
    public void timTheoKhoangGia(){
        System.out.println("--- Nhap vao khoang gia ban muon tim ---");
        System.out.print("Nhap min gia :");
        double giaMin = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap vao max gia :");
        double giaMax = Double.parseDouble(sc.nextLine());
        System.out.println("--- Danh sach xe co muc gia ban muon tim ---");
        for (Xe xe : listXe) {
            if(xe.getGia() >= giaMin && xe.getGia() <= giaMax){
                xe.xuat();
            }
        }
    }
    // sap xep theo ten
    public  void sapXepTheoTen(){
        Comparator<Xe> comp = (Xe o1, Xe o2) -> o1.getTenXe().compareTo(o2.getTenXe());
        Collections.sort(listXe,comp);
        System.out.println("---- Danh sach xe sap xep theo ten ----");
        xuatThongTin();
    }
    // sap xep theo gia
    public void sapXepTheoGia(){
        Comparator<Xe> comp = (Xe o1, Xe o2) -> o2.getGia().compareTo(o1.getGia());
        Collections.sort(listXe,comp);
        System.out.println("---- Danh sach xe sap xep theo gia ----");
        xuatThongTin();
    }
    // sap xep theo gia cach 2
    public void sapXepTheoGia_C2(){
        Comparator<Xe> comp = (Xe o1, Xe o2) -> {
            if(o1.getGia() < o2.getGia()){
                return 1;
            }
            return -1;
        };
        Collections.sort(listXe,comp);
    }
    // top 5 xe gia cao nhat
    public void topGiaCao(){
        sapXepTheoGia_C2();
        System.out.println("------ Top 5 xe gia cao nhat ------");
        if(listXe.size() < 5){
            for(int i = 0; i <listXe.size(); i++){
                listXe.get(i).xuat();
            }
        }else{
            for(int i = 0 ; i< 5; i++){
                listXe.get(i).xuat();
            }
        }
    }
}
