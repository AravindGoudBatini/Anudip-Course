package Lab_5;

import java.io.*;
class Student implements Serializable

{
   private int id;
   private String studentName;
   private boolean active;

   public Student() {
	
}
   public int getId() {
	   
	return id;
}
public String getStudentName() {
	return studentName;
}
public boolean getCheckStatus(){
    return active;
}
public void setId(int id) {
	this.id = id;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public void setCheckStatus(boolean active){
    this.active=active;
}
   
}

public class StudentUsingBean {
	 public static void main (String args[]) {
		 Student student = new Student ();
		 student.setId(101);
         student.setStudentName("Naruto");
         student.setCheckStatus(true);
         System.out.println("Student ID :"+student.getId());
         System.out.println("Student Name :"+student.getStudentName());
         System.out.println("Student active status :"+student.getCheckStatus());
}
}
