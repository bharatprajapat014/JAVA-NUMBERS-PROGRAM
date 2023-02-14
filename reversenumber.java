package X2023;
import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        int n=123, num, r, rev = 0;
        num = n;
        while (num > 0)
        {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        System.out.println("Reverce of Number=" + rev);

    }
}
