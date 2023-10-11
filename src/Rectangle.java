public class Rectangle extends Geometry {
    private double length;
    private double width;

    public Rectangle(double tinhDienTich, double tinhChuVi, double length, double width) {
        super(tinhDienTich, tinhChuVi);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "tinhDienTich: " + length*width +
                "tinhChuVi: " + 2*(length+width) +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
