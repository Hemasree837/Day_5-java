import java.util.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int num=sc.nextInt();
            int temp=num;
            int rev=0;
            while(num>0)
            {
                int dig=num%10;
                rev=rev+dig*dig*dig;
                num/=10;
            }
            System.out.println(rev);
            if(temp==rev) System.out.println("Armstrong Number");
            else System.out.println("Not a Armstrong Number");

        }
    }
    
}
    

