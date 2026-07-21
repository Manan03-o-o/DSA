import java.util.Scanner;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;

        for(int num : arr) {

            if(num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}