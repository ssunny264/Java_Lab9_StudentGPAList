/*
 * Sara Sunny - Lab 9 - Problem 1
 */
package sunny_lab9_prob1;

import java.util.Scanner;

/**
 *
 * @author slbru
 */
public class Sunny_Lab9_Prob1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ID, fName, lName;
        double GPA;
        
        StudentList list = new StudentList();
        
        list.createStudent("1", "Sara", "Sunny", 3.9);
        list.createStudent("2", "Will", "Smith", 3.0);
        list.createStudent("3", "John", "Doe", 3.5);
        
        System.out.println("Original List: ");
        list.outputList();
        System.out.println();
        
        System.out.println("Ordered List by descending GPA values: ");
        list.orderList(list.getHead());
        list.outputList();
        
        System.out.println();
        System.out.println("Enter the students ID, first and last name, and GPA (in this order)" );
        ID = in.next();
        fName = in.next();
        lName = in.next();
        GPA = in.nextDouble();
        
        list.createStudent(ID, fName, lName, GPA);
        System.out.println();
        list.orderList(list.getHead());
        list.outputList();
    }    
}
