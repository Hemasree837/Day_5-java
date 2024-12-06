import java.util.*;
public class Palindrome {
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
                rev=rev*10+dig;
                num/=10;
            }
            System.out.println(rev);
            if(temp==rev) System.out.println("Palindrome");
            else System.out.println("Not a palindrome");

        }
    }
    
}
