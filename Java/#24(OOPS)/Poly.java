
class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name); 
    }
    public void printInfo(int age){
        System.out.println(age);
    }

public void printInfo(String name, int age){
    System.out.println(name + " " + age);
}
}
public class Poly {
    public static void main(String[] args) {
       
        Student s1 = new Student(); // memory heap k andar ek jagah allocate ho jaegi jis main puri object store ho jaegi 
        s1.name = "Khushi";
        s1.age = 21;
        s1.printInfo(s1.name , s1.age);
        }
}
