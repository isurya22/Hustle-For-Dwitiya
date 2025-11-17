package org.java.Interview.Comparable.PracticeDay1;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getCity(){
        return city;
    }

    public Student(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
