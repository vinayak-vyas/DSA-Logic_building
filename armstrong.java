package DSA;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a digit");
        int num = sc.nextInt();
            int sum = 0;
           int newnum = num;
            int digit = 0;
            int temp = num;
           while(temp > 0) {
            digit++;
            temp /= 10;
           }
            temp = num;
           while(temp > 0) {
            int rem = temp % 10;
              int  prod = 1;
            for(int i = 0; i < digit; i++) {
                prod = prod * rem;
            }
            sum += prod;
            temp /=10;
           }
           if(sum == newnum) {
            System.out.println("armtrong");
           }
           else{
            System.out.println("not ");
           }
    }
}
