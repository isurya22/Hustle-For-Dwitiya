package org.java.fundamentals.CodePractices;

public class Example1 {
    private String studentName;
    private int studentId;
    private String studentDistrict;

    public void getStudentDetails(){
        System.out.println("Student Name is: " + studentName);
        System.out.println("Student Id is: "+ studentId);
        System.out.println("Student's District Name is: "+ studentDistrict);
    }

    public void setStudentDetails(String studentName,String studentDistrict, int studentId){
        this.studentName = studentName;
        this.studentDistrict = studentDistrict;
        this.studentId = studentId;
    }
}
