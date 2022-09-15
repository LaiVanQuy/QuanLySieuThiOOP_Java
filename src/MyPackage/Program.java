package MyPackage;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;
public class Program {
	public static List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
	public static List<NhomNV> dsNhom = new ArrayList<NhomNV>();
	public static List<HangHoa> dsHangHoa = new ArrayList<HangHoa>();
	public static List<NhomKH> dsNhomKhachHang = new ArrayList<NhomKH>();
	public static List<KhachHang> dsKhachHang = new ArrayList<KhachHang>();

	public static List<NhaCungCap> dsNhaCungCap = new ArrayList<NhaCungCap>();
	public static List<LuongNhanVien> dsLuongNhanVien = new ArrayList<LuongNhanVien>();
	public static void DsNhom()
	{
		dsNhom.add(new NhomNV("100", "Bao Ve", new ArrayList<NhanVien>(), new NhanVien()));
		dsNhom.add(new NhomNV("101", "Ban Hang", new ArrayList<NhanVien>(), new NhanVien()));
		dsNhom.add(new NhomNV("102", "Xep Hang Hoa", new ArrayList<NhanVien>(), new NhanVien()));
		dsNhom.add(new NhomNV("103", "Lao Cong", new ArrayList<NhanVien>(), new NhanVien()));
	}
	public static void DsNhanVien()
	{
		dsNhanVien.add(new NhanVien("Nguyen Vo A", "A00", "0923864738", "Dong Nai",
				dsNhom.get(0).getMaNhom(), dsNhom.get(0)));
		dsNhanVien.add(new NhanVien("Tran Quoc B", "B01", "0923864987", "DakLak",
				dsNhom.get(1).getMaNhom(), dsNhom.get(1)));
		dsNhanVien.add(new NhanVien("Ta Quang C", "A02", "0926182379", "Dong Nai",
				dsNhom.get(1).getMaNhom(), dsNhom.get(1)));
		dsNhanVien.add(new NhanVien("Vo Van D", "B03", "0982864738", "DakLak",
				dsNhom.get(2).getMaNhom(), dsNhom.get(2)));
		dsNhanVien.add(new NhanVien("Ho Duc E", "A04", "0954864736", "Ho Chi Minh",
				dsNhom.get(3).getMaNhom(), dsNhom.get(3)));
		dsNhanVien.add(new NhanVien("Tran The F", "B05", "0929821416", "Ho Chi Minh",
				dsNhom.get(1).getMaNhom(), dsNhom.get(1)));
		dsNhanVien.add(new NhanVien("Lai Van H", "A06", "0964812975", "Dong Nai",
				dsNhom.get(0).getMaNhom(), dsNhom.get(0)));

		// bao ve
		dsNhom.get(0).getDsNhanVien().add(dsNhanVien.get(0));
		dsNhom.get(0).getDsNhanVien().add(dsNhanVien.get(6));
		dsNhom.get(0).setNhomTruong(dsNhanVien.get(0));

		// nhan vien ban hang
		dsNhom.get(1).getDsNhanVien().add(dsNhanVien.get(1));
		dsNhom.get(1).getDsNhanVien().add(dsNhanVien.get(2));
		dsNhom.get(1).getDsNhanVien().add(dsNhanVien.get(5));
		dsNhom.get(1).setNhomTruong(dsNhanVien.get(1));

		// xep hang hoa
		dsNhom.get(2).getDsNhanVien().add(dsNhanVien.get(3));
		dsNhom.get(2).setNhomTruong(dsNhanVien.get(3));

		// lao cong
		dsNhom.get(3).getDsNhanVien().add(dsNhanVien.get(4));
		dsNhom.get(3).setNhomTruong(dsNhanVien.get(4));

	}
	public static void DsNhomKhachHang()
	{
		dsNhomKhachHang.add(new NhomKH("VIP101", NhomKH.LoaiKhachHang.Vip,
				"Free tui, Toilet VIP, Gui xe free", new ArrayList<KhachHang>()));
		dsNhomKhachHang.add(new NhomKH("NOR203", NhomKH.LoaiKhachHang.Normal,
				"Khong co", new ArrayList<KhachHang>()));
	}
	public static void DsKhachHang()
	{
		dsKhachHang.add(new KhachHang("KH00", "Ha Quan H", "0904343864", dsNhomKhachHang.get(0).getMaNhom(),
				dsNhomKhachHang.get(0)));
		dsKhachHang.add(new KhachHang("KH01", "Ha Duc T", "0904343694", dsNhomKhachHang.get(0).getMaNhom(),
				dsNhomKhachHang.get(0)));
		dsKhachHang.add(new KhachHang("KH02", "Nguyen P", "0904622264", dsNhomKhachHang.get(0).getMaNhom(),
				dsNhomKhachHang.get(0)));
		dsKhachHang.add(new KhachHang("KH03", "Tomizasu", "0186343862", dsNhomKhachHang.get(1).getMaNhom(),
				dsNhomKhachHang.get(1)));
		dsKhachHang.add(new KhachHang("KH04", "W.Rooney", "0912203200", dsNhomKhachHang.get(1).getMaNhom(),
				dsNhomKhachHang.get(1)));
		dsKhachHang.add(new KhachHang("KH05", "Dan Van L", "0994498115", dsNhomKhachHang.get(1).getMaNhom(),
				dsNhomKhachHang.get(1)));
		dsKhachHang.add(new KhachHang("KH06", "Le Duc Do", "0192982898", dsNhomKhachHang.get(1).getMaNhom(),
				dsNhomKhachHang.get(1)));

		//khach vip
		dsNhomKhachHang.get(0).dsKhachHang.add(dsKhachHang.get(0));
		dsNhomKhachHang.get(0).dsKhachHang.add(dsKhachHang.get(4));
		dsNhomKhachHang.get(0).dsKhachHang.add(dsKhachHang.get(6));

		// khach normal
		dsNhomKhachHang.get(1).dsKhachHang.add(dsKhachHang.get(3));
		dsNhomKhachHang.get(1).dsKhachHang.add(dsKhachHang.get(2));
		dsNhomKhachHang.get(1).dsKhachHang.add(dsKhachHang.get(5));
		dsNhomKhachHang.get(1).dsKhachHang.add(dsKhachHang.get(1));

	}
	public static void DsHangHoa()
	{
		dsHangHoa.add(new HangHoa("HH00", "Thit lanh", 50000, "18/4/2021", "6/12/2021",
				HangHoa.LoaiHang.DongGoi));
		dsHangHoa.add(new HangHoa("HH01", "Gan ran", 450000, "1/4/2021", "3/4/2021",
				HangHoa.LoaiHang.DoAnLien));
		dsHangHoa.add(new HangHoa("HH02", "Rau khoai", 10000, "18/8/2021", "1/12/2021",
				HangHoa.LoaiHang.TuoiSong));
		dsHangHoa.add(new HangHoa("HH03", "Ca hoi", 100000, "18/12/2021", "30/12/2021",
				HangHoa.LoaiHang.TuoiSong));
		dsHangHoa.add(new HangHoa("HH04", "Xuc xich", 40000, "18/4/2021", "6/12/2023",
				HangHoa.LoaiHang.DongGoi));
		dsHangHoa.add(new HangHoa("HH05", "Mi xao", 150000, "18/4/2021", "20/4/2021",
				HangHoa.LoaiHang.DoAnLien));

	}
	public static void DsLuongNhanVien()
	{
		dsLuongNhanVien.add(new LuongNhanVien(dsNhanVien.get(0),
				dsNhom.get(0)));
		dsLuongNhanVien.add(new LuongNhanVien(dsNhanVien.get(1),
				dsNhom.get(1)));
		dsLuongNhanVien.add(new LuongNhanVien(dsNhanVien.get(2),
				dsNhom.get(1)));
		dsLuongNhanVien.add(new LuongNhanVien(dsNhanVien.get(3),
				dsNhom.get(2)));
		dsLuongNhanVien.add(new LuongNhanVien(dsNhanVien.get(4),
				dsNhom.get(3)));
		dsLuongNhanVien.add(new LuongNhanVien(dsNhanVien.get(5),
				dsNhom.get(1)));
		dsLuongNhanVien.add(new LuongNhanVien(dsNhanVien.get(6),
				dsNhom.get(0)));

	}
	public static void DsNhaCungCap()
	{
		dsNhaCungCap.add(new NhaCungCap("CC00", "3 Con Heo", "Thit lanh"));
		dsNhaCungCap.add(new NhaCungCap("CC01", "5 Con Bp", "Ga ran"));
		dsNhaCungCap.add(new NhaCungCap("CC02", "Aquaman", "Rau khoai"));
		dsNhaCungCap.add(new NhaCungCap("CC03", "Ca La So 1", "Ca hoi"));
		dsNhaCungCap.add(new NhaCungCap("CC04", "An La Chet", "Xuc xich"));
		dsNhaCungCap.add(new NhaCungCap("CC05", "Com Tam", "Mi Xao"));
	}
	public static void Linq1() {

		dsKhachHang
		.stream()
		.filter(k->k.getMaNhom()=="VIP101")
		.map(k->k)
		.forEach(kh->System.out.println(
				kh.getMaNhom()+" "+kh.getMaKhachHang()+" "+kh.getTenKhachHang()));
		System.out.println();
	}
	public static void Linq2() {
		dsLuongNhanVien
		.stream()
		.map(lnv->lnv)
		.distinct()
		.forEach(lnv->System.out.println("Ma nhan vien:"+lnv.getNhanVien().getMaNhanVien()
				+" Luong:"+lnv.getLuongNhanVien()+"VND"));
		System.out.println();
	}
	public static void Linq3(List<NhanVien>dsnv,Check tester) {
		for(NhanVien nv :dsnv) {
			if(tester.Test(nv)) {
				System.out.println(
						nv.getMaNhanVien()+" "+nv.getTenNhanVien()+" "+nv.getDiaChi()+" "
								+nv.getSoDienThoai());
			}
		}
		System.out.println();
	}
	
