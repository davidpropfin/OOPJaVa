import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import pgkInterface.INhapXuatDuLieu;
import pgkQuanLy.CongTy;
import pkgNhanSu.NhanVien;
import pkgNhanSu.TruongPhong;
import pkgNhanSu.GiamDoc;

public class TestInterface {

	public static void main(String[] args) {
		// Bên ngôn ngữ C, C++ 1 class có thể kế thừa nhiều class, hay 1 class có thể extends nhiều class
		// Bên Java đã bỏ khái niệm đa kế thừa, và thay thế bằng interface (Lớp thuần trừu tượng)
		// Interface cũng là class, class NhanSu cũng kế thừa (Bên Java gọi là thực thi-implement) inteface INhapXuatDuLieu
		// => Có thể dùng INhapXuatDuLieu như là kiểu class cha để áp dụng quy tắc đa hình đã học.
		INhapXuatDuLieu congty = new CongTy(); //tương tự CongTy congty = new CongTy();
		INhapXuatDuLieu nv = new NhanVien(); //tương tự NhanSu nv = new NhanVien();
		INhapXuatDuLieu tp = new TruongPhong();//Tương tự NhanSu tp = new TruongPhong();
		INhapXuatDuLieu gd = new GiamDoc(); //Tuong tự NhanSu gd = new GiamDoc();
		
		//Vì CongTy và NhanSu có Interface INhapXuatDuLieu chung, nên ta có thể tạo 1 cái list kiểu này để nối tụi nó lại
		LinkedList<INhapXuatDuLieu> list_if = new LinkedList<INhapXuatDuLieu>();
		list_if.add(congty);
		list_if.add(nv);
		list_if.add(tp);
		list_if.add(gd);
		
		//Khi gọi là, ta có thể dùng con trỏ interface để về mặt syntax, ta có thể gọi đến các hàm NhapDuLieu,XuatDuLieu
		//Mình đã tìm hiểu thêm, foreach trong Java có mã assembly là dùng iterator duyệt
		//Xem thêm: https://stackoverflow.com/questions/2113216/which-is-more-efficient-a-for-each-loop-or-an-iterator/2113299
		//Tuy nhiên nếu remove phần tử thì cẩn thận sẽ có sự khác biệt về hoạt động của con trỏ thế mạng
		for( INhapXuatDuLieu iter : list_if ) {
			iter.NhapDuLieu();
		}
		
		//Xuất dữ liệu,dùng iterator hoặc foreach bên linkedlist để lướt danh sách tốt hơn
		for( Iterator<INhapXuatDuLieu> iter = list_if.iterator(); iter.hasNext(); ) {
			INhapXuatDuLieu obj = iter.next();
			obj.XuatDuLieu();
		}
		
	}

}
