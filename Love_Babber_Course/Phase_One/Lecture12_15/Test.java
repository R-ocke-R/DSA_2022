package Lecture12_15;

public class Test {
    public static void main(String[] args) {
        int mid=20;
        int[] arr= new int[]{20, 15, 10, 17};
        int woodCollected=0;
        for (int i = 0; i < arr.length; i++) {
            woodCollected+=Math.abs(arr[i]-mid);
            
                
            
        }
        System.out.println(woodCollected);
    }
    
}
