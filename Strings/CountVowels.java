package Strings;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(Character.isLetter(ch)) {

                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}