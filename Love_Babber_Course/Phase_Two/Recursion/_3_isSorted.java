package Phase_Two.Recursion;
public class _3_isSorted {
    // can send arr as subscript from first index or can send i as a parameter(that would make it mostly loop)
    public static boolean isSorted(int[] arr, int n){
        if(n<=1) return true;
        if(arr[n-1]<arr[n-2])return false;
        return isSorted(arr, n-1);
    }
    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // int[] arr= new int[]{10, 20, 30, 40, 50, 60, 70};
        int[] arr2= new int[]{10, 20, 30, 40, 50, 60, 59};
        System.out.println(isSorted(arr2, arr2.length));
    }
}
