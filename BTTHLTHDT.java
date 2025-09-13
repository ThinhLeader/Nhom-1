import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai4 {
    public static void Menu(){
        System.out.println("-------------MENU-------------");
        System.out.println("Moi chon: ");
        System.out.println("1.Bai 1.\n2.Bai 2.\n3.Bai 3.\n4.Bai 4.");
        System.out.println("Nhap lua chon cua ban: ");
    }
    public static void main(String[] args) {
        Menu();
        Scanner sc= new Scanner(System.in);
        int choose = sc.nextInt();

        while (choose==0) {
            System.out.println("Lua chon khong hop le!");
            System.out.println("Nhap lua chon cua ban: ");
            choose = sc.nextInt();
        }

        while (choose != 0) {
            switch (choose) {
                case 1:
                    System.out.println("1");
                    break;

                case 2:
                    System.out.println("2");
                    break;

                case 3:
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
                    break;

                case 4:
                    DecimalFormat df = new DecimalFormat("#.00");
                    System.out.println("Nhap so tien gui");
                    int tien_gui = sc.nextInt();
                    System.out.println("Nhap lai suat (%): ");
                    double lai_suat = sc.nextDouble()/100;
                    System.out.println("Nhap so thang gui:");
                    double thang = sc.nextDouble();

                    double tien_goc =tien_gui*Math.pow((double)(1+lai_suat),thang/12);
                    System.out.println("So tien lai la:"+(df.format(tien_goc-tien_gui)));
                    System.out.println("Tien goc la:"+df.format(tien_goc));
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
                    System.out.println("Nhap lua chon cua ban: ");
                    choose = sc.nextInt();
                    break;
            }

            System.out.println("Ban co muon tiep tuc hay khong?(1/0)");
            choose = sc.nextInt();

            if(choose==0)
                break;
            else{
                Menu();
                choose = sc.nextInt();
            }
        }
        
        sc.close();
        System.out.println("Hoan thanh bai tap");
    }
}
