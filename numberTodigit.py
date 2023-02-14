package X2023;

public class numberdigits {
    public static void main(String[] args) {
        int num=123,n;
        int digit;
        n=num;
        while(num!=0)
        {
            digit = num%10;
            System.out.println(digit);
            num=num/10;
        }
    }
}
