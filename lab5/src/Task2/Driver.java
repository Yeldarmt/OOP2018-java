package Task2;

import java.awt.*;
import javax.swing.text.html.HTMLDocument;
import java.sql.SQLSyntaxErrorException;
import java.lang.String;
import java.io.*;
import java.util.*;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class Driver {
    public static void main(String[] args){
        try {
            Date date = null;
            Scanner scanner = new Scanner(System.in);
            String buttin,input,line1,line2,name,surname,tittle,nameCourse,department,email,author,password,user,login;
            int hashcodepas,choiceneworold,hashfilepas,isbn,choice,instrucot_choose,choosen_book;
            Textbook book = null;
            Instructor instructor = null;
            Course course = null;

            Vector<Textbook> vec_book = new Vector<Textbook>();
            Vector<Instructor> vec_instructor = new Vector<Instructor>();
            Vector<Course> vec_course = new Vector<Course>();
            Menu:while(true){
                System.out.println("<<<<<<<<<<<<Menu>>>>>>>>>");
                System.out.println("Press 'a' to enter as admin");
                System.out.println("Press 'u' to enter as user");
                System.out.println("Press 'q' to enter as quite");
                input = scanner.next();
                switch(input){
                    case"a":
                        a:while(true){
                            FileWriter fl_wr = new FileWriter("admin.txt",true);
                            FileReader fl_rd = new FileReader("admin.txt");
                            BufferedWriter buf_wr = new BufferedWriter(fl_wr);
                            BufferedReader buf_rd = new BufferedReader(fl_rd);
                            System.out.println("Please write your login and password or press 'q' to exit");
                            login = scanner.next();
                            if(login.equals("q")){
                                continue Menu;
                            }
                            else{
                                password = scanner.next();
                                //System.out.println(buf_rd.readLine());
                                hashcodepas = Objects.hash(password);
                                line1 = buf_rd.readLine();
                                line2 = buf_rd.readLine();
                                hashfilepas = Objects.hash(line2);
                                if(login.equals(line1) && hashcodepas==hashfilepas){
                                    date = new Date();
                                    buf_wr.newLine();
                                    buf_wr.write(date+" admin logged in to a system");
                                    buf_wr.newLine();
                                    isAdmin:while(true){
                                        System.out.println("<<<<<<<<<<<<admin>>>>>>>>>");

                                        System.out.println("Press '1' to add new Instructor");
                                        System.out.println("Press '2' to add new Textbook");
                                        System.out.println("Press '3' to add new Course");
                                        System.out.println("Press '0' to back");
                                        choice = scanner.nextInt();
                                        switch(choice){
                                            case 0:
                                                date = new Date();
                                                buf_wr.newLine();
                                                buf_wr.write(date+"admin has left the system");
                                                buf_wr.newLine();
                                                buf_wr.close();
                                                continue a;

                                            case 1:
                                                System.out.println("<<<<<<<<<<<<adding instructor>>>>>>>>>");
                                                ObjectOutputStream oosi = new ObjectOutputStream(new FileOutputStream("vec_instructor.ser.out"));
                                                System.out.println("Please fill next fields: ");
                                                System.out.print("Write name: ");
                                                name = scanner.next();
                                                System.out.println();
                                                System.out.print("Write surname: ");
                                                surname =scanner.next();
                                                System.out.println();
                                                System.out.print("Write department: ");
                                                department = scanner.next();
                                                System.out.println();
                                                System.out.print("Write email:");
                                                email = scanner.next();
                                                instructor = new Instructor(name,surname,department,email);
                                                vec_instructor.add(instructor);
                                                oosi.writeObject(vec_instructor);
                                                buf_wr.newLine();
                                                date = new Date();
                                                buf_wr.write(date+" admin add new instructor "+"\""+name+" "+surname+"\"");
                                                buf_wr.newLine();
                                                oosi.close();
                                                System.out.println("Instructor added!!!");
                                                continue isAdmin;
                                            case 2:
                                                System.out.println("<<<<<<<<<<<<adding textbook>>>>>>>>>");
                                                ObjectOutputStream oost = new ObjectOutputStream(new FileOutputStream("vec_book.ser.out"));
                                                System.out.println("Please fill next fields: ");
                                                System.out.print("Write tittle: ");
                                                tittle = scanner.next();
                                                System.out.println();
                                                System.out.print("Write author: ");
                                                author = scanner.next();
                                                System.out.println();
                                                System.out.print("Write isbn: ");
                                                isbn = scanner.nextInt();
                                                book = new Textbook(isbn,tittle,author);
                                                vec_book.add(book);
                                                oost.writeObject(vec_book);
                                                date = new Date();
                                                buf_wr.newLine();
                                                oost.close();
                                                buf_wr.write(date+" admin add new Textbook "+"\""+tittle+"\"");
                                                System.out.println("Textbook added!!!");
                                                continue isAdmin;

                                            case 3:
                                                ObjectOutputStream oisc = new ObjectOutputStream(new FileOutputStream("vec_course.ser.out"));

                                                System.out.println("Please fill next fields: courseName , Instructor ,Textbook");
                                                nameCourse = scanner.next();
                                                System.out.println("If you want to add new Instructor press '1' or press '2' to choose from existing");
                                                choiceneworold =scanner.nextInt();
                                                if(choiceneworold==1){
                                                    ObjectOutputStream oosi1 = new ObjectOutputStream(new FileOutputStream("vec_instructor.ser.out"));
                                                    System.out.println("Please fill next fields: ");
                                                    System.out.print("Write name: ");
                                                    name = scanner.next();
                                                    System.out.println();
                                                    System.out.print("Write surname: ");
                                                    surname =scanner.next();
                                                    System.out.println();
                                                    System.out.print("Write department: ");
                                                    department = scanner.next();
                                                    System.out.println();
                                                    System.out.print("Write email:");
                                                    email = scanner.next();
                                                    buf_wr.newLine();
                                                    date = new Date();
                                                    buf_wr.write(date+" admin add new instructor "+"\""+name+" "+surname+"\"");
                                                    buf_wr.newLine();
                                                    instructor = new Instructor(name,surname,department,email);
                                                    vec_instructor.add(instructor);
                                                    oosi1.writeObject(vec_instructor);
                                                    oosi1.close();
                                                    System.out.println("New instructor added");
                                                }
                                                else if(choiceneworold==2){
                                                    ObjectInputStream oisi2 = new ObjectInputStream(new FileInputStream("vec_instructor.ser.out"));
                                                    Vector<Instructor> inst = (Vector<Instructor>)oisi2.readObject();
                                                    System.out.println("Choose the instructor: ");
                                                    for(int i = 0; i < inst.size(); i++) {
                                                        System.out.println(i+1 + ") " + inst.get(i).toString());
                                                    }
                                                    instrucot_choose = scanner.nextInt();
                                                    instructor = new Instructor(inst.get(instrucot_choose-1).getFirstName(),inst.get(instrucot_choose-1).getLastName(),inst.get(instrucot_choose-1).getDepartment(),inst.get(instrucot_choose-1).getEmail());
                                                    oisi2.close();
                                                    System.out.println("Existing instructor choosen ");

                                                }
                                                System.out.println("If you want to add new textbook press '1' else press '2' to choice from existing textbooks");
                                                choiceneworold = scanner.nextInt();
                                                if(choiceneworold==1){
                                                    ObjectOutputStream oost1 = new ObjectOutputStream(new FileOutputStream("vec_book.ser.out"));
                                                    System.out.println("Please fill next fields: ");
                                                    System.out.print("Write tittle: ");
                                                    tittle = scanner.next();
                                                    System.out.println();
                                                    System.out.print("Write author: ");
                                                    author = scanner.next();
                                                    System.out.println();
                                                    System.out.print("Write isbn: ");
                                                    isbn = scanner.nextInt();
                                                    date = new Date();
                                                    buf_wr.newLine();
                                                    buf_wr.write(date+" admin add new Textbook "+"\""+tittle+"\"");
                                                    buf_wr.newLine();
                                                    book = new Textbook(isbn,tittle,author);
                                                    vec_book.add(book);
                                                    oost1.writeObject(vec_book);
                                                    oost1.close();
                                                    System.out.println("New book added");
                                                }
                                                else if(choiceneworold==2){
                                                    ObjectInputStream oist = new ObjectInputStream(new FileInputStream("vec_book.ser.out"));
                                                    Vector<Textbook> inst = (Vector<Textbook>)oist.readObject();
                                                    System.out.println("Choose the Textbook: ");
                                                    for(int i = 0; i < inst.size(); i++) {
                                                        System.out.println(i+1 + ") " + inst.get(i).toString());
                                                    }
                                                    choosen_book = scanner.nextInt();
                                                    book = new Textbook(inst.get(choosen_book-1).getIsbn(),inst.get(choosen_book-1).getTitle(),inst.get(choosen_book-1).getAuthor());
                                                    oist.close();
                                                    System.out.println("Existing book choosen");

                                                }
                                                System.out.println("Course added!!!");
                                                course = new Course(nameCourse,instructor,book);
                                                vec_course.add(course);
                                                oisc.writeObject(vec_course);
                                                oisc.close();
                                                date = new Date();
                                                buf_wr.newLine();
                                                buf_wr.write(date+" admin add new Course "+"\""+nameCourse+"\"");
                                                buf_wr.newLine();
                                                continue isAdmin;
                                        }
                                    }
                                }
                                else{
                                    System.out.println("Incorrect password or login!!!");
                                    buf_wr.close();
                                    continue a;
                                }
                            }
                        }
                    case "u":
                        user:while(true) {
                            Iterator it;
                            System.out.println("<<<<<<<<<<<<user>>>>>>>>>");
                            System.out.println("\n1)Courses \n2)Instructors \n3)Textbooks \n4)Exit");
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    ObjectInputStream oisc = new ObjectInputStream(new FileInputStream("vec_course.ser.out"));
                                    System.out.println("<<<<<<<<<<<<Courses>>>>>>>>>");
                                    Vector<Course> vctcr = (Vector<Course>)oisc.readObject();
                                    it=vctcr.iterator();
                                    while(it.hasNext()){
                                        System.out.println(it.next());
                                    }
                                    System.out.println("Press any button");
                                    buttin = scanner.next();
                                    oisc.close();

                                    continue user;
                                case 2:
                                    ObjectInputStream oisi = new ObjectInputStream(new FileInputStream("vec_instructor.ser.out"));
                                    System.out.println("<<<<<<<<<<<<<<<Instructors>>>>>>>");
                                    Vector<Instructor> instr = (Vector<Instructor>)oisi.readObject();
                                    it = instr.iterator();
                                    while(it.hasNext()){
                                        System.out.println(it.next());
                                    }
                                    System.out.println("Press any button");
                                    buttin = scanner.next();
                                    oisi.close();
                                    continue user;
                                case 3:
                                    System.out.println("<<<<<<<<<<<<<<<Textbooks>>>>>>>");
                                    ObjectInputStream oist = new ObjectInputStream(new FileInputStream("vec_book.ser.out"));
                                    Vector<Textbook> txt = (Vector<Textbook>)oist.readObject();
                                    it = txt.iterator();
                                    while(it.hasNext()){
                                        System.out.println(it.next());
                                    }
                                    System.out.println("Press any button");
                                    buttin = scanner.next();
                                    oist.close();
                                    continue user;
                                case 4:
                                    continue Menu;
                            }
                        }
                    case "q":
                        System.exit(0);
                }
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
