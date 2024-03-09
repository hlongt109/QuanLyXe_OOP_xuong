/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package quanlyxe_oop_xuong;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Program {

    public static void main(String args[]) {
        QuanLyXe_OOP_Xuong quanLyXe = new QuanLyXe_OOP_Xuong();

        while (true) {
            Scanner sc = new Scanner(System.in);
            menu();
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Lua chon khong duoc de trong, vui long nhap lai");
                continue;
            }
            if (!Character.isDigit(input.charAt(0))) {
                System.out.println("Nhap sai lua chon vui long chon lai");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai lua chon vui long chon lai");
                continue;
            }
            
            switch (choice) {
                case 1:
                    System.out.println("Nhap sanh sach xe");
                    quanLyXe.nhapThongTin();
                    break;
                case 2:
                    quanLyXe.xuatThongTin();
                    break;
                case 3:
                    quanLyXe.timKiemTheoMa();
                    break;
                case 4:
                    quanLyXe.xoaXeTheoMa();
                    break;
                case 5:
                    quanLyXe.capNhatTheoMa();
                    break;
                case 6:
                    quanLyXe.timTheoKhoangGia();
                    break;
                case 7:
                    quanLyXe.sapXepTheoTen();
                    break;
                case 8:
                    quanLyXe.sapXepTheoGia();
                    break;
                case 9:
                    quanLyXe.topGiaCao();
                    break;
                case 10:
                    quanLyXe.timXeTheoHang();
                    break;
                case 11:
                    quanLyXe.xoaXeTheoHang();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chon sai chuc nang , chon lai (0 -> 9)");
            }
        }

    }

    private static void menu() {
        System.out.println("|========== Quan Ly Xe OOP Xuong ==========|");
        System.out.println("|1. Nhap danh sach xe                      |");
        System.out.println("|2. Xuat danh sach xe                      |");
        System.out.println("|3. Tim xe theo ma                         |");
        System.out.println("|4. Xoa xe theo ma                         |");
        System.out.println("|5. Cap nhat thong tin xe theo ma          |");
        System.out.println("|6. Tim xe theo khoang gia                 |");
        System.out.println("|7. Sap xep xe theo ten                    |");
        System.out.println("|8. Sap xep xe theo gia                    |");
        System.out.println("|9. Top 5 xe gia cao nhat                  |");
        System.out.println("|10.Tim cac xe theo hang                   |");
        System.out.println("|11.Xoa cac xe theo hang                   |");
        System.out.println("|0. Thoat                                  |");
        System.out.println("|==========================================|");
        System.out.print("Chon chuc nang : ");
    }
}
