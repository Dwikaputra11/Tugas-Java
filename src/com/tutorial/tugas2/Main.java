package com.tutorial.tugas2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String s;
        System.out.println("1. Cek Palindrome");
        System.out.println("2. Cek Alphabet");
        System.out.print("Pilih: "); int pil = scanner.nextInt();

        System.out.println("Masukkan kata: ");
        s = scanner.nextLine();
        s += scanner.nextLine();

        switch (pil) {
            case 1 -> {
                if (isPalindrome(s.trim(), 0, s.length() - 1)) System.out.println(s + " adalah palindrome");
                else System.out.println(s + " bukan palindrome");
            }
            case 2 -> checkAlphabetAndSpace(s);
            default -> System.out.println("Pilihan tidak sesuai!");
        }
    }

    public static boolean isPalindrome(String s, int a, int b){
        if(b == a || b < a){
            return true;
        }
        else{
            if(s.charAt(a) != s.charAt(b)) return false;
            else return isPalindrome(s, a + 1, b - 1);
        }
    }

    private static void checkAlphabetAndSpace(String s){
        String vowel    = "aiueoAIUEO";
        int totalVowel  = 0;
        int totalCons   = 0;
        int space       = 0;
        Map<Character, Integer> vowelChar        = new HashMap<>();
        Map<Character, Integer> consonantChar    = new HashMap<>();

        char[] strArray = s.toCharArray();
        for(char c: strArray){
            if(vowel.contains(String.valueOf(c))){
                totalVowel++;
                try {
                    vowelChar.put(c , vowelChar.get(c) + 1);
                }catch (NullPointerException e){
                    vowelChar.put(c, 1);
                }
            }else{
                if(c == ' ') space++;
                else{
                    totalCons++;
                    try {
                        consonantChar.put(c , consonantChar.get(c) + 1);
                    }catch (NullPointerException e){
                        consonantChar.put(c, 1);
                    }
                }
            }
        }

        System.out.println("Vowel(" + totalVowel + "): ");
        vowelChar.forEach((k , n) -> System.out.println(" -" + k + ": " + n));

        System.out.println("Consonant(" + totalCons + "): ");
        consonantChar.forEach((k , n) -> System.out.println(" -" + k + ": " + n));

        System.out.println("Spacer: " + space);
    }
}
