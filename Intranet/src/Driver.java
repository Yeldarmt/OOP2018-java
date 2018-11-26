import java.util.Scanner;

public class Driver {


    public static Scanner reader = new Scanner(System.in);
    public static Database d = new Database();
    public static void main(String [] args){
        Database.deserialize();
        Database.teachers.add(new Teacher("asdfasdf",Gender.MALE,"mukhametkazin","eldar","87784707899","eldarmukhametkazin@gmail.com",123456,Position.PROFESSOR));
        Start();
        Database.serialize();
    }

    private static void Start() {
        System.out.println("Welcome to University System!!!");
        preLogin();
    }

    private static void preLogin() {
        System.out.println("Authorization");
        System.out.println(Database.teachers);
        System.out.println(Database.teachers.lastElement().getUsername());
        System.out.println(Database.teachers.lastElement().getPassword());
        System.out.print("LOGIN:__");
        String log = reader.nextLine();
        System.out.print("Password:__");
        String pass = reader.nextLine();

        for (int i = 0; i < Database.teachers.size(); i++)
            if (pass.equals(Database.teachers.elementAt(i).getPassword()) && log.equals(Database.teachers.elementAt(i).getUsername())) {
                TeacherDriver.menu(Database.teachers.elementAt(i));
                preLogin();
                return;
            }

        for (int i = 0; i < Database.admins.size(); i++)
            if (pass.equals(Database.admins.elementAt(i).getPassword()) && log.equals(Database.admins.elementAt(i).getUsername())){
                AdminDriver.menu();
                preLogin();
                return;
            }
        for(int i = 0; i < Database.managers.size(); i++)
            if(pass.equals(Database.managers.elementAt(i).getPassword()) && log.equals(Database.managers.elementAt(i).getUsername())){
                ManagerDriver.menu();
                preLogin();
                return;
            }
        for(int i = 0; i < Database.students.size(); i++)
            if(pass.equals(Database.students.elementAt(i).getPassword()) && log.equals(Database.students.elementAt(i).getUsername())){
                StudentDriver.menu();
                preLogin();
                return;
            }
        //System.out.

    }
}
