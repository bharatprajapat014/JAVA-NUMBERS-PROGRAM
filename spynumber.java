package X2023;

public class spynumber {
    public static void main(String[] args) {
        int num=1124;
        int n,sum=0,prod=1,d;
        n=num;
        while(num!=0)
        {
           d=num%10;
           sum=sum+d;
           prod=prod*d;
           num=num/10;
        }
        if(sum==prod)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
