
package Lecture22;
public class Palindrone {


    public static boolean palindroneOptimised(String n){
        int s=0;
        int e=n.length()-1;
        while(s<e){
            if(n.charAt(s++)!=n.charAt(e--)){
                return false;
            }

        }
        return true;
    }

    public boolean isPalindromeLeetCode(String s) {
        
    
        String ss=new String();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ss+=Character.toLowerCase(ch);
            }
        }
        if(ss.length()<2) return true;
        int st=0;
        int e=ss.length()-1;
        while(st<e){
            if(ss.charAt(st++)!=ss.charAt(e--)){
                return false;
            }
        }
        return true;
        
    }

    public static boolean checkPalindromeCodestudio(String str){
        String ss=new String();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            if(Character.isLetter(ch)|| Character.isDigit(ch)){
                ss+=ch;
            }
        }
        System.out.println(ss);
        int s=0;
        int e=ss.length()-1;
        while(s<e){
            if(Character.toUpperCase(ss.charAt(s++))!=Character.toUpperCase(ss.charAt(e--))){
                return false;
            }
        }
        return true;

    }

    // public static void palindroneWithTwoStrings{String n}{

    // }
    
    
    public static void main(String[] args) {
        // String s=new String("ManuunaM12315*&34");
        String s=new String("c1 O$d@eeD o1c");
        // System.out.println(palindroneOptimised(s));
        System.out.println(checkPalindromeCodestudio(s));
        System.out.println(Character.toUpperCase('5'));
        
        

    }
}


// a more optimised appraoch can be coded with just one while loop, and two pointers. thus no extra space for cleaner string.

// character.tolowercase is equal to ch+'a'-'A';