package DSA;

import java.util.Scanner;

public class EvenorOdd {
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the digit: ");
       int num = sc.nextInt();

    if(num%2 == 0 ){
    System.out.println("you entered digit is the even");
    }

    else{
    System.out.println("digit is odd");
    }
}
}
