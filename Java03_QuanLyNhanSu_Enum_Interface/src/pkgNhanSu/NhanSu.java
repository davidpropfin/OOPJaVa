package pkgNhanSu;

import java.util.Scanner;

import pgkInterface.INhapXuatDuLieu;

public abstract class NhanSu implements INhapXuatDuLieu {
	protected int _ma_so;
	protected String _ho_ten;
	protected float _so_ngay_lam;
	protected float _luong_1_ngay;
	
	public int getMaNV() {
		return this._ma_so;
	}
	
	public NhanSu() {
		
	}
	
	public NhanSu( String ho_ten_default, int ma_so_default, float so_ngay_lam_default ) {
		this._ma_so = ma_so_default;
		this._ho_ten = ho_ten_default;
		this._so_ngay_lam = so_ngay_lam_default;
	}
	
	public void NhapDuLieu() {
		System.out.println("Nhập mã số: ");
		this._ma_so = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập họ tên:");
		this._ho_ten = scan.nextLine();
		System.out.println("Nhập số ngày làm:");
		this._so_ngay_lam = Float.parseFloat(scan.nextLine());
	}
	
	public void XuatDuLieu() {
		System.out.println("Mã số: " + this._ma_so );
		System.out.println("Họ tên: " + this._ho_ten );
		//System.out.println("Lương tháng: ") );
	}
}	
