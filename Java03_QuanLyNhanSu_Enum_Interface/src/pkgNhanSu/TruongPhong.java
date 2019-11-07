package pkgNhanSu;

public class TruongPhong extends NhanSu{
	protected int _so_luong_nv_duoi_quyen;
	public TruongPhong() {
		this._luong_1_ngay = 200;
	}
	
	public TruongPhong(String ho_ten_default, int ma_so_default, float so_ngay_lam_default) {
		super(ho_ten_default,ma_so_default,so_ngay_lam_default);
		this._luong_1_ngay = 200;
	}
	
	public void XuatDuLieu() { 
		System.out.println("Chức vụ: Trưởng phòng");
		super.XuatDuLieu();
		System.out.println("Số lượng nhân viên dưới quyền: " + this._so_luong_nv_duoi_quyen);
	}
}
