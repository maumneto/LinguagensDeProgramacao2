package Aula1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World, Cambada!");
        int n = 12, m = 14, res;
        res = n + m;
        System.out.println("O resultado é ");
        System.out.print(res);
        scan.close();
    }
}
