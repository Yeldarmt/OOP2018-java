import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class TeacherDriver implements Serializable {
    static Teacher t;
    public static void menu(Teacher teacher){
        System.out.println("Welcome " + teacher.getFirstname()+" "+teacher.getLastname()+"!!!");
        t = teacher;
        Teach_menu();
    }
    private static void Teach_menu(){

        System.out.println("1. Information about me");
        System.out.println("2. Courses");
        System.out.println("3. Log out");
        System.out.print("#__");
        String in = Driver.reader.next();

        switch (in.charAt(0)){
            case('1'):
                getInfo();
            case('2'):
                getCourse();
            case('3'):
                return;
        }
    }

    private static void getInfo(){
        System.out.println("Full information :" + t.toString());
        System.out.println("Press 'q' to quite");
        System.out.print("#__");
        String in = Driver.reader.nextLine();
        if(in.equals("q")){
            Teach_menu();
        }
    }
    private static void getCourse(){
        System.out.println("Courses List :");
        for(int i = 0 ; i < t.getCourses().size();i++){
            System.out.println((i+1)+". "+t.getCourses().get(i).getCourseName());
        }
        System.out.println("Please choose the Course or press 'q' to quite");
        String in = Driver.reader.nextLine();
        if(in.equals("q")){
            Teach_menu();
        }
        else
            courseContent(in);

    }
    private static void courseContent(String st){
        System.out.println("1. List of Students");
        System.out.println("2. Course Files");
        System.out.println("3. Put Marks");
        System.out.println("4. Add file");
        System.out.println("5. Remove file");
        System.out.print("#__");
        String in = Driver.reader.next();
        switch(in.charAt(0)){
            case('1'):
                getListStudent(st);
            case('2'):
                getCourseFiles(st);
            case('3'):
                putMarks(st);
            case('4'):
                addFile(st);
            case('5'):
                removeFile(st);

        }
    }

    private static void getListStudent(String it){
        for(int i = 0 ; i < t.getCourses().get(Integer.parseInt(it)-1).getStudent().size();i++){
            System.out.println((i+1)+". "+t.getCourses().get(Integer.parseInt(it)-1).getStudent().get(i).getFirstname()+" " +
                    t.getCourses().get(Integer.parseInt(it)-1).getStudent().get(i).getLastname()+"Point out of 100" +
                    t.getCourses().get(Integer.parseInt(it)-1).getStudent().get(i).getMarks().get(t.getCourses().get(Integer.parseInt(it)-1)));
            System.out.println("Press 'q' to quite");
            System.out.print("#__");
            String ans = Driver.reader.nextLine();
            if(ans.equals("q")){
                courseContent(it);
            }

        }
    }

    private static void putMarks(String it){
        for(int i = 0; i < t.getCourses().get(Integer.parseInt(it)-1).getStudent().size();i++){
            System.out.println((i+1)+". "+ t.getCourses().get(Integer.parseInt(it)-1).getStudent().get(i).getFirstname() + " "+
                    t.getCourses().get(Integer.parseInt(it)-1).getStudent().get(i).getLastname());
            System.out.println("Choose the Student number to put Mark or Press 'q' to quite");
            System.out.print("#___");
            String ans = Driver.reader.nextLine();
            if(ans.equals("q")){
                courseContent(it);
            }
            int IndexOfStudent = Integer.parseInt(ans)-1;
            int IndexOfSubject = Integer.parseInt(it)-1;
            putMarkStudent(IndexOfSubject,IndexOfStudent);
        }
    }
    private static void putMarkStudent(int indSubject,int indStudent){
        System.out.println("Enter Mark range of 0 - 100 ");
        System.out.print("#__");
        String ans = Driver.reader.nextLine();
        Mark m = new Mark(Integer.parseInt(ans),new Date());
        HashMap<Course, Mark> mark = new HashMap<Course, Mark>();
        mark.put(t.getCourses().get(indSubject),m);
    }
    private static void addFile(String it){
        String f_name = Driver.reader.nextLine();
        System.out.println("Please write name of your file");
        System.out.print("#__ ");
        String file_name = Driver.reader.nextLine();
        System.out.println("Please write link(way) file");
        System.out.print("#__ ");
        String way = Driver.reader.nextLine();
        File f = new File(way);
        CourseFile c_f = new CourseFile(file_name,f);
        t.getCourses().get(Integer.parseInt(it)-1).addFile(c_f);
    }
    private static void removeFile(String it){
        for(int i = 0 ; i < t.getCourses().get(Integer.parseInt(it)-1).getFiles().size();i++){
            System.out.println((i+1)+". " + t.getCourses().get(Integer.parseInt(it)-1).getFiles().get(i).getFileName());
        }
        System.out.println("Choose number course file");
        System.out.print("#__");
        String ans = Driver.reader.nextLine();
        t.getCourses().get(Integer.parseInt(it)-1).remFile(t.getCourses().get(Integer.parseInt(it)-1).getFiles().get(Integer.parseInt(ans)-1));
    }
    private static void getCourseFiles(String it){
        for(int i = 0 ; i < t.getCourses().get(Integer.parseInt(it)-1).getFiles().size();i++){
            System.out.println((i+1)+". " + t.getCourses().get(Integer.parseInt(it)-1).getFiles().get(i).getFileName());
        }
    }
}
