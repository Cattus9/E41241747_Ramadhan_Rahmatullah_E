import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkah Batas Angka : "); 
        int batas = scanner.nextInt();

        for (int i = 0; i < batas; i++) {
            list.add(rand.nextInt(100));
        }

        for (int x : list) {
            System.out.print(x + "  ");
        }
    }
}
