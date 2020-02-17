import java.util.*;

public class BubbleSort{
    static void swapping(int arr[]){
        int tem=0;
        
        
        for(int i=0;i<arr.length;i++){
            for(int j=1; j<(arr.length); j++){
                if (arr[j-1]>arr[j]){
                    tem=arr[j-1];
                    
                    arr[j-1]=arr[j];
                    arr[j]=tem;
                }
                
            }
        }
    }
    public static void main(String[] args){
        /*Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();*/
        int arr[]={1,344,54,5,45,4,45,45,34,6,5,65,65,5,45};
        
        
        /*System.out.println("enter the number to sort");
        for (int i=0;i<n;i++){
            int arr[]= sc.nextInt();
        }*/
        System.out.println();
        
        /*BubbleSort bb = new BubbleSort();
        next=bb.swapping(arr);*/
        swapping(arr);
        
        
        System.out.println("after sorting");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        
        }
    }
    

    //public static void main(String []args){
        
    // }
}