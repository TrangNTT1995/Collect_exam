package QLST;

public class DienMay extends HangHoa{
    private int thoiGianBaoHanh;
    private double congSuat;

    public DienMay(String maHang, String tenHang, int soLuongTonKho, double donGia, int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public double tinhThueVAT() {
        return 0.1 * soLuongTonKho * donGia;
    }

    @Override
    public String danhGia() {
        if (soLuongTonKho < 3) {
            return "Bán được";
        } else {
            return "Không đánh giá";
        }
    }

    @Override
    public double tinhVAT() {
        return 0;
    }

    @Override
    public String danhGia() {
        return null;
    }
}
}
