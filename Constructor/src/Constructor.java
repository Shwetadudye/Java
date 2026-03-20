// CONSTRUCTOR IS USED TO INITIALIZE THE OBJECT.
// constructor name is same name as class name .

class Student{
    String name ;
    int roll_no;
    int age;
    String email;

    Student(String name,int roll_no, int age,String email){
        this.name=name;
        this.roll_no=roll_no;
        this.age=age;
        this.email=email;
    }// parameterize constructor
}
public class Constructor {
    public static void main(String[] args){
        Student s = new Student("Shweta",22,21,"dudyeshweta@gmail.com");
        System.out.println("name " + s.name);
        System.out.println("Roll no " + s.roll_no);
        System.out.println("Age" + s.age);
        System.out.println("Email" + s.email);
    }
}
