package thi_lai.repository.tai_khoan_tiet_kiem;

import thi_lai.model.TaiKhoanNganHang;
import thi_lai.model.TaiKhoanTietKiem;

import java.util.List;

public interface ITaiKhoanTietKiemRepository {
    void add(TaiKhoanTietKiem newTaiKhoan);
    void delete(int maTaiKhoan);
    List<TaiKhoanTietKiem> getList();
    void find(int maTaiKhoan);
    void readfFile2();
}
