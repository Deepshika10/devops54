import java.util.*;
public class binary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int num=2;
        int found=0;
        for(int i=left;i<=right;i++){
            while(left<right){
                int mid=(left+right)/2;
                if(num==arr[mid]){
                    found=1;
                }
                else if(num<arr[mid]){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        if(found==1){
            System.out.print("Found");
        }
        else{
            System.out.print("Not Found");
        }
    }
}