/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyxe_oop_xuong;

/**
 *
 * @author PC
 */
public class Bus extends Xe {

    private String engine;
    private Integer seats;

    public Bus(String engine, Integer seats, String maXe, String tenXe, String hangXe, Double gia, String mauSac, String bienSo, Integer odo, String trangThai) {
        super(maXe, tenXe, hangXe, gia, mauSac, bienSo, odo, trangThai);
        this.engine = engine;
        this.seats = seats;
    }

    public Bus() {
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap bien so xe : ");
        super.setBienSo(sc.nextLine());
        System.out.print("Nhap odo xe : ");
        super.setOdo(Integer.valueOf(sc.nextLine()));
        System.out.print("Nhap loai dong co :");
        engine = sc.nextLine();
        System.out.print("Nhap so cho ngoi : ");
        seats = Integer.valueOf(sc.nextLine());
    }
}
