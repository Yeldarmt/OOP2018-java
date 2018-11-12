package Task2;

import java.io.Serializable;

public class Textbook implements Serializable {
    private int isbn;
    private String title;
    private String author;

    public Textbook(){
        this.isbn = 0 ;
        this.title ="no title";
        this.author ="no author";
    }
    public Textbook(int isbn,String title,String author){
        this.isbn = isbn;
        this.title =title;
        this.author=author;
    }
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getIsbn(){
        return isbn;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(this == obj) return true;
        if(!(obj instanceof Textbook)) return false;
        Textbook tb = (Textbook)obj;
        if(this.isbn == tb.isbn && this.title.equals(tb.title) && this.author.equals(tb.author)) return true;
        else return false;
    }
    public String toString(){
        return "Textbook: isbn:" + this.isbn + " Title:" + this.title + " Authors:" + this.author ;
    }

}
