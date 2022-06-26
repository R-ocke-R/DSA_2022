package Lecture12_15;

public class RotatedSorted {
    
}
class Solution {
    public static int bs(int[] arr, int s, int e, int t){
        int mid=s+((e-s)/2);
        while(s<=e){
            if (arr[mid]==t){
                return mid;
            }
            else if(arr[mid]<t){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid=s+((e-s)/2);
            }
        return -1;
    }
    public static int search(int[] nums, int target) {
        //condition of no rotations
        if(nums[0]<nums[nums.length-1]) {
            System.out.println("here");
            return bs(nums, 0, nums.length-1, target);
        }
        
        int s=0;
        int e=nums.length-1;
        int m= s+((e-s)/2);
        while(s<e){
            if(nums[m]>=nums[0]){
                s=m+1;
            }        
            else{
                e=m; 
            }
            m=s+((e-s)/2);
        }
        // return nums[s];
        if(target==nums[s]){
            return s;
        }
        // return nums[s];
        if(nums[0]>target){
            // System.out.println("greater");
            return bs(nums, s, nums.length-1, target);
        }
        // System.out.println("lesser");
        // System.out.println( target);
        return bs(nums, 0, s, target);
    }
    public static void main(String[] args) {
        int[] arr= {3, 1};
        // System.out.println(bs(arr, 0, 1, 3));
        System.out.println(search( arr, 3));
    }
}