	public static<X,Y> void Linq4(List<X>ds,Predicate<X>tester,
			Function<X,Y>mapper,
			Consumer<Y>block) {
		for(X p : ds) {
			if(tester.test(p)) {
				Y data=mapper.apply(p);
				block.accept(data);
			}
		}
		System.out.println();
	}
	public static void Linq5() {
		dsHangHoa
								.stream()
								.map(gt->gt)
								.filter(gt->gt.getgiathanh()>30000)
								.toList()
								.forEach(gt->System.out.println("Ten mat hang:"+gt.gettenHang()+
										" Gia:"+gt.getgiathanh()+"VND"));
		System.out.println();
	}
	
	public static void main(String[] args) {

		DsNhom();
		DsNhanVien();
		DsNhomKhachHang();
		DsKhachHang();
		DsHangHoa();
		DsLuongNhanVien();
		DsNhaCungCap();

		System.out.println("Danh sach khach hang VIP");
		Linq1();
		System.out.println("Danh sach luong nhan vien");
		Linq2();
		System.out.println("Danh sach nhan vien thuoc nhom 100");
		Linq3(
				dsNhanVien,
				(NhanVien nv)->nv.getMaNhom()=="100"
				);
		System.out.println("Ten nha cung cap thit lanh");
		Linq4( 
				dsNhaCungCap,
				ncc->ncc.getSanPham()=="Thit lanh",
				ncc->ncc.getTenNhaCungCap(),
				tenncc->System.out.println(tenncc)
				);
		System.out.println("Cac mat hang co gia tren 30000");
		Linq5();
	}

}

