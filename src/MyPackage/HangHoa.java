package MyPackage;

public class HangHoa {
	public enum LoaiHang{
		DongGoi,
		TuoiSong,
		DoAnLien
	}
	private String maHang;
    private String tenHang ;
    private LoaiHang loaiHang;
    private String ngayNhapHang;
    private String ngayHetHan;
    private double giathanh;
    public String getmaHang() {
    	return maHang;
    }
    public void setmaHang(String maHang) {
    	this.maHang=maHang;
    }
    public String gettenHang() {
    	return tenHang;
    }
    public void settenHang(String tenHang) {
    	this.tenHang=tenHang;
    }
    public LoaiHang getloaiHang() {
    	return loaiHang;
    }
    public void setloaiHang(LoaiHang loaiHang) {
    	this.loaiHang=loaiHang;
    }
    public String getngayNhapHang() {
    	return ngayNhapHang;
    }
    public void setngayNhapHang(String ngayNhapHang) {
    	this.ngayNhapHang=ngayNhapHang;
    }
    public String getngayHetHan() {
    	return ngayHetHan;
    }
    public void setngayHetHan(String ngayHetHan) {
    	this.ngayHetHan=ngayHetHan;
    }
    public double getgiathanh() {
    	return giathanh;
    }
    public void setgiathanh(double giathanh) {
    	this.giathanh=giathanh;
    }
    public HangHoa() { }
    public HangHoa(HangHoa a)
    {
        this.maHang = a.maHang;
        this.tenHang = a.tenHang;
        this.loaiHang = a.loaiHang;
        this.giathanh = a.giathanh;
        this.ngayHetHan = a.ngayHetHan;
        this.ngayNhapHang = a.ngayNhapHang;
    }
    public HangHoa(String maHang,String tenHang,double giathanh,
    		String ngayNhapHang, String ngayHetHan, LoaiHang loaiHang)
    {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.ngayNhapHang = ngayNhapHang;
        this.ngayHetHan = ngayHetHan;
        this.loaiHang = loaiHang;
        this.giathanh = giathanh;
    }
}

