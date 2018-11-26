import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class Course {
    private String courseName;
    private String courseCode;
    private int credit;
    private Teacher teacher;
    private Vector<Student> students;
    private Vector<CourseFile> files;
    private HashMap<Day, String> time;

    public Course(String courseName, String courseCode, int credit, Teacher teacher){
        this.courseCode = courseCode;
        this.credit = credit;
        this.courseName = courseName;
        this.teacher = teacher;
        time = new HashMap<Day, String>();
        files = new Vector<CourseFile>();
        students = new Vector<Student>();
    }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }

    public int getCredit() { return credit; }
    public void setCredit(int credit) { this.credit = credit; }

    public Vector<Student> getStudent() { return students; }
    public void addStudent(Student student) {students.addElement(student);}
    public void remStudent(Student student) {students.removeElement(student);}

    public Teacher getTeacher() { return teacher; }
    public void setTeacher(Teacher teacher) { this.teacher = teacher; }

    public Vector<CourseFile> getFiles() { return files; }
    public void addFile(CourseFile file) { files.addElement(file); }
    public void remFile(CourseFile file) { files.removeElement(file); }

    public HashMap<Day, String> getTime() { return time; }
    public void setTime(HashMap<Day, String> time) { this.time = time; }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(obj.getClass() != getClass())
            return false;
        Course other = (Course) obj;
        if (students == null) {
            if (other.students != null)
                return false;
        } else if (!students.equals(other.students))
            return false;
        if (courseName== null) {
            if (other.courseName!= null)
                return false;
        } else if (!courseName.equals(other.courseName))
            return false;
        if (courseCode== null) {
            if (other.courseCode!= null)
                return false;
        } else if (!courseCode.equals(other.courseCode))
            return false;
        if (teacher == null) {
            if (other.teacher!= null)
                return false;
        } else if (!teacher.equals(other.teacher))
            return false;
        return credit != other.credit;
    }

    @Override
    public String toString() {
        return courseName;
    }
}
