import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //degiskenleri tanimladik.
        double kg,boy,vkt;
        Scanner inp= new Scanner(System.in);
        //kullanicidan verileri istedik.
        System.out.print("Lutfen kilonuzu giriniz(kg cinsinden): ");
        kg = inp.nextDouble();

        System.out.print("Lutfen boyunuzu giriniz(cm cinsinden): ");
        boy=inp.nextDouble();

        boy=boy/100;
        vkt=kg/(Math.pow(boy,2));
        System.out.println("Vucut Kitle Indeksiniz:"+ new DecimalFormat("##.##").format(vkt));
    }
}

