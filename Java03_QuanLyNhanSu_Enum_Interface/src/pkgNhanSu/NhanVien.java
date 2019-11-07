package pkgNhanSu;

import java.util.Scanner;

public class NhanVien extends NhanSu {
	protected int _ma_truong_phong_quan_ly;
	
	public int getMaTruongPhongQuanLy() {
		return this._ma_truong_phong_quan_ly;
	}
	
	public NhanVien() {
		this._luong_1_ngay = 100;
		this._ma_truong_phong_quan_ly = -1;
	}
	
	public NhanVien( String ho_ten_default, int ma_so_default, float so_ngay_lam_default, int ma_truong_phong_quan_ly_default ) {
		super( ho_ten_default,ma_so_default,so_ngay_lam_default );
		this._ma_truong_phong_quan_ly = ma_truong_phong_quan_ly_default;
		this._luong_1_ngay = 100;
	}
	
	public void NhapDuLieu() {
		super.NhapDuLieu();
		System.out.println("Mời bạn nhập mã trưởng phòng quản lý:");
		this._ma_truong_phong_quan_ly = Integer.parseInt(scan.nextLine());
	}
	
	public void XuatDuLieu() { 
		System.out.println("Chức vụ: Nhân viên");
		super.XuatDuLieu();
		System.out.println("Mã trưởng phòng quản lý: " + this._ma_truong_phong_quan_ly);
	}
}
