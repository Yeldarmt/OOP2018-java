import javax.xml.crypto.Data;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

public class Database implements Serializable {
    static Vector<Student> students;
    static Vector<Teacher> teachers;
    static Vector<Admin> admins;
    static Vector<Executor> executors;
    static Vector<Manager> managers;
    static Vector<Order> orders;
    static Vector<Order> donedOrders;


    public Database(){
        students = new Vector<>();
        teachers = new Vector<>();
        executors = new Vector<>();
        admins = new Vector<>();
        managers = new Vector<>();
        orders = new Vector<>();
        donedOrders = new Vector<>();
    }

    public static void serialize() {
        try {
            ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("Database.out"));
            ois.writeObject(Driver.d);
            ois.close();
        }catch (FileNotFoundException fn){

        }catch (IOException io){

        }

    }

    public static void deserialize() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Database.out"));
            Driver.d = (Database)ois.readObject();
            ois.close();
        }catch (FileNotFoundException fn){

        }catch (IOException io){

        }catch (ClassNotFoundException cnfe){

        }
    }

    void remStudent(Student student){
        Database.students.removeElement(student);
        for(int i = 0; i < Manager.getCourses().size(); i++)
            Manager.getCourses().elementAt(i).remStudent(student);
    }


    void remTeacher(Teacher teacher) {
        Database.teachers.removeElement(teacher);
        for (int i = 0; i < Manager.getCourses().size(); i++)
            Manager.getCourses().elementAt(i).setTeacher(null);
    }
    @Override
    public String toString() {
        return "Number of: \n" + this.getClass()  + ";"
                + "; orders - " + orders.size()
                + "; doned orders - " + donedOrders.size();
    }
}
