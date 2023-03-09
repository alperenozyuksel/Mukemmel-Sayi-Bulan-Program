import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,toplam=0;
        System.out.print("Bir Sayi Giriniz : ");
        a = input.nextInt();


        // 28 = 1+2+4+7+14


        for(int i =1; i<a; i++ ) {

            if (a % i == 0) {

                toplam += i;
            }

        }

        if (toplam==a){

            System.out.print(a + " BIR MUKEMMEL SAYIDIR!!!!!!");

        }

        else {

            System.out.print(a + " Bir Mukemmel Sayi Degildir!");
        }

    }
}