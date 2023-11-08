package thi_lai.repository.tai_khoan_thanh_toan;

import thi_lai.model.TaiKhoanNganHang;
import thi_lai.model.TaiKhoanThanhToan;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ITaiKhoanThanhToanRepository {
    void add(TaiKhoanThanhToan newTaiKhoan);
    void delete(int maTaiKhoan);
    List<TaiKhoanThanhToan> getList();
    void find(int maTaiKhoan);
    void readFile() throws IOException, ClassNotFoundException;
}
