package X2023;

public class primenumber {
    public static void main(String[] args) {
        int num=21,c=0,i;
        for (i=1;i<num;i++)
        {
            if (num%i==0)
            {
                c++;
            }
        }
        if (c==1)
        {
            System.out.println("prime");
        }
        else System.out.println("not prime");
    }
}
