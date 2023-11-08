package examination.model;

public class BenhNhanVIP {
    private String maBenhAn;
    private String maBenhNhan;

    private String name;
    private String dayIn;
    private String dayOut;
    private String info;
    private String type;
    private int hsd;

    public BenhNhanVIP(String maBenhAn,String maBenhNhan, String name, String dayIn, String dayOut, String info, String type, int hsd) {
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.name = name;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
        this.info = info;
        this.type = type;
        this.hsd = hsd;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHsd() {
        return hsd;
    }

    public void setHsd(int hsd) {
        this.hsd = hsd;
    }

    @Override
    public String toString() {
        return "BenhNhanVIP{" +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", name='" + name + '\'' +
                ", dayIn=" + dayIn +
                ", dayOut=" + dayOut +
                ", info='" + info + '\'' +
                ", type='" + type + '\'' +
                ", hsd=" + hsd +
                '}';
    }
}
