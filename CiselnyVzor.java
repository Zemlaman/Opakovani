package educanet;

import java.util.Scanner;

public class CiselnyVzor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte cislo.");

        String x = sc.nextLine();

        for(int i = 0; i < x.length(); i++){
            System.out.println(x.substring(0, x.length() -i));
        }
    }
}
