import java.util.*;
public class Reverse
{
    public static void main(String args[])
    {
        int number, reversed=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        number=scan.nextInt();
        while(number!=0)
        {
            int rem=number%10;
            reversed=reversed*10+rem;
            number=number/10;
        }
        System.out.println("The reverse number is: " + reversed);
    }


}


