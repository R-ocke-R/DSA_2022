import java.util.HashMap;
import java.util.Scanner;

// This question was given on 7thJan in last offline class.
// find frequency of each vowel in input string, and store in a hash map as key value pairs.


public class VowelFrequencyAssignment {
    public static void main(String[] args) {
        // its advised to use a Map (dict type) from collections framework

        // Character and Integer as key and value parameter and using wrapper classes as CF works with objects only
        HashMap<Character, Integer> freq= new HashMap<>();

        //can manually put a, e, i, o, u with freq 0; using a list here to do the same and reduce redundancy
        char[] vowelList= {'a', 'e', 'i', 'o', 'u'};

        for (int i=0; i<vowelList.length;i++){
            freq.put(vowelList[i], 0);
        }

        // now freq has all vowels with freq of each set as 0 (default)
        // System.out.println( freq.toString());
        
        String input=null;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the string");
            input=sc.nextLine().toLowerCase();
                   
        }
        for (int i=0; i<input.length();i++){
            char c=input.charAt(i);
        //     freq.containsKey(c) ? freq.put(c, freq.get(c)+1) : continue;
        //  can I do this tertiatory work without the resultant variable part 
            if (freq.containsKey(c)){
                
                freq.put(c, freq.get(c)+1);
            }
        }
        System.out.println( freq.toString());
    }
}

// int count = map.containsKey(word) ? map.get(word) : 0;
// map.put(word, count + 1);