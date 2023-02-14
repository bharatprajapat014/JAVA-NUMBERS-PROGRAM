

public class perfectnumber {
    public static void main(String[] args) {
        int n=6,sum=0;
        for (int i=1;i<100;i++)
        {
            if (n%i==0)
            {
               sum = sum+i;
            }
        }
        if (n==sum)
        {
            System.out.println("perfectnumber");
        }
        else
        {
            System.out.println("no");
        }
    }
}
