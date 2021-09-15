package educanet;

import java.util.Scanner;

public class Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte cislo.");
        int nmb = sc.nextInt();
        int y = 0;
        int[] bin = new int[20];
        int index = 0;

        while(nmb > 0) {
            bin[index++] = nmb % 2;
            nmb = nmb/2;
            y++;
            bin[y] = y + 100;
        }

        for(int i = y-1; i >= 0; i--){
            System.out.print(bin[i]);
        }

    }
}
