package examination.model;

public class BenhNhan {
    private String maBenhAn;
    private String maBenhNhan;

    private String name;
    private String dayIn;
    private String dayOut;
    private String info;
    private double total;

    public BenhNhan( String maBenhAn,String maBenhNhan, String name, String dayIn, String dayOut, String info, double total) {
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.name = name;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
        this.info = info;
        this.total = total;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayIn() {
        return dayIn;
    }

    public void setDayIn(String dayIn) {
        this.dayIn = dayIn;
    }

    public String getDayOut() {
        return dayOut;
    }

    public void setDayOut(String dayOut) {
        this.dayOut = dayOut;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "BenhNhan{" +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", name='" + name + '\'' +
                ", dayIn=" + dayIn +
                ", dayOut=" + dayOut +
                ", info='" + info + '\'' +
                ", total=" + total +
                '}';
    }
}
