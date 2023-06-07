import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Kaç Adet Sayı Gireceksiniz :");
        int n=input.nextInt();


        if (n>0){
            System.out.print("1.Sayı :");
            int num=input.nextInt();

            int max=num;
            int min=num;


            for (int i=2; i<=n ; i++){
                System.out.print(i+".Sayı :");
                num=input.nextInt();


                if (num>max){
                    max=num;
                }
                if (num<min){
                    min=num;
                }


            }
            System.out.println("En küçük sayı: " + min);
            System.out.println("En büyük sayı: " + max);

        }else{
            System.out.println("Lütfen geçerli bir değer giriniz!");
        }










    }
}
