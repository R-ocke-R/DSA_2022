// LAB 16th feb.

// INPUT STRING FROM COMMAND LINE
// INPUT ONLY INTERGER IN STRING TYPE 
// ENTER RESTRICTIONS THAT IF MORE THAN THREE STRINGS THAN RESTRICT THE PROGRAM AND HALT THE PRGRAM

// SUM OF SUM OF DIGITS IN CYCLIC ORDER -- for each number in string
// return the result in string format and add in queue by linked linst.

// "12345"   -> 1+2+3+4+5  +(2+3+4+5)+(3+4+5)+(4+5)+(5)



// class node{
//     String data;
//     node next;
//     node(String data){
//         this.data= data;
//     }
// }

    
// public class QueueByLL {
//     node front;
//     node rear;
//     public void Enqueue(String data){
//         node nw=new node(data);
//         if (front==null){
//             front=nw;
//             rear=nw;
//             return;
//         }
//         rear.next=nw;
//         rear=rear.next;
//     }
    
// }

class sumOfsumOfDigitsInCyclic{
    public static void main(String[] args) {
        String[] number={"12345", "23456", "12325512"};
        if (number.length>3){
            System.out.println("Number more than expected");
            return;
        }
        for (int i = 0; i < number.length; i++) {
            int finalsum=0;
            int tempsum=0;
            for (int index = 0; index < number[i].length(); index++) {
                String now=number[i].substring(index);
                    int num=Integer.valueOf(now);
                    // char.getNumericValue
                    while(num!=0){
                        tempsum+=num%10;
                        num/=10;
                }
                finalsum+=tempsum;
                tempsum=0;   
            }
            System.out.println("Integer   "+number[i]+" sum " +finalsum);
        }
    }
}

