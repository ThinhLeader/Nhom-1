import java.util.Scanner;

public class Bai3_THLTHDT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap 2 so nguyên: ");
        int 
        a=sc.nextInt(),
        b=sc.nextInt(),
        Tong=a+b,
        Hieu=a-b,
        Tich=a*b,
        Du=a%b;
        float Thuong=(float)a/b;
        System.out.println("Tong= "+Tong);
        System.out.println("Hieu= "+Hieu);
        System.out.println("Tich= "+Tich);
        System.out.println("Thuong= "+Thuong);
        System.out.println("Phan du= "+Du);
    }
}
