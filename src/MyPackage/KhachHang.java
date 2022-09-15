package MyPackage;

public class KhachHang {
	private String maKhachHang;
	private String tenKhachHang;
	private String soDienThoai;
	private String maNhom;
	private NhomKH nhomKhachHang;
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getMaNhom() {
		return maNhom;
	}
	public void setMaNhom(String maNhom) {
		this.maNhom = maNhom;
	}
	public NhomKH getNhomKhachHang() {
		return nhomKhachHang;
	}
	public void setNhomKhachHang(NhomKH nhomKhachHang) {
		this.nhomKhachHang = nhomKhachHang;
	}
	
	public KhachHang() {}
	public KhachHang(KhachHang a) {
		this.maKhachHang=a.maKhachHang;
		this.tenKhachHang=a.tenKhachHang;
		this.soDienThoai=a.soDienThoai;
		this.maNhom=a.maNhom;
		this.nhomKhachHang=a.nhomKhachHang;
	}
	public KhachHang(String maKhachHang,String tenKhachHang,
			String soDienThoai,String maNhom,NhomKH nhomKhachHang) {
		this.maKhachHang=maKhachHang;
		this.tenKhachHang=tenKhachHang;
		this.soDienThoai=soDienThoai;
		this.maNhom=maNhom;
		this.nhomKhachHang=nhomKhachHang;
	}
}
