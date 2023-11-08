package thi_lai.model;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
    private int soThe;
    private int soDu;
    public TaiKhoanThanhToan(int idTaiKhoan, int maTaiKhoan, String name, String date) {
        super(idTaiKhoan, maTaiKhoan, name, date);
    }

    public TaiKhoanThanhToan(int idTaiKhoan, int maTaiKhoan, String name, String date, int soThe, int soDu) {
        super(idTaiKhoan, maTaiKhoan, name, date);
        this.soThe = soThe;
        this.soDu = soDu;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" +
                super.toString() +
                "soThe=" + soThe +
                ", soDu=" + soDu +
                '}';
    }
}
