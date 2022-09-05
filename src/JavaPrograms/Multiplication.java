package JavaPrograms;

import java.util.Scanner;

public class Multiplication {
    public static void main(String []args) {
        int input = 0;
        int res = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number for which Multiplication needed: ");
        input = inp.nextInt();
        for (int i = 1; i <= 10; i++) {
            res = input * i;
            System.out.println(res);
        }
    }
}