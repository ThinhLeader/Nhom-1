import java.util.Scanner;

public class Main {
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

        while (choose != 0) {
            switch (choose) {
                case 1:
                    System.out.println("1");
                    break;

                case 2:
                    System.out.println("2");
                    break;

                case 3:
                    System.out.println("3");
                    break;

                case 4:
                    System.out.println("4");
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
                System.out.println("Nhap lua chon cua ban:");
                choose = sc.nextInt();
            }
        }
        
        sc.close();
        System.out.println("Hoan thanh bai tap");
    }
}
