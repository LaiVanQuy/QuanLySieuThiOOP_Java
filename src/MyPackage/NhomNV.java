package MyPackage;
import java.util.List;
import java.util.ArrayList;
public class NhomNV 
{
	private String maNhom;
	private String moTa;
	private List<NhanVien> dsNhanVien;
	private NhanVien nhomTruong;
	public String getMaNhom() {
		return maNhom;
	}
	public void setMaNhom(String maNhom) {
		this.maNhom = maNhom;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public List<NhanVien> getDsNhanVien() {
		return dsNhanVien;
	}
	public void setDsNhanVien(List<NhanVien> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
	}
	public NhanVien getNhomTruong() {
		return nhomTruong;
	}
	public void setNhomTruong(NhanVien nhomTruong) {
		this.nhomTruong = nhomTruong;
	}
	
	public NhomNV() {}
	public NhomNV(NhomNV a)
	{
		this.maNhom=a.maNhom;
		this.moTa=a.moTa;
		this.dsNhanVien=a.dsNhanVien;
		this.nhomTruong=a.nhomTruong;
	}
	public NhomNV(String maNhom,String moTa,List<NhanVien>dsNhanVien,NhanVien nhomTruong)
	{
		this.maNhom=maNhom;
		this.moTa=moTa;
		this.dsNhanVien=dsNhanVien;
		this.nhomTruong=nhomTruong;
	}
}

