package examination.repository.normal;

import examination.model.BenhNhan;

import java.util.List;

public interface IBenhNhanRepository {
    void add(BenhNhan newBenhNhan, String path);
    void delete(String maBenhAn, String path);
    List<BenhNhan> display();
}
