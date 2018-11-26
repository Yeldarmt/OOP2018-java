import java.util.Vector;

public class Manager extends Employee {
    private static Vector<Course> courses = new Vector<>();

    Manager(String id, Gender gender, String lastname, String firstname, String telNumber, String email, int salary){
        super(id, gender, lastname, firstname, telNumber, email, salary);
    }

    public static Vector<Course> getCourses() { return courses; }

    public static void addCourse(Course course) {
        courses.addElement(course);
        course.getTeacher().addCourse(course);
    }

    public static void remCourse(Course course) {
        Manager.courses.removeElement(course);
        for(int i = 0; i < Database.students.size(); i++)
            Database.students.elementAt(i).getTakenCourses().remove(course);
        course.getTeacher().remCourse(course);
    }

    public static void remStudent(Student student) {
        for(int i = 0; i < courses.size(); i++)
            courses.elementAt(i).remStudent(student);
    }


}
