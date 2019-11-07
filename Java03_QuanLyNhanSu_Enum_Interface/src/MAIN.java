import java.util.ArrayList;
import java.util.Scanner;

import pgkQuanLy.CongTy;
import pkgNhanSu.GiamDoc;
import pkgNhanSu.NhanSu;

public class MAIN {
	static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		CongTy cty_1 = new CongTy();
		
		do {
			System.out.println("MENU");
			System.out.println("0. Thoát");
			System.out.println("1. Nhập thông tin công ty");
			System.out.println("2. Thêm 1 nhân viên");
			System.out.println("3. Xóa 1 nhân viên theo mã số");
			System.out.println("4. Xuất thông tin toàn bộ người trong công ty");
			System.out.println("5. Tìm Giám đốc có cổ phần nhiều nhất");
			System.out.println("Mời bạn chọn:");
			int lua_chon = Integer.parseInt( scan.nextLine() );
			switch (lua_chon) {

			case 1:
				cty_1.NhapDuLieu();
				break;
			case 2:
				cty_1.ThemNhanVienFakeData();
				break;
			case 3:
				cty_1.XoaNhanVien(scan);
				break;
			case 4:
				cty_1.XuatThongTinToanBoNguoiTrongCongTy();
				break;
			case 5:
				GiamDoc gd_max = cty_1.TimGiamDocCoPhanNhieuNhat();
				if( gd_max == null ) {
					System.out.println("Công ty không có giám đốc");
				}
				else {
					System.out.println("Giám đốc có cổ phần cao nhất là: ");
					gd_max.XuatDuLieu();
				}
				break;
			default:
				break;
			}
			
			if( lua_chon == 0 )
				break;
			
			scan.nextLine();
		} while(true);
		
		System.out.println("Huy đẹp trai");
	}
	
	
}
