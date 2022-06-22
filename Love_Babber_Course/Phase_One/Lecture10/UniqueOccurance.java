package Lecture10;
import java.util.*;

// import java.util.*;
// public class Solution {
//     public boolean uniqueOccurrences(int[] arr) {
// //         most basic approach
//         HashMap<Integer, Integer> map= new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             if(map.containsKey(arr[i])){
//                 int valu=map.remove(arr[i]);
//                 valu++;
//                 // System.out.println(valu);
//                 map.put(arr[i],(valu));
//                 // System.out.println(map.get(arr[i]));
//             }
//             else{
//             map.put(arr[i], 1);
//             }
//         }
//         Set<Integer> set = new HashSet<Integer> (map.values());
//         // System.out.println(set.toString());
//         if(set.size()==map.size()){
//             return true;
//         }
//         return false;
        
        
        
//         // return true;
//     }
//     public static void main(String[] args) {
//         Solution ob= new Solution();
//         int[] arr= {0, 1};
//         System.out.println(ob.uniqueOccurrences(arr));
//     }
// }
// // improve this code, by using not so shit code
// // other approach:
// // make array of 2000 size based on the constraints, now take frequency in the array, 
// // now sort this array, 
// // traverse the array and find out, if any adjacent element is the same.
// // public boolean uniqueOccurrences(int[] arr) {
// //     Map<Integer, Integer> count = new HashMap<>();
// //     for (int a : arr)
// //         count.put(a, 1 + count.getOrDefault(a, 0));
// //     return count.size() == new HashSet<>(count.values()).size();
// // }
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> n= new ArrayList<>();
        // List<Integer> n1= new LinkedList<>();
        // Question is to find all the Duplicates
        for (int i = 0; i < nums.length; i++) {
            System.out.println(n.toString());
        }
        return new ArrayList<>();
        
    }
}