package MyPackage;

import java.util.List;
import java.util.ArrayList;
public class NhomKH {
	public enum LoaiKhachHang{
		Vip,
		Normal
	}
	private String maNhom;
	private LoaiKhachHang loaiKhachHang;
	private String daiNgo;
	public List<KhachHang> dsKhachHang;
	public String getMaNhom() {
		return maNhom;
	}
	public void setMaNhom(String maNhom) {
		this.maNhom = maNhom;
	}
	public LoaiKhachHang getLoaiKhachHang() {
		return loaiKhachHang;
	}
	public void setLoaiKhachHang(LoaiKhachHang loaiKhachHang) {
		this.loaiKhachHang = loaiKhachHang;
	}
	public String getDaiNgo() {
		return daiNgo;
	}
	public void setDaiNgo(String daiNgo) {
		this.daiNgo = daiNgo;
	}
	public List<KhachHang> getDsKhachHang() {
		return dsKhachHang;
	}
	public void setDsKhachHang(List<KhachHang> dsKhachHang) {
		this.dsKhachHang = dsKhachHang;
	}
	
	public NhomKH() {}
	public NhomKH(NhomKH a) {
		this.maNhom=a.maNhom;
		this.loaiKhachHang=a.loaiKhachHang;
		this.daiNgo=a.daiNgo;
		this.dsKhachHang=a.dsKhachHang;
	}
	public NhomKH(String maNhom,LoaiKhachHang loaiKhachHang,
			String daiNgo,List<KhachHang> dsKhachHang) {
		this.maNhom=maNhom;
		this.loaiKhachHang=loaiKhachHang;
		this.daiNgo=daiNgo;
		this.dsKhachHang=dsKhachHang;
	}
}


