import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        System.out.print("Bir sayi gir: ");
        sayi = input.nextInt();

        if(sayi % 2 == 0){
            System.out.println("Sayi cift");
        } else {
            System.out.println("Sayi tek");
        }
    }
}
    

