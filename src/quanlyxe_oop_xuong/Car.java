/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyxe_oop_xuong;

/**
 *
 * @author PC
 */
public class Car extends Xe {

    private String engineType;
    private Integer door;
    private Integer seats;

    public Car(String engineType, Integer door, Integer seats, String maXe, String tenXe, String hangXe, Double gia, String mauSac, String loaiXe, String bienSo, Integer odo, String trangThai) {
        super(maXe, tenXe, hangXe, gia, mauSac, bienSo, odo, trangThai);
        this.engineType = engineType;
        this.door = door;
        this.seats = seats;
    }

    public Car() {
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap bien so xe : ");
        super.setBienSo(sc.nextLine());
        System.out.print("Nhap odo xe : ");
        super.setOdo(Integer.valueOf(sc.nextLine()));
        System.out.print("Nhap loai dong co : ");
        engineType = sc.nextLine();
        System.out.print("Nhap so door : ");
        door = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap so cho ngoi : ");
        seats = Integer.valueOf(sc.nextLine());
    }

}
