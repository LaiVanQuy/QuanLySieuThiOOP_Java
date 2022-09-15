package MyPackage;

public class LuongNhanVien {

	private double heSoCao = 1.5;
    private double heSoThap = 1.3;
    private double luongCoBan = 6000000;
    private double luongNhanVien;
    private NhomNV nhomNhanVien ; 
    private NhanVien nhanVien;
	public double getLuongNhanVien() {
		return luongNhanVien;
	}
	public void setLuongNhanVien(double luongNhanVien) {
		this.luongNhanVien = luongNhanVien;
	}
	public NhomNV getNhomNhanVien() {
		return nhomNhanVien;
	}
	public void setNhomNhanVien(NhomNV nhomNhanVien) {
		this.nhomNhanVien = nhomNhanVien;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	
    public LuongNhanVien() { }
    public LuongNhanVien(LuongNhanVien a)
    {
        this.luongNhanVien = a.luongNhanVien;
        this.nhanVien = a.nhanVien;
        this.nhomNhanVien=a.nhomNhanVien;
    }
    public LuongNhanVien(NhanVien nhanVien, 
        NhomNV nhomNhanVien)
    {
        if (nhanVien.getMaNhanVien() == nhomNhanVien.getNhomTruong().getMaNhanVien())
            this.luongNhanVien = luongCoBan * heSoCao;
        else
            this.luongNhanVien = luongCoBan * heSoThap;
        this.nhanVien = nhanVien;
        this.nhomNhanVien = nhomNhanVien;
    }
    public void printLuongNhanVien() {
    	System.out.println(this.nhanVien.getMaNhanVien()+" "+
    this.nhanVien.getTenNhanVien()+" "+this.luongNhanVien);
    }
}
