package MyPackage;

public class NhaCungCap {
	private String maNhaCungCap ;
	private String tenNhaCungCap ;
	private String sanPham ;
	public String getMaNhaCungCap() {
		return maNhaCungCap;
	}
	public void setMaNhaCungCap(String maNhaCungCap) {
		this.maNhaCungCap = maNhaCungCap;
	}
	public String getTenNhaCungCap() {
		return tenNhaCungCap;
	}
	public void setTenNhaCungCap(String tenNhaCungCap) {
		this.tenNhaCungCap = tenNhaCungCap;
	}
	public String getSanPham() {
		return sanPham;
	}
	public void setSanPham(String sanPham) {
		this.sanPham = sanPham;
	}
	public NhaCungCap() { }
	public NhaCungCap(NhaCungCap a)
	{
		this.maNhaCungCap = a.maNhaCungCap;
		this.tenNhaCungCap = a.tenNhaCungCap;
		this.sanPham = a.sanPham;
	}
	public NhaCungCap(String ma,String ten,String sanPham)
	{
		this.maNhaCungCap = ma;
		this.tenNhaCungCap = ten;
		this.sanPham = sanPham;
	}
}
