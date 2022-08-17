package Phase_Two.Recursion;

public class _6_quickSort{

    public static int partition(int[] arr, int s, int e){
        int ele=arr[s];
        int count=0;
        for (int i = 0; i < e-s; i++) {
            if(arr[i]<ele){
                count++;
            }
            
        }
        if(count==0) return 0;
        //swap a[0] with a[count]
        arr[s]=arr[count];
        arr[count]=ele;

        //i have p in here, now mainting >a || a || <a
        int i=s;
        int j=e;
        while(i<count){
            if(arr[i]<=ele){
                i++;
                continue;
            }
            if(arr[j]>ele){
                j--;
                continue;
            }
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
            
        }
        return count;
    }

    public static void quick(int[] arr, int s, int e){
        if(s<=e) return ;

        int p=partition(arr, s, e);

        quick(arr, s, p-1);
        quick(arr, p+1, e);
    }

    public static void main(String[] args) {
        
    }
}