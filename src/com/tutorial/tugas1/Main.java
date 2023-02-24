package com.tutorial.tugas1;

import java.util.Scanner;

public class Main {
    public static boolean isPrimeNumber(int num){
        boolean isPrime = true;
        for(int i = 2; i <= num/2; i++){
            if(num%i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Cek bilangan prima");
        System.out.println("2. Deret bilangan prima");
        System.out.print("Pilih: "); int pil = scanner.nextInt();

        switch (pil){
            case 1:{
                System.out.print("Masukkan Nilai: ");
                int num = scanner.nextInt();
                if(isPrimeNumber(num)) System.out.println(num + " adalah bilangan prima");
                else System.out.println(num + " adalah bukan bilangan prima");
                break;
            }
            case 2:{
                System.out.print("Masukkan nilai awal: "); int awal = scanner.nextInt();
                System.out.print("Masukkan nilai akhir: "); int akhir = scanner.nextInt();

                DeretPrima deretPrima = new DeretPrima(awal, akhir);
                deretPrima.showDeret();
                break;
            }
            default:
                System.out.println("Pilihan tidak ada!");
        }

    }
}