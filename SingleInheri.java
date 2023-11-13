import java.util.*;
class Student{
    String name;
    String Rollno;
    String Address;
    int Age;
    public Student(){
        this.name=name;
        this.Rollno=Rollno;
        this.Address=Address;
        this.Age=Age;
    }
    public void GetInput(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Student details: ");
        System.out.println("Name: ");
        name=scan.nextLine();
        System.out.println("Rollno: ");
        Rollno=scan.nextLine();
        System.out.println("Address: ");
        Address=scan.nextLine();
        System.out.println("Age: ");
        Age=scan.nextInt();
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Rollno: "+Rollno);
        System.out.println("Address: "+Address);
        System.out.println("Age: "+Age);
    }
}
class Results extends Student{
    int[] marks=new int[5];
    public void GetMarks() {


        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter the mark"+(i+1));
            marks[i]=sc.nextInt();
        }
    }


    public void Avg(){
        int total=0;
        for(int mark:marks){
            total+=mark;
        }
        double average= total/ marks.length;
        System.out.println("The Average mark is : "+ average);
    }
}
public class SingleInheri {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int num=number.nextInt();
        Results[] Stud=new Results[num];
                for(int i=0;i<num;i++){
                    Stud[i]=new Results();
                    Stud[i].GetInput();
                    Stud[i].GetMarks();
                }
        System.out.println("Details of students");
                for(int i=0;i<num;i++){
                    System.out.println("Details of Student"+(i+1));
                    Stud[i].display();
                    Stud[i].Avg();

                }


    }
}
