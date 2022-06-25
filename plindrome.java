import java.io.*;
import java.util.*;
class plindrome
    {
        public void main()
        {
             Scanner sc = new Scanner(System.in);
             int number = sc.nextInt();
             int temp = number;
             int reverse = 0 ;
             int num;
             for(; number!=0; )
             {
                num = number%10;
                 reverse = reverse *10 + num;
                 number = number /10;
                }
                System.out.println(reverse);
                System.out.println(number);
                if(reverse == temp)
                {
                    System.out.println("the integer is a palindrome number ");
                }
                else
                {
                    System.out.println(" not palindrome");
            }
        }
        }
    
 