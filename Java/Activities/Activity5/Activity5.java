package activities;
//abstract class
abstract class Book{
    String Title;
    //abstract method
    abstract void setTitle(String s);
    // concrete method
    String getTitle(){
        return Title;
    }
}
class MyBook extends Book{
    //method
    public void setTitle(String s){
    Title = s;
}
}
public class Activity5 {
    public static void main(String[] args){
        // initialize the title
        String title = "Lord of the Files";
        // Create object for MyBook
        Book newNovel = new MyBook();
        // set title
        newNovel.setTitle(title);
        System.out.println("The title is:" + newNovel.getTitle());
    }
}
