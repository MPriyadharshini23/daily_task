import java.util.Scanner;
public class squareRoot {
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int left=1,right=n;
        int result=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(mid*mid==n){
                result=mid;
                break;
            }else if(mid*mid<n){
                result=mid;
                left=mid+1;
            }else
            right=mid-1;
        }
        System.out.println(result);
    }
}
