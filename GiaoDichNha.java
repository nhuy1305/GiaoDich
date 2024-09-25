package NhuY23718321;
import java.util.Calendar;

public class GiaoDichNha extends GiaoDich {

    private String loaiNha;
    private String diaChi;

   
    public GiaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }


    public String getLoaiNha() {
        return loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }


    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    @Override
    public double getThanhTien() {

        return dienTich * donGia;
    }

    @Override
    public String toString() {
        return "GiaoDichNha [loaiNha=" + loaiNha + ", diaChi=" + diaChi + ", " + super.toString() + "]";
    }
}
