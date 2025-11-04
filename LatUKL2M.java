import java.util.Scanner;

public class LatUKL2M {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Masukan Bilangan Bulat: ");
    double bilanganBulat = input.nextDouble();
    
    if (bilanganBulat%2 == 0) {
        System.out.println("Bilangan Genap");
    } else {
        System.out.println("Bilangan Ganjil");
    }
    input.close();
    } 
    }

