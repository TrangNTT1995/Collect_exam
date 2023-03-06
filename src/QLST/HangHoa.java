package QLST;
import java.time.LocalDate;
    abstract class HangHoa {
        private String maHang;
        private String tenHang;
        private int soLuongTonKho;
        private double donGia;
        public HangHoa(String maHang, String ten, int soLuongTonKho, double donGia) {
            this.maHang = maHang;
            this.tenHang = tenHang;
            this.soLuongTonKho = soLuongTonKho;
            this.donGia = donGia;
        }
        public String getMaHang() {
            return maHang;
        }
        public void setMaHang(String maHang) {
            this.maHang = maHang;
        }
        public String gettenHang() {
            return tenHang;
        }
        public void setTen(String ten) {
            this.tenHang = tenHang;
        }
        public int getSoLuongTonKho() {
            return soLuongTonKho;
        }
        public void soLuongTonKho(int soLuongTonKho) {
            this.soLuongTonKho = soLuongTonKho;
        }
        public double getDonGia() {
            return donGia;
        }
        public void setDonGia(double donGia) {
            this.donGia = donGia;
        }

        public abstract double tinhThueVAT();

        public abstract String danhGiaTieuThu();

        public abstract double tinhVAT();
        public abstract String danhGia();
        @Override
        public String toString() {
            return "Ma hang: " + maHang + ", Ten: " + tenHang + ", So luong ton kho: " + soLuongTonKho +
                    ", Don gia: " + donGia;
        }
    }

