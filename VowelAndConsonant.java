package DSA;

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.next();

        int vowel = 0;
        int consonants = 0;
        int space = 0;

        for(char c : str.toCharArray()){
     if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        vowel++;
     }
     else if (c >= 'a' && c <= 'z') {
         consonants++;
        }
        
    else if(c==' '){
space++;
    }
        }

        System.out.println("vowel " + vowel);
        System.out.println("consonant " + consonants);
        }
}
