public class Searching {
    static int a=200;
    public static int linearSearch(int[] arr, int a){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==a){
                return i;
            }
        }
        return -1;
    }

    public static int RecursiveBS(int [] arr, int a, int min, int max){
        if(max>=min){
        int mid=(min+max)/2;
        System.out.println(mid+" "+ min+", "+max);
        if (min>max){
            return -1;
        }
        if (arr[mid]==a){
            return mid;
        }
        if (a<arr[mid]){
            return RecursiveBS(arr, a, min, mid-1 );
        }
        else if(a>arr[mid]){
            return RecursiveBS(arr, a, mid+1, max );
        }
        
    }
    return -10;
    }

    public static int IterativeBS(int[] arr, int a){
        int min=0;
        int max=arr.length;
        while(min<=max){
            int mid=(min+max)/2;
            if (arr[mid]==a){
                return mid;
            }
            else if(arr[mid]>a){
                // min=mid+1;
                max=mid-1;
            }
            else{
                // max=mid-1;
                min=mid+1;
            }
        }
        return -1;
    }
    
    public static int BinarySearch(int[] arr, int a) throws InterruptedException{
        // the array arr must be sorted
        System.out.println("Checking whether the array is sorted or not");
        // To do this we have two approaches, comparing with copy of the array which is sorted,
        // but why should I do that, let's go with a linear time complexity approach comparing the
        // consequetive elements
        // Thread.sleep(1000); 
        // for ascending order sorted
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]<= arr[i+1]){
                continue;
            }
            else{
                System.out.println("array not sorted in ascending order");
                return -1;
            }
        }
        System.out.println("We have a sorted array");
        // if we are here, the array is sorted, next is to do the binary search
        // binary search can be done iteratively or Recursively, will be quickly doing both, in seperate funcitons.
        // return RecursiveBS(arr, a, 0, arr.length-1);
        return IterativeBS(arr, a);
    }
    // public static void main(String[] args) {
    //     // int[] arr= new int[10];
    //     int[] arr={1, 2, 3 ,4, 5, 6, 7, 8, 9, 10};
    //     System.out.println("Your array looks like this "+Arrays.toString(arr));
    //     try(Scanner sc = new Scanner (System.in)){
            
    //         System.out.println("Enter element to Search");
    //         int a=sc.nextInt();
    //         int ls=linearSearch(arr, a);
    //         if(ls==-1){
    //             System.out.println("number not found");
    //         }
    //         else{
    //             System.out.println("Number found at index "+ls);
    //         }
    //     }

    // }
        public static void main(String[] args) throws InterruptedException {
        // int[] arr= new int[10];
        int[] arr={0, 1, 2, 3 ,4, 5, 6, 7, 8, 9, 10};
        // System.out.println("Your array looks like this "+Arrays.toString(arr));
        // try(Scanner sc = new Scanner (System.in)){
            
        //     System.out.println("Enter element to Search");
        //     int a=sc.nextInt();
        //     int ls=BinarySearch(arr, a);
        //     if(ls==-1){
        //         System.out.println("number not found");
        //     }
        //     else{
        //         System.out.println("Number found at index "+ls);
        //     }
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(BinarySearch(arr, i));
        }

    }
    
}
