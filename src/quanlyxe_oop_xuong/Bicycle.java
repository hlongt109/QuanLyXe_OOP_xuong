/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyxe_oop_xuong;


/**
 *
 * @author PC
 */
public class Bicycle extends Xe {

    private String theLoai;

    public Bicycle(String theLoai, String maXe, String tenXe, String hangXe, Double gia, String mauSac, String trangThai) {
        super(maXe, tenXe, hangXe, gia, mauSac, trangThai);
        this.theLoai = theLoai;
    }

    public Bicycle() {
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap the loai xe dap : ");
        theLoai = sc.nextLine();
        System.out.print("Nhap trang thai xe : ");
        super.setTrangThai( sc.nextLine());
    }

}
