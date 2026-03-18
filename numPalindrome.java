import java.util.Scanner;
public class numPalindrome{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int reverse=0;
        while(num>0){
            reverse=reverse*10+num%10;
            num/=10;
        }
        
        // System.out.println("Reversed"+reverse);
        // System.out.println(num);
        if(original==reverse)
        System.out.println("True");
        else
        System.out.println("False");
    }
}