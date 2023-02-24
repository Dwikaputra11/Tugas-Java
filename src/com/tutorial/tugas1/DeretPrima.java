package com.tutorial.tugas1;

public class DeretPrima {
    private final int awal;
    private final int akhir;

    public DeretPrima(int awal, int akhir) {
        this.awal = awal;
        this.akhir = akhir;
    }

    public void showDeret(){
        System.out.println("Deret prima dari " + awal + " - " + akhir+":");
        boolean isPrime;
        for(int i = awal; i <= akhir; i++){
            isPrime = true;
            for(int j = 2; j <= i/2; j++){
                if (i % j == 0 && i != j) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.print(i + " ");
        }
    }
}