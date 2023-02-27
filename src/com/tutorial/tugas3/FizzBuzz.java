package com.tutorial.tugas3;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int num;
        System.out.print("Masukkan angka: "); num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            if(i%3 == 0 && i%5 == 0) System.out.print("FizzBuzz ");
            else if(i%3 == 0) System.out.print("Fizz ");
            else if(i%5 == 0) System.out.print("Buzz ");
            else System.out.print(i + " ");
        }
    }
}
