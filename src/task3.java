import java.util.Scanner;
public class task3 {

    public static void main(String[] args) {
        float a,b,c,u,alan;
        Scanner input = new Scanner(System.in); //scanner function'i calistirmak icin cagirdigimiz kod.
        System.out.println("Ucgene ait ilk kenarin uzunlugunu: ");
        a = input.nextFloat();
        System.out.println("Ucgene ait ikinci kenarin uzunlugunu: ");
        b = input.nextFloat();
        System.out.println("Ucgene ait ilk kenarin uzunlugunu: ");
        c = input.nextFloat();
        u = (a+b+c)*0.5f;
        alan = (float) Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan= " + alan);
    }
}
