package Phase_Two.Recursion;

import java.util.*;
public class _9_permutations {
    public static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void answer(int index, List<List<Integer>> ans, int[] nums){
        if(index==nums.length) {
            ArrayList<Integer> dum=new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                dum.add(nums[i]);
            }
            ans.add(new ArrayList<>(dum));
            return;
        }
        // steps: we have to give chance to each element from index to size to sit at position index and rest recuriosn will do.
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            answer(index+1, ans, nums);
            swap(nums, index, i);
        }
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int index=0;
        answer(index, ans, nums);
        // for (List<Integer> list : ans) {
        //     System.out.println(list.toString());
        // }
        return ans;
        
        
    }
    

    public static void main(String[] args) {
        //question from leetcode, love babber dsa series
        //[1, 2, 3] is a input array return all permutations of the array
        // Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        int nums[]=new int[]{1, 2, 3};
        permute(nums);

    }
}
