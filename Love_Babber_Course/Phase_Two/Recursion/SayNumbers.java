package Phase_Two.Recursion;

class SayNumbers {
    static String[] words=new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void headRecursion(int n){
        int num=n%10;
        n/=10;
        if(n==0){
            System.out.print(words[num]+" ");
            return ; 
        }
        headRecursion(n);
        System.out.print(words[num]+" ");
    }
    public static void main(String[] args) {
        headRecursion(76351);
    }
    
}
