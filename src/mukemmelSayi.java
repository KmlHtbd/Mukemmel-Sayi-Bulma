import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {

        int n,i=1,total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        for (i=1; i<n;i++){
            if(n%i==0){
                total= total+i;
                if (total==n ){
                    System.out.println(n+" Mükemmel Sayıdır.");
                }
            }
        }
        if (total != n){
            System.out.println(n+" Mükemmel Sayı Değildir.");
        }
    }
}