package pkgNhanSu;

import java.util.Scanner;

public class GiamDoc extends NhanSu {
	protected float _co_phan;
	public GiamDoc() {
		this._luong_1_ngay = 300;
	}
	
	public float getCoPhan() {
		return this._co_phan;
	}
	
	public GiamDoc(String ho_ten_default, int ma_so_default, float so_ngay_lam_default, float co_phan_default) {
		super(ho_ten_default,ma_so_default,so_ngay_lam_default);
		this._co_phan = co_phan_default;
		this._luong_1_ngay = 300;
	}
	
	public void NhapDuLieu() {
		super.NhapDuLieu();
		System.out.println("Mời bạn nhập cổ phần:");
		this._co_phan = Float.parseFloat(scan.nextLine());
	}
	
	public void XuatDuLieu() { 
		System.out.println("Chức vụ: Giám đốc");
		super.XuatDuLieu();
		System.out.println("Số cổ phần: " + this._co_phan);
	}
}
