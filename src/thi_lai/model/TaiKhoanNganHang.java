package thi_lai.model;

public abstract class TaiKhoanNganHang {
    private int idTaiKhoan;
    private int maTaiKhoan;
    private String name;
    private String date;

    public TaiKhoanNganHang(int idTaiKhoan, int maTaiKhoan, String name, String date) {
        this.idTaiKhoan = idTaiKhoan;
        this.maTaiKhoan = maTaiKhoan;
        this.name = name;
        this.date = date;
    }

    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public int getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(int maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TaiKhoanNganHang{" +
                "idTaiKhoan=" + idTaiKhoan +
                ", maTaiKhoan=" + maTaiKhoan +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
