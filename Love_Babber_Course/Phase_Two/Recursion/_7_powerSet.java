package Phase_Two.Recursion;

import java.util.*;

public class _7_powerSet {
    public static void printy(ArrayList<ArrayList<Integer>> ans){
        for (ArrayList<Integer> arra : ans) {
            System.out.println(arra.toString());
        }
    }
    public static List<List<Integer>> powerSet(int[] set, int i, ArrayList<Integer> pow, List<List<Integer>> ans){
        //base
        if(i==set.length) {
            // ans.add(pow);
            ans.add(new ArrayList<>(pow));
            // System.out.println(pow.toString());
            return ans;
        }
        //exclude and call
        powerSet(set, i+1, pow, ans);

        //include and call
        pow.add(set[i]);
        
        powerSet(set, i+1, pow, ans);
        pow.remove(pow.size()-1);
        
        
        return ans;

    }
    public static void answer(int index, String str, String dum, ArrayList<String> ret){
        if(index==str.length()){
            if(dum.length()==0) return ;
            ret.add(dum);
            return;
        }
        answer(index+1, str, dum, ret);
        dum+=str.charAt(index);
        answer(index+1, str, dum, ret);
        return ;
    }
    public static ArrayList<String> subsequences(String str) {
        //using the same logic of the leetcode subset question
        // have to return a arrayList of string
        ArrayList<String> ret= new ArrayList<>();
        answer(0, str, new String(), ret);
        return ret;
    }
    
    
    public List<List<Integer>> subsets(int[] nums) {
        
        return new ArrayList<List<Integer>>();
    }



    public static void main(String[] args) {
        // int n;
        // int set[];
        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.println("Enter length of the set");
        //     n=sc.nextInt();
        //     set=new int[n];
        //     System.out.println("Now Enter all its Elements");
        //     for (int i = 0; i < n; i++) {
        //         set[i]=sc.nextInt();
        //     }
        // }
        // (powerSet(set, 0, new ArrayList<Integer>(), new List<List<Integer>>()));
        ArrayList<String> ne= new ArrayList<String>();
        ne=subsequences("abc");
        for (String string : ne) {
            System.out.println(string);
        }
        
    }
    
}
