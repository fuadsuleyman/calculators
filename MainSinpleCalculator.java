import java.util.Scanner;

public class MainSinpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double netice = 0;
        int saygac = 0;

        System.out.print("a ededini daxil et: ");
        double a = scanner.nextInt();

        System.out.print("b ededini daxil et: ");
        double b = scanner.nextInt();

        System.out.print("Operatoru daxil et: ");
        String operator = scanner.next();

        if (operator.equals("+")){
            netice = topla(a,b);
        }else if (operator.equals("-")){
            netice = cix(a,b);
        }else if (operator.equals("*")){
            netice = vur(a,b);
        }else if (operator.equals("/")){
            if (b == 0){
                System.out.println("sifira bolmek olmaz!");
                saygac++;
            }else{
                netice = bol(a,b);
            }
        }else{
            System.out.println("Yalnis operator daxil edilib!");
            saygac++;
        }
        if (saygac==0)
        System.out.println("Netice = " + netice);
    }

//    public static void capEt(double netice){
//        System.out.println("netice = " + netice);
//    }

    public static double topla(double a, double b){
        double netice = a + b;
        return netice;
    }

    public static double cix(double a, double b){
        double netice = a - b;
        return netice;
    }

    public static double vur(double a, double b){
        double netice = a * b;
        return netice;
    }

    public static double bol(double a, double b){
        double netice = a / b;
        return netice;
    }
}
