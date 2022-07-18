package Lecture12_15;

import java.util.*;


public class AggresiveCows{

}

class Main1
{
    public static boolean func(int[] arr, int n, int c, int mid){
        int cows=1;//first cow at first location
        int lastlocation=arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]-lastlocation>=mid){
                lastlocation=arr[i];
                cows+=1;
            }
            else{
                continue;
            }
            
        }
        if(cows>=c) return true;
        return false;
    }

    public static int cows(int[] arr, int n, int c){
        //function takes sorted arr with stall coordinates, and c as the number of cows
        int s=1;
        //for minimum cows=2 constraint, the max range will be arr[-1]-arr[0]
        int e=arr[n-1]-arr[0];
        int mid=s+(e-s)/2;
        int ans=mid;
        while(s<=e){
            mid=(s+(e-s)/2);
            if(func(arr, n, c, mid)){
                //this placement of cows is possible
                //but we need the maximum distance, so all before this range int
                //are possible too. we check for e=mid+1;
                s=mid+1;
                ans=mid;
            }
            else{
                e=mid-1;;
            }
            
        }
        return ans;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner sc= new Scanner (System.in)){
            int test=sc.nextInt();
            while(test--!=0){
                int n=sc.nextInt();
                int c= sc.nextInt();
                int[] arr=new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i]=sc.nextInt();
                }
                System.out.println("Input Array Locations");
                System.out.println(Arrays.toString(arr));
                Arrays.sort(arr);//this is crucial. //log n
                System.out.println(cows(arr, n, c));
            }
        }
	}
}