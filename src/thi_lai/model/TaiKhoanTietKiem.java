package thi_lai.model;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{
    private int tienTietKiem;
    private String ngayGui;
    private int laiSuat;
    private String kiHan;
    public TaiKhoanTietKiem(int idTaiKhoan, int maTaiKhoan, String name, String date) {
        super(idTaiKhoan, maTaiKhoan, name, date);
    }

    public TaiKhoanTietKiem(int idTaiKhoan, int maTaiKhoan, String name, String date, int tienTietKiem, String ngayGui, int laiSuat, String kiHan) {
        super(idTaiKhoan, maTaiKhoan, name, date);
        this.tienTietKiem = tienTietKiem;
        this.ngayGui = ngayGui;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public int getTienTietKiem() {
        return tienTietKiem;
    }

    public void setTienTietKiem(int tienTietKiem) {
        this.tienTietKiem = tienTietKiem;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public int getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(int laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" +
                super.toString() +
                "tienTietKiem=" + tienTietKiem +
                ", ngayGui='" + ngayGui + '\'' +
                ", laiSuat=" + laiSuat +
                ", kiHan='" + kiHan + '\'' +
                '}';
    }
}
