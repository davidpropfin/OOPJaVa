package pgkQuanLy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import pgkInterface.INhapXuatDuLieu;
import pkgNhanSu.E_ChucVu;
import pkgNhanSu.GiamDoc;
import pkgNhanSu.NhanSu;
import pkgNhanSu.NhanVien;
import pkgNhanSu.TruongPhong;

public class CongTy implements INhapXuatDuLieu {
	private String _ten_cong_ty;
	private String _ma_so_thue;
	private double _doanh_thu;
	private int _SLNV;
		
	private ArrayList<LinkedList<NhanSu>> _list_nv = new ArrayList<LinkedList<NhanSu>>();
	
	public double getDoanhThu() {
		return this._doanh_thu;
	}

	public int getSLNV() {
		return this._SLNV;
	}

	public void setSLNV(int new_SLNV) {
		this._SLNV = new_SLNV;
	}

	public void setTenCongTy(String new_ten) {
		this._ten_cong_ty = new_ten;
	}

	public void setMaSoThue(String new_MST) {
		this._ma_so_thue = new_MST;
	}

	public CongTy() {
		this._ten_cong_ty = "Chưa đặt tên";
		this._ma_so_thue = "";
		this._doanh_thu = 0;
		
		this._list_nv.add( new LinkedList<NhanSu>());//Danh sách nhân viên
		this._list_nv.add( new LinkedList<NhanSu>());//Danh sách trưởng phòng
		this._list_nv.add( new LinkedList<NhanSu>());//Danh sách giám đốc
	}
	
	public void NhapDuLieu() {
		System.out.println("Mời bạn nhập tên công ty:");
		this._ten_cong_ty = scan.nextLine();

		System.out.println("Mời bạn nhập mã số thuế:");
		this._ma_so_thue = scan.nextLine();

		System.out.println("Mời bạn nhập doanh thu:");
		this._doanh_thu = Double.parseDouble(scan.nextLine());
	}
	
	public void XuatDuLieu() {
		System.out.println("Tên công ty: " + this._ten_cong_ty);
		System.out.println("Tên mã số thuế: " + this._ma_so_thue);
		System.out.println("Doanh thu: " + this._doanh_thu);
	}
	
	public static void SoSanhDoanhThuHaiCongTy(CongTy cty_A, CongTy cty_B) {
		if(  cty_A._doanh_thu > cty_B._doanh_thu ) {
			cty_A.XuatDuLieu();
		}
		else {
			cty_B.XuatDuLieu();
		}
	}
	
	public void ThemNhanVienFakeData() {
		this._list_nv.get(E_ChucVu.NHAN_VIEN._value).add( new NhanVien( "Huy" , 1, 30, 5 ) );
		this._list_nv.get(E_ChucVu.NHAN_VIEN._value).add( new NhanVien( "Đạt" , 2, 20, 5 ) );
		this._list_nv.get(E_ChucVu.NHAN_VIEN._value).add( new NhanVien( "Nghĩa" , 3, 25, 4 ) );
		
		this._list_nv.get(E_ChucVu.TRUONG_PHUONG._value).add(new TruongPhong( "Hậu" , 4, 10 ) );
		this._list_nv.get(E_ChucVu.TRUONG_PHUONG._value).add(new TruongPhong("Thảo", 5, 15) );
		
		this._list_nv.get(E_ChucVu.GIAM_DOC._value).add( new GiamDoc( "Đạt" , 6, 5, 10));
		this._list_nv.get(E_ChucVu.GIAM_DOC._value).add( new GiamDoc( "Việt" , 7, 5, 40));
		this._list_nv.get(E_ChucVu.GIAM_DOC._value).add( new GiamDoc( "Lan" , 6, 5, 30));
		this._list_nv.get(E_ChucVu.GIAM_DOC._value).add( new GiamDoc( "Hùng" ,8, 10, 20));
		
		System.out.println("Đã thêm 7 nhân viên thành công");
	}
	
	public void ThemNhanVienMoi( Scanner scan ) {
		//Bước 1: Hỏi bạn muốn thêm chức vư nào?
		System.out.println("Mời bạn chọn chức vụ: 1-Nhân viên  2-Trưởng phòng  3-Giám đốc");
		int lua_chon = Integer.parseInt(scan.nextLine());
		
		NhanSu ns = null;
		int danh_sach_thuoc_ve = -1;
		switch (lua_chon) {
		case 1: //Thêm nhân viên
			ns = new NhanVien();	
			danh_sach_thuoc_ve = 0;
			break;
		case 2: //Thêm trưởng phòng
			ns = new TruongPhong();		
			danh_sach_thuoc_ve = 1;
			break;
		case 3: //Thêm giám đốc
			ns = new GiamDoc();			
			danh_sach_thuoc_ve = 2;
			break;
		default:
			break;
		}
		ns.NhapDuLieu();
		this._list_nv.get(danh_sach_thuoc_ve).add(ns);
	}
	
	public void XoaNhanVien(Scanner scan) {
		//Bước 1: Nhập mã nhân viên muốn xóa
		System.out.println("Mời bạn nhập mã người muốn xóa:");
		int ma_nv_can_xoa = Integer.parseInt(scan.nextLine());
		
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			
		}
		
		int length = this._list_nv.size();
		for( int i = 0 ; i < length; i++ ) {
			LinkedList<NhanSu> list_ns = this._list_nv.get(i);
			for( int j = 0; j < list_ns.size(); j++ ) {
				if( list_ns.get(j).getMaNV() == ma_nv_can_xoa) {
					list_ns.remove(j);
				}
			}
		}
	}
	
	public void XuatThongTinToanBoNguoiTrongCongTy() {
		System.out.println("DANH SÁCH TOÀN BỘ NGƯỜI TRONG CÔNG TY:");
		for( LinkedList<NhanSu> list_ns : this._list_nv ) {
			for( NhanSu ns : list_ns ) {
				ns.XuatDuLieu();
			}
		}
	}
	
	public GiamDoc TimGiamDocCoPhanNhieuNhat() {
		LinkedList<NhanSu> list_giam_doc = this._list_nv.get(E_ChucVu.GIAM_DOC._value);
		
		if( list_giam_doc.isEmpty() ) {
			return null;
		}
		
		//Thuật toán anh Sơn
		//Bước 1: Gán chỉ số cổ phần của thằng giám đốc đầu tiên là max
		GiamDoc gd_max = (GiamDoc)list_giam_doc.get(0);
		//Bước 2: Loop từ thằng thứ 1 đến cuối
		//Nếu cổ phần thằng thứ i > co_phan_max thì 
		//=> update co_phan_max = cổ phần của thằng i
		
		for ( Iterator<NhanSu> i_ns = list_giam_doc.iterator(); i_ns.hasNext() ; ) {
			GiamDoc gd_i = (GiamDoc)(i_ns.next());
			if( gd_i.getCoPhan() > gd_max.getCoPhan() ) {
				gd_max = gd_i;
			}
		}
		
		//Bước 3: trả về giám đốc max
		return gd_max;
	}
}
