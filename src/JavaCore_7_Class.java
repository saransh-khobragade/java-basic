class Student{
    private String name;
    private int age;
    private int marks;

    public void getDetails(){
        System.out.println("name:"+this.name+" age:"+this.age+" marks:"+this.marks);
    }

    Student(String a,int b, int c){
        this.name = a;
        this.age = b;
        this.marks = c;
    }
}
public class JavaCore_7_Class {
    public static void main(String[] args) {
        Student student = new Student("Saransh",20,33);
        student.getDetails();
    }
}
