package MyPackage;

public class NhanVien {
	private String tenNhanVien;
	private String maNhanVien;
	private String soDienThoai;
	private String diaChi;
	private String maNhom;
	private NhomNV nhom;
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getMaNhom() {
		return maNhom;
	}
	public void setMaNhom(String maNhom) {
		this.maNhom = maNhom;
	}
	public NhomNV getNhom() {
		return nhom;
	}
	public void setNhom(NhomNV nhom) {
		this.nhom = nhom;
	}
	
	NhanVien(){}
	NhanVien(NhanVien nv)
	{
		this.tenNhanVien=nv.tenNhanVien;
		this.maNhanVien=nv.maNhanVien;
		this.soDienThoai=nv.soDienThoai;
		this.diaChi=nv.diaChi;
		this.maNhom=nv.maNhom;
		this.nhom=nv.nhom;
	}
	NhanVien(String tenNhanVien,String maNhanVien,String soDienThoai,
			String diaChi,String maNhom,NhomNV nhom){
		this.tenNhanVien=tenNhanVien;
		this.maNhanVien=maNhanVien;
		this.soDienThoai=soDienThoai;
		this.diaChi=diaChi;
		this.maNhom=maNhom;
		this.nhom=nhom;
	}
}
