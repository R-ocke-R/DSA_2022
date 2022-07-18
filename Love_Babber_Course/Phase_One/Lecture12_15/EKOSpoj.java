package Lecture12_15;
import java.io.*;
import java.util.*;

public class EKOSpoj {
    
}

class Main
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
	}
    public static boolean func(int[] arr, int n, int woodNeeded, long mid){
        // at height mid, we get x amount of wood if its equal to or more than needed return true;
        long woodCollected=0;
        for (int i = 0; i < n; i++) {
			if(arr[i]>mid){
                woodCollected+=arr[i]-mid;
            }
        }
        
        if(woodCollected>=woodNeeded)
                return true;
            
        return false;
            
    }

    public static long cows(int[] arr, int n, int wood, long e){

        long s=0;// at this point the machine cuts wood from the root thus gets wood=sum(arr);

        e=e-1;// at this point of range the machine is set to cut only one block of wood from the highest tree.

        long mid=s+(e-s)/2;

        long ans=mid;
        while(s<=e){
            mid=(s+(e-s)/2);
            if(func(arr, n, wood, mid)){
                //this means the at this mid (height of machine) is equal to more than need.
                //so either this is the answer or he can increase the height.
                s=mid+1;
                ans=mid;
            }
            else{
                e=mid-1;
            }
            
        }
        return ans;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// try(Scanner sc= new Scanner (System.in)){
            FastReader sc = new FastReader();
            System.out.println("Welcome to EKO");
            int n=sc.nextInt();
            int wood= sc.nextInt();
            int[] arr=new int[n];
            int e=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt(); e=Math.max(arr[i], e);
            }
            System.out.println("Input Array Locations");
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);//this is crucial. //log n
            System.out.println(cows(arr, n, wood, e));
            
        // }
	}
}
