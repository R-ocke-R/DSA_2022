package Lecture12_15;
public class PaintersPartition{


}

class Solution{
    static boolean paint(int mid, int[] arr, int k){
        int boardPainted=0;
        int painter=1;
        for (int i = 0; i < arr.length; i++) {
            if(boardPainted+arr[i]<=mid){
                boardPainted+=arr[i];

            }
            else{
                painter++;
                if(painter>k || arr[i]>mid){
                    return false;
                }
                boardPainted=arr[i];
            }

        }
        return true;

    }
    static long minTime (int[] arr, int n, int k){
        int s=0;
        int e=0;
        for (int index = 0; index < arr.length; index++) {
            e+=arr[index];
        }
        int mid=s+((e-s)/2);
        while(s<=e){
            if(paint(mid, arr, k)){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        return (long)s;
    }
    public static void main(String[] args) {
        //this worked on gfg, but had to turn all variables: s, e, mid, boardPainters, etc. to long for very large nums.
    }
}