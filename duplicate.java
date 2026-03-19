import java.util.*;
public class duplicate{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer>read=new HashSet<>();
        HashSet<Integer>res=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(read.contains(arr[i])){
                res.add(arr[i]);
            }else{
                read.add(arr[i]);
            }
        }
        System.out.println(res);
    }
}