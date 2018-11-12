package Task2;

import java.io.Serializable;

public class Course implements Serializable {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(){
        this.courseName="no name";
        instructor =null;
        textbook = null;
    }
    public Course(String courseName,Instructor instructor,Textbook textbook){
        this.courseName = courseName;
        this.instructor = new Instructor(instructor.getFirstName(),instructor.getLastName(),instructor.getDepartment(),instructor.getEmail());
        this.textbook = new Textbook(textbook.getIsbn(),textbook.getTitle(),textbook.getAuthor());
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }
    public void setTextbook(Textbook textbook){
        this.textbook = textbook;
    }
    public String getCourseName(){
        return courseName;
    }
    public Instructor getInstructor(){
        return instructor;
    }
    public Textbook getTextbook(){
        return textbook;
    }
    public boolean equals(Object obj){
        if(obj==null)return false;
        if(this==obj)return true;
        if(!(obj instanceof Course))return true;
        Course course = (Course)obj;
        if(this.courseName.equals(course.courseName) && this.textbook.equals(course.textbook) && this.instructor.equals(course.instructor)) return true;
        else return false;
    }
    public String toString(){
        return "\nCourse{" + "\nTitle : "+this.courseName + "\nBook : " +textbook.toString() + "\nInstructor : " +instructor.toString()+"\n";
    }
}
