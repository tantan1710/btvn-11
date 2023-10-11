import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Mời bạn nhập length: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Mời bạn nhập width: ");
        double width = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(length*width,2*(length+width), length, width);
        System.out.println("Thông tin về hình chữ nhật: ");
        System.out.println("Diện tích là: " + rectangle.getTinhDienTich());
        System.out.println("Chu vi là: " + rectangle.getTinhChuVi());
        System.out.println("Length là: " + rectangle.getLength());
        System.out.println("Width là: " + rectangle.getWidth());

        System.out.println();
        System.out.println("Thông tin về hình vuông: ");
        System.out.print("Mời bạn nhập sile: ");
        double sile = Double.parseDouble(scanner.nextLine());
        Square square = new Square(sile*sile,4*sile, sile );
        System.out.println("Diện tích là: " + square.getTinhDienTich());
        System.out.println("Chu vi là: " + square.getTinhChuVi());
        System.out.println("Sile là: " + square.getSile());

    }
}
