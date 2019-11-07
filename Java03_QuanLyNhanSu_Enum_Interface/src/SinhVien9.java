
public class SinhVien9 {
int rolno;
String nameString;
static String college="caodang";
static void change() {
	college="daihoc";
}
SinhVien9(int r,String n){
	this.rolno=r;
	this.nameString=n;
	
}
void display() {
	System.out.println(rolno+" "+nameString+" "+college);
}
	public static void main(String[] args) {
		change();
		SinhVien9 s1=new SinhVien9(111,"hoang1");
		SinhVien9 s2=new SinhVien9(222,"hoang2");
		SinhVien9 s3=new SinhVien9(333,"hoang3");
		s1.display();
		s2.display();
		s3.display();

	}

}
