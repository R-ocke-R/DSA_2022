package Phase_Two.Recursion;

public class _7_sameQuestionViaBitManipulation {

    public static void bitmasks(int[] set) {
        int n= set.length;
        int nthBit = 1 << n;
        // System.out.println(nthBit);
        for (int i = 0; i < (int)Math.pow(2, n); ++i) {
        // generate bitmask, from 0..00 to 1..11
            String bitmask = Integer.toBinaryString(i | nthBit).substring(1);
            System.out.println(bitmask);
        }
    }
    
    public static void main(String[] args) {
        //solving the same two questions using bit manipulation

        // the approach is to create all the bit masks of length n where n equals to length of the set
        // so how do we create all those bit masks
        bitmasks(new int[]{1,2, 3});
        //understood how to create all those bit masks, much more simple than it looks 
        //step 2 of the question is to map the bitmasks to the respective nums[i] and create subsets.
        //above solution taken from leetcode official solution


        //time complexity and space complexity of the whole solution N*(2**n)
    }
}
