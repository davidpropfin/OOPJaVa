package pkgNhanSu;

public enum E_ChucVu {
	NHAN_VIEN(0),
	TRUONG_PHUONG(1),
	GIAM_DOC(2);
	
	public int _value; //Bên Java Index của enum không tự hiểu từ 0,1,2 như dòng họ C, nên ta phải lưu thuộc tính cho nó
	
	//muốn dòng 4,5,6 không lỗi, thì phải viết constructor cho enum
	private E_ChucVu( int value ) { //Xem cách gọi ENUM ở bên class CongTy, hàm ThemNhanVienFakeData
		this._value = value; //Gọi Enum dòng 4 sẽ tạo giá trị 0, dòng 5 tạo giá trị 1
	}
}
