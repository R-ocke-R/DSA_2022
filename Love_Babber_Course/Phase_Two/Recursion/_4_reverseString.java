package Phase_Two.Recursion;
public class _4_reverseString {
    
    public static String recursiveReverse(String str){
        if(str.length()==0) return "";
        return recursiveReverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        String str="Manu Sharma";
        System.out.println(recursiveReverse(str));
    }
}
