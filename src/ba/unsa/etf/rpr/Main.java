package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n){
        int a=n;
        int suma=0;
        while (a>0) {
            suma += a % 10;
            a /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = s.nextInt();
        for (int i = 1; i < n; i++) {
            if (i % sumaCifara(i) == 0) System.out.println(i+" ");
        }
    }
}
