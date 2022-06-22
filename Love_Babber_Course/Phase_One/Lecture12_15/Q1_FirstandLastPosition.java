package Lecture12_15;
public class Q1_FirstandLastPosition{
    public static int[] BSearch(int[] arr, int ele, int start, int end){        
        while(start<=end){
            // int mid= (start+end)/2;
            // Optimising this.
            int mid=start+((end-start)/2); 
            if (arr[mid]==ele){
                return (new int[]{start, mid, end});
            }
            else if(arr[mid]>ele){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return new int[]{-1, -1, -1};
    }
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0,1,1,2,2,3,4,4,5,5,5,5,6,7};
        int target=0;
        int [] buffer=BSearch(arr, target, 0, arr.length-1);

        if(buffer[0]==-1){
            // return new int[]{-1, -1};
            System.out.println("NO ELEMENT FOUND AT ALL");
        }

        int first=buffer[1];
        int last=buffer[1];
        int end=buffer[2];



        // To slightly increase the complexity I can use 0th element as mid.
        // int[] buffer = new int[3];// constant space array
        while (true){
            // int[] fir=BSearch(arr, target, buffer[0], buffer[1]-1);
            buffer=BSearch(arr, target, buffer[0], first-1);

            if(buffer[0]==-1){
                System.out.println("value of first occurance is "+first);
                break;
            }
            first=buffer[1];        
        }
        buffer[2]=end;
        while(true){
            
            
            buffer=BSearch(arr, target, last+1, buffer[2]);
            if(buffer[2]==-1){
                System.out.println("value of last occurance is "+last);
                break;
            }
            last=buffer[1];
        }
        
        
    }
}