import java.util.Scanner;
public class task3 {

    public static void main(String[] args) {
        float a,b,c;
        Scanner input = new Scanner(System.in); //scanner function'i calistirmak icin cagirdigimiz kod.
        System.out.println("Dik ucgene ait ilk dik kenarin uzunlugunu: ");
        a = input.nextFloat();
        System.out.println("Dik ucgene ait ikinci dik kenarin uzunlugu: ");
        b = input.nextFloat();
        c = (float) Math.sqrt((a*a)+(b*b));
        System.out.println("Dik ucgene ait hipotenus uzunlugu= " + c);
    }
}
