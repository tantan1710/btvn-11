public class Square extends Geometry{
    private double sile;

    public Square(double tinhDienTich, double tinhChuVi, double sile) {
        super(tinhDienTich, tinhChuVi);
        this.sile = sile;
    }

    public double getSile() {
        return sile;
    }

    public void setSile(double sile) {
        this.sile = sile;
    }

    @Override
    public String toString() {
        return "Square{" +
                "tinhDienTich: " + sile*sile +
                "tinhChuVi: " + 4*sile +
                "sile=" + sile +
                '}';
    }
}
