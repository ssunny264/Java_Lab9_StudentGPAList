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
public class Student {
    private Student link;
    private String ID;
    private String fName;
    private String lName;
    private double GPA;
   
    
    public Student (String ID, String fName, String lName, double GPA, Student next){
        this.link = next;
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.GPA = GPA;
    }
    public void setStudent(String ID, String fName, String lName, double GPA){
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.GPA = GPA;
    }
    public void setLink (Student next){
        this.link = next;
    }
    public String getID(){
        return ID;
    }
    public String getfName(){
        return fName;
    }
    public String getlName(){
        return lName;
    }
    public double getGPA(){
        return GPA;
    }
    public Student getLink(){
        return link;
    }
}
