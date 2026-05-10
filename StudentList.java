/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunny_lab9_prob1;

/**
 *
 * @author slbru
 */
public class StudentList {
    private Student head;
    
    public StudentList(){
        head = null;
    }
    public void createStudent(String ID, String fName, String lName, double GPA){
        head = new Student(ID, fName, lName, GPA, head);
    }
    public Student getHead(){
        return head;
    }
    public boolean deleteHeadStudent(){
        if (head !=null){
            head = head.getLink();
            return true;
        }
        else {
            return false;
        }
    }
    public int studentsInList(){
        int count = 0;
        Student position = head;
        while (position != null){
            count++;
            position = position.getLink();
        }
        return count;
    }
    public boolean contains (String lName){
        return (find(lName)!= null);
    }
    private Student find(String searchItem){
        Student position = head;
        String itemAtPosition;
        while (position != null){
            itemAtPosition = position.getlName();
            if (itemAtPosition.equals(searchItem)){
                return position;
            }
            position = position.getLink();
        }
        return null;
    }
    public void outputList(){
        Student position = head;
        while (position != null){
            System.out.println("Student ID: " + position.getID() + " Name: " 
                    + position.getfName() + " " + position.getlName() + " GPA: " + position.getGPA());
            position = position.getLink();
        }
    }
    public void orderList (Student head){
        Student i, j;
        String tID;
        String tfName;
        String tlName;
        double tGPA;
        
        i = head;
        for (i=head; i!=null; i=i.getLink()){
            for(j=i.getLink(); j!=null; j=j.getLink()){
                if(i.getGPA()<j.getGPA()){
                    tID = i.getID();
                    tfName = i.getfName();
                    tlName = i.getlName();
                    tGPA = i.getGPA();
                    i.setStudent(j.getID(), j.getfName(), j.getlName(), j.getGPA());
                    j.setStudent(tID, tfName, tlName, tGPA);
                }
            }
        }
    }
    public void append (String ID, String fName, String lName, double GPA){
        if(head == null){
            createStudent(ID, fName, lName, GPA);
            return;
        }
        Student current = head;
        while(current.getLink() != null){
            current = current.getLink();
        }
        createStudent(ID, fName, lName, GPA);
    }
}
