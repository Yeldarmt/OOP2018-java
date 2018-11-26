import java.util.*;

public class Teacher extends Employee{

    private Vector<Course> courses;
    private Position position;

    public Teacher(String id, Gender gender, String lastname, String firstname, String telNumber, String email, int salary, Position position){
        super(id, gender, lastname, firstname, telNumber, email, salary);
        this.position = position;
        courses = new Vector<>();
    }

    public Vector<Course> getCourses() { return courses; }
    public void addCourse(Course course) { courses.addElement(course); }
    public void remCourse(Course course) { courses.removeElement(course); }

    public Position getPosition() { return position; }
    public void setPosition(Position position) { this.position = position; }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(obj.getClass() != getClass())
            return false;
        Teacher other = (Teacher) obj;
        if (courses == null) {
            if (other.courses != null)
                return false;
        } else if (!courses.equals(other.courses))
            return false;
        if (position == null) {
            if (other.position!= null)
                return false;
        } else if (!position.equals(other.position))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " " + position ;
    }
}
