// package Love_Babber_Course.Phase_One.Lecture4;
package Lecture4;
public class Patterns {

    public static void one(int n) {
        /* 1 2 3 4
         * 1 2 3 4 
         * 1 2 3 4 
         * 1 2 3 4  for n=4
         */
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void two (int n) {
        /*
         * 1 2 3 
         * 4 5 6 
         * 7 8 9   for n=3
         */
        int count=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(count++);

            }
            System.out.println();
        }
    }
    public static void three(int n) {
        /*
         * ^
         * ^^
         * ^^^
         * ^^^^  for n=4
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("^");
            }
            System.out.println();
        }
    }
    public static void four(int n) {
        /*
         * 1
         * 22
         * 333
         * 4444  for n=4
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void five(int n) {
        /*
         * 1
         * 23
         * 456
         * 78910  for n=4
         */
        int count=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }
    }
    public static void six(int n) {
        /*
         * 1
         * 23
         * 345
         * 4567  for n=4
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
    public static void seven(int n) {
        /* 1 
         * 2 1 
         * 3 2 1 
         * 4 3 2 1  for n=4
         */
        for (int i = 1; i <=n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void eight(int n) {
        /* AAAA
         * BBBB
         * CCCC
         * DDDD     n=4
         */
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)('A'+i-1));
            }
            System.out.println();
        }
    }
    public static void nine(int n) {
        /* ABC
         * ABC 
         * ABC 
         *   for n=4
         */
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
    public static void ten(int n) {
        /* ABC
         * DEF
         * GHI
         * 1 2 3 4  for n=4
         */
        char c='A';
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(c++);
            }
            System.out.println();
        }
    }
    public static void tenone(int n) {
        /* ABC
         * BCD
         * CDE
         *   for n=4
         */
        // char c='A';
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char)('A'+i+j-1));
            }
            System.out.println();
        }
    }
    public static void tentwo(int n) {
        /* A
         * BB
         * CCC
         *  for n=3
         */
        char c='A';
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }
    public static void tenthree(int n) {
        /* D
         * CD
         * BCD
         * ABCD
         *   for n=4
         */
        // char c='A';
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A'+n+j-i-1));
            }
            System.out.println();
        }
    }
    public static void tenfour(int n) {
        /*    ^
         *   ^^
         *  ^^^
         * ^^^^
         *          for n=4
         */
        char c='^';
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <= n; j++) { //printing space n-row times
                System.out.print( " ");
            }
            for (int j = 1; j <= i; j++) { //printing object row times.
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void tenfive(int n) {
        /* ^^^^
         * ^^^
         * ^^
         * ^
         *          for n=4
         */
        char c='^';
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <= n; j++) { //printing object n-row
                System.out.print(c);
            }
            for (int j = 1; j <= i; j++) { //printing object row times. or lol you can omit that. 
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void tensix(int n) {
        /*    ^
         *   ^^
         *  ^^^
         * ^^^^
         *          for n=4
         */
        char c='^';
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j < i; j++) { //printing object row times.
                System.out.print(' ');
            }for (int j = i; j <= n; j++) { //printing space n-row times
                System.out.print(c);
            }
            
            System.out.println();
        }
    }
    public static void tenseven(int n) {
        /* 1234
         *  234
         *   34
         *    4
         *          for n=4
         */
        // char c='^';
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j < i; j++) { 
                System.out.print(' ');
            }for (int j = i; j <= n; j++) { 
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
    public static void teneight(int n) {
        /*       1
         *     1 2 1 
         *   1 2 3 2 1 
         * 1 2 3 4 3 2 1
         *          for n=4
         */
        // char c='^';
        for (int i = 1; i <=n; i++) {
            for (int j = i; j < n; j++) { //printing space n-row times
                System.out.print( " ");
            }
            for (int j = 1; j <= i; j++) { //printing object row times.
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void tennine(int n) {
        /*       dabaang pattern
         *          
         */
        char c='^';
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print(c);
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print(c);
            }
            for (int j = i; j <= n; j++) {
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // one(10);
        // two(3);
        // three(4);
        // four(4);
        // five(4);
        // six(4);
        // seven(15);
        // eight(5);
        // nine(4);
        // tenone(4);
        // tentwo(5);
        // tenthree(5);
        // tenfour(6);
        // tenfive(5);
        // tensix(10);
        // tensix(4);
        // tenseven(6);
        tennine(5);

    }
}
