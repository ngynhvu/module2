package examination.repository.vip;

import examination.model.BenhNhanVIP;

import java.util.List;

public interface IBenhNhanVIPRepository {
    void add(BenhNhanVIP newBenhNhanVIP, String path);
    void delete(String maBenhAn, String path);
    List<BenhNhanVIP> display();
}
