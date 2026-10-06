package DSA;

public class fibonacciSeries {
    public static void main(String[] args) {
    int n = 10;
    int firstterm = 0;
    int secondterm = 1;

    System.out.println("fibonaccci sereies upto " + n);
    for(int i=0; i<=n; i++){
        
        int nextterm = firstterm + secondterm;
        firstterm = secondterm;
        secondterm = nextterm;
        System.out.println(nextterm);
    }
    }
}
