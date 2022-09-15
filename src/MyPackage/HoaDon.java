package MyPackage;
import java.util.List;
import java.util.ArrayList;
public class HoaDon {
	private String maHoaDon;
	private KhachHang khachHang;
	private NhanVien nhanVien;
	public List<HangHoa> dshangHoa;
	private double soTienThanhToan;
	public HoaDon() { }
	public HoaDon(HoaDon a)
	{
		this.maHoaDon = a.maHoaDon;
		this.khachHang = a.khachHang;
		this.nhanVien = a.nhanVien;
		this.dshangHoa = a.dshangHoa;
		this.soTienThanhToan = a.soTienThanhToan;
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public List<HangHoa> getDshangHoa() {
		return dshangHoa;
	}
	public void setDshangHoa(List<HangHoa> dshangHoa) {
		this.dshangHoa = dshangHoa;
	}
	public double getSoTienThanhToan() {
		return soTienThanhToan;
	}
	public void setSoTienThanhToan(double soTienThanhToan) {
		this.soTienThanhToan = soTienThanhToan;
	}
	public HoaDon(String maHoaDon,double soTienThanhToan,
			KhachHang khachHang,NhanVien nhanVien,List<HangHoa> dsHangHoa)
	{
		this.maHoaDon = maHoaDon;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.dshangHoa = dsHangHoa;
		this.soTienThanhToan = soTienThanhToan;
	}
}

