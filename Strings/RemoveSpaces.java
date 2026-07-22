package Strings;

import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String ans = "";

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) != ' ') {
                ans += str.charAt(i);
            }
        }

        System.out.println(ans);
    }
}