import java.util.Scanner;

public class Methods {

    public static void main (String[] args){

        // Get marks from users
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];
        for(int i = 0; i < marks.length; i++){
            marks[i] = scan.nextInt();
        }

        // print marks
        System.out.println("\nprinting marks:");
        for(int i = 0; i < marks.length; i++){
            System.out.println("marks[" + i + "] = " + marks[i]);
        }

        //modify marks
        System.out.println("modifying marks: ");
        for(int i = 0; i < marks.length; i++){
            marks[i] += 5;
        }

        // print marks
        System.out.println("Printing marks:");
        for(int i = 0; i< marks.length; i++){
            System.out.println("marks[" + i + "] = " + marks[i]);
        }



    }
}

