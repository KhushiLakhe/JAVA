// classes ka naam hamesh capital letter se shuru hota hai
class Pen{// abhi konsi konsi properties ho skti hai pen main vo sb likhe
    // properties of pen
    String colour;
    String type; //ballpoint or gel pen
    public void write(){
        System.out.println("write something");
    } 
    public void printColor(){
        System.out.println(this.colour);
    } 
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){ // non parameterised constructor
        System.out.println("constructor called");
    }
}
public class Oops {
    public static void main(String[] args) {
        // creating an object for pen (pen1 is the object)
        // Pen pen1 = new Pen();
        // // properties ko access krne k liye . lagate hai
        // pen1.colour = "blue";
        // pen1.type = "gel";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.colour = "black";
        // pen2.type = "ballpoint";

        // pen1.printColor();
        // pen2.printColor();
        // toh jb bhi new Student() ye object banegi toh Student walla constructor call hoga
        Student s1 = new Student(); // memory heap k andar ek jagah allocate ho jaegi jis main puri object store ho jaegi 
        s1.name = "Khushi";
        s1.age = 21;
        s1.printInfo();
        }
}
