package QLST;

import java.time.LocalDate;

public class ThucPham extends HangHoa {
        private LocalDate ngaySanXuat;
        private LocalDate ngayHetHan;
        private String nhaCungCap;
        public ThucPham(String maHang, String ten, int soLuongTonKho, double donGia,
                        LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaCungCap) {
            super(maHang, ten, soLuongTonKho, donGia);
            this.ngaySanXuat = ngaySanXuat;
            this.ngayHetHan = ngayHetHan;
            this.nhaCungCap = nhaCungCap;
        }
        public LocalDate getNgaySanXuat() {
            return ngaySanXuat;
        }
        public void setNgaySanXuat(LocalDate ngaySanXuat) {
            this.ngaySanXuat = ngaySanXuat;
        }
        public LocalDate getNgayHetHan() {
            return ngayHetHan;
        }
        public void setNgayHetHan(LocalDate ngayHetHan) {
            this.ngayHetHan = ngayHetHan;
        }
        public String getNhaCungCap() {
            return nhaCungCap;
        }
        public void setNhaCungCap(String nhaCungCap) {
            this.nhaCungCap = nhaCungCap;
        }

    @Override
    public double tinhThueVAT() {
        return 0;
    }

    @Override
    public String danhGiaTieuThu() {
        return null;
    }

    @Override
        public double tinhVAT() {
            return getDonGia() * 0.05;
        }
        @Override
        public String danhGia() {
            LocalDate now = LocalDate.now();
            if (getSoLuongTonKho() == 0){
                return "Sold out";
            }
            if (getSoLuongTonKho() > 0 && getNgayHetHan().isBefore(now)) {
                return "Khó bán";
            } else {
                return null;
            }
        }
}
