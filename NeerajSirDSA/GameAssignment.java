import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.InputMismatchException;
// import java.util.Iterator;
// import java.util.Scanner;

// This question was given on 7thJan in last offline class.
// question is to make a score board with insertion and deletion methods.(make this visually good)
// class score with int point and string name as data members, 
//  class resultClass with method (add method, in data memeber score arr[]) and void delete method search and delete the pos


interface ResultClass{
    // interface which will define the methods the game board must have
    void addScore(Scanner sc);
    void deleteScore(Scanner sc); // will remove by searching the score on given name.
}

class Score{
    int points;
    String name;
    Score(int p, String s){
        this.points= p;
        this.name= s;
    }
    
}

class HelperToSortWithPoints implements Comparator<Score>{

    @Override
    public int compare(Score o1, Score o2) {
        return o2.points-o1.points;
    }    
}

public class GameAssignment implements ResultClass{
    static ArrayList<Score> list= new ArrayList<>();


    // @Override                           We can't implement the Comparable interface in this class as our interface only have one method available (which has one parameter and we need two) 
    // public int compareTo(Score o) {     here this refers to class GameA, which doesn't have any points data member 
    //     return this.points - o.points;  so we will make a helper class using the concept of Comparator  "Unlike Comparable, Comparator is external to the element type we are comparing.""
    // }

    @Override
    //  think why we can't make this function static.
    public void addScore(Scanner sc) {
        try{
            System.out.println("Please Enter the score points and name");
        
            //  adding new object in sorted order
            int i=0;
            Score obj=new Score(sc.nextInt(), sc.next());
            for (i=0;i<list.size();i++){
                if (list.get(i).points<obj.points) 
                    break;
            }
            list.add(i, obj);
            }
            catch(InputMismatchException o){
                System.out.println("WRONG INPUTType.");
            }

        //  for adding out of order
        //  list.add(new Score(sc.nextInt(), sc.next()));
        
    }
    
    public void sortTheList(){
        HelperToSortWithPoints PointsCompare = new HelperToSortWithPoints();
        Collections.sort(list, PointsCompare);
    }
    
    public void changeScore(Scanner sc){

        // changing a player's Score will change the order of our list as they were manually sorted.
        //  so will use sorting using compator 
        
        System.out.println("Enter name of player");
        String name=sc.next();
        for (Score d:list){
            if (d.name.equals(name)){
                System.out.println("Enter new score for "+d.name);
                d.points=sc.nextInt();
                return;
            }
        }
        System.out.println("Player does not exist");
        System.out.println("adding this player's new score   Please enter their score");
        list.add(new Score(sc.nextInt(), name));
        this.sortTheList();
    }

    @Override
    public void deleteScore(Scanner sc) {
        System.out.println("Enter the name of cheater");
        String name=sc.next();
        for (Score d:list){
            if (d.name.equals(name)){
                list.remove(d);
                System.out.println("Cheater found and Deleted");
                return;
            }
        }
        System.out.println("There are no cheaters, WE HAVE A FAIR GAME");
    }

    public static void printy() {
        if (list.isEmpty()){
        System.out.println("START PLAYING NOW !");
        return;}

        //  IN ORDER TO A SORTED DISPLAY BASED ON POINTS, I CAN EITHER ENTER IN SORTED MODE, OR SORT THE LIST BEFORE PRINTING.
        // list.sort(c); doing this induces the concept of comparable and comparators.

        //  using enhanced loops
        // for (Score t:list){
        //     System.out.println("                                             "+t.name +" has the score points eqaul to = "+ t.points);
        // }

        // using iterator
        Iterator<Score> it= list.iterator();
        while(it.hasNext()){
            Score i=it.next();
            System.out.println("                                             "+i.name +" has the score points eqaul to = "+ i.points);
        }
    }
    
    public void menu(){
        System.out.println("ENTER YOUR CHOICE\n * 0. PRINT THE MENU\n * 1. PRINT THE LIST\n * 2. INPUT NEW SCORE OF NEW PLAYER\n * 3. INPUT HIGH SCORE OF EXISTING PLAYER\\ CHANGE SCORE\n * 4. DELETE SCORE OF CHEATER, (NAME BASED SEARCHING)\n * 5. REORDER THE SCORE / MODERATOR STEP\n * 6. DELETE SCORE BASED ON SCORE, (SCORE BASED SEARCHING)\n * -1 EXIT");
            
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            // will have to make a object to call non-static method, 
            GameAssignment ob= new GameAssignment();

            ob.menu();
            int ch= sc.nextInt();
            while (ch!=-1){
                switch (ch){
                    case 0 -> ob.menu();
                    case 1 -> printy();
                    case 2 -> ob.addScore(sc);
                    case 3 -> ob.changeScore(sc);
                    case 4 -> ob.deleteScore(sc);
                    case 5 -> ob.sortTheList();
                    default -> System.out.println("wrong choice");
                }
                ch=sc.nextInt();
                
            }
        }
    }
    
}