package QLST;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class DSHH {
    private ArrayList<HangHoa> dsHangHoa = new ArrayList<>();

    public void themHangHoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thêm hàng hóa vào danh sách");
        System.out.println("1. Thêm hàng thực phẩm");
        System.out.println("2. Thêm hàng điện máy");
        System.out.println("3. Thêm hàng sành sứ");
        System.out.print("Vui lòng chọn loại hàng hóa muốn thêm: ");
        int loai = sc.nextInt();
        sc.nextLine(); // Xóa bộ đệm
        switch (loai) {
            case 1:
                themHangThucPham();
                break;
            case 2:
                themHangDienMay();
                break;
            case 3:
                themHangSanhSu();
                break;
            default:
                System.out.println("Không hợp lệ!");
        }
    }

    private void themHangSanhSu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thêm NSX");
        System.out.println("Thêm ngay nhap kho");
    }

    public void themHangThucPham() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thêm hàng thực phẩm");
        System.out.print("Nhập mã hàng: ");
        String maHang = sc.nextLine();
        // Kiểm tra trùng mã hàng
        for (HangHoa hh : dsHangHoa) {
            if (hh.getMaHang().equals(maHang)) {
                System.out.println("Mã hàng đã tồn tại!");
                return;
            }
        }
        System.out.print("Nhập tên hàng: ");
        String tenHang = sc.nextLine();
        System.out.print("Nhập số lượng tồn kho: ");
        int soLuongTonKho = sc.nextInt();
        System.out.print("Nhập đơn giá: ");
        double donGia = sc.nextDouble();
        sc.nextLine(); // Xóa bộ đệm
        System.out.print("Nhập ngày sản xuất (yyyy-MM-dd): ");
        LocalDate ngaySanXuat = LocalDate.parse(sc.nextLine());
        System.out.print("Nhập ngày hết hạn (yyyy-MM-dd): ");
        LocalDate ngayHetHan = LocalDate.parse(sc.nextLine());
        System.out.print("Nhập tên nhà cung cấp: ");
        String nhaCungCap = sc.nextLine();
        // Tạo đối tượng Hàng thực phẩm mới
        ThucPham htp = new ThucPham(maHang, tenHang, soLuongTonKho, donGia, ngaySanXuat, ngayHetHan, nhaCungCap);
        // Thêm đối tượng Hàng thực phẩm vào danh sách
        dsHangHoa.add(htp);
        System.out.println("Thêm hàng hóa thành công!");
    }

    public void themHangDienMay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thêm hàng điện máy");
        System.out.print("Nhập mã hàng: ");
        String maHang = sc.nextLine();
        // Kiểm tra trùng mã hàng
        for (HangHoa hh : dsHangHoa) {
            if (hh.getMaHang().equals(maHang)) {
                System.out.println("Mã hàng đã tồn tại!");
                return;
            }

        }
    }
}