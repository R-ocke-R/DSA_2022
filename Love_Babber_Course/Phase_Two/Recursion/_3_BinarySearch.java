package Phase_Two.Recursion;
public class _3_BinarySearch {


    public static boolean recursiveBinary(int s, int e, int[] arr, int target){
        if(s>e) return false;
        int mid=s+(e-s)/2;
        if(target==arr[mid])return true;
        if(target>arr[mid]) return recursiveBinary(mid+1, e, arr, target);
        return recursiveBinary(s, mid-1, arr, target);
    }
    
    
    
    public static void main(String[] args) {
        int[] arr= new int[]{15, 20, 30, 40, 50, 60, 70};

        System.out.println("Searching the Following element in the array");
        int target=75;
        System.out.println(recursiveBinary(0, arr.length-1, arr, target));
    }
}
