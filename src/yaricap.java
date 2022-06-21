import java.util.Scanner;
//Alan Formülü : π * r * r;
//Çevre Formülü : 2 * π * r;
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//𝜋 sayısını = 3.14 alınız.


public class yaricap {

        public static void main(String[] args) {
            double r;
            double pi = 3.14;

        System.out.println("Lutfen yari cap giriniz : ");

            Scanner inp = new Scanner(System.in);

            r=inp.nextDouble();
            double alan = pi * r * r;
            double cevre = 2 * pi * r;

            System.out.println("Dairenin Alani : " + alan);
            System.out.print("Dairenin Cevresi : " + cevre);




    }




}
