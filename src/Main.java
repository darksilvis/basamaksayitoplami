import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        int tempsayi = sayi;
        int basamaksayisi = 0;
        int basamakdegeri;
        int sum = 0;

        while (tempsayi != 0) {
            tempsayi /= 10;
            basamaksayisi++;
        }
        tempsayi = sayi;

        while (tempsayi != 0) {
            basamakdegeri = tempsayi % 10;
            sum += basamakdegeri;
            tempsayi /= 10;
        }
        System.out.println(sayi + " basamaklarinin toplami = " + sum);
    }
}
