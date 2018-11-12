package Task2;

import java.io.Serializable;

public class Instructor implements Serializable {
    private String firstName,lastName,department,email;
    public Instructor(){
        this.firstName="no name";
        this.lastName = "no name";
        this.department="no department";
        this.email = "no department";
    }
    public Instructor(String firstName,String lastName,String department,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department=department;
        this.email= email;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getDepartment(){
        return department;
    }
    public String getEmail(){
        return email;
    }
    public boolean equals(Object obj){
        if(obj==null)return false;
        if(this==obj)return true;
        if(!(obj instanceof Instructor))return false;
        Instructor inst = (Instructor)obj;
        if(this.email.equals(inst.email) && this.department.equals(inst.department) && this.lastName.equals(inst.lastName) && this.firstName.equals(inst.firstName))return true;
        else return false;
    }
    public String toString(){
        return "Instructor: Name:" + this.firstName + "  Surname:" + this.lastName + "  Department:" + this.department + "  email:"+this.email;
    }
}
