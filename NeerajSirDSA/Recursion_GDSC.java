class Recursion_GDSC{
    public static void main(String[] args) {
        //calling methods from here
        System.out.println(sort_check(new int[] {1,6,3,4,5}, 0));
    }
    public static boolean sort_check ( int arr[], int idx) {
        // this is int based array, can I make something that reduces the redundancy using wrapper classes 
        if (idx== arr.length-1){
            return true;
        }
        return (arr[idx] <arr[idx+1])&& sort_check(arr, idx+1);
    }
    // public static String removeString
}