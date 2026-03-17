import java.util.*;
public class secMax{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int max=arr[0];
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
                
            }else if(arr[i]>secMax&&arr[i]!=max){
                secMax=arr[i];
            }
        }
        // System.out.println(max);
        System.out.println(secMax);
        sc.close();
    }
}