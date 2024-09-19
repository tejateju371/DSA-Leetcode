import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
class Student  implements Comparable<Student>{
    public Student(int rollno,String name,int marks){
        super();
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;

    }


    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    private int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int marks;

    @Override
    public int compareTo(Student o) {
        return this.getMarks()>o.getMarks()?-1:1;
    }
}

public class Lists   {

    private int marks;

    public static  void main(String args[]){
        Student s1=new Student(21,"krish",32);
        Student s2=new Student(22,"krishna",38);
        Student s3=new Student(23,"krishnarao",34);
        List<Student>sud=new ArrayList<>();
        sud.add(s1);
        sud.add(s2);
        sud.add(s3);
        //Collections.sort(sud,(l1,l2)-> l1.getMarks()> l2.getMarks()?-1:1);
        sud.forEach(System.out::println);
Collections.sort(sud);




/*
        Collection con=new ArrayList();
        con.add(10);
        con.add(40);
        con.add(50);
        con.add(20);
        List<Integer>li=new ArrayList<>();
        li.add(5);
        li.add(7);
        li.add(1);
        li.add(0);
        li.add(2);
        Collections.sort(li);
        Collections.reverse(li);
       Object[] a = li.toArray();
       // li.forEach(System.out::println);
      *//*  for(Object lis:a){
            System.out.println(lis);
        }*//*
       // System.out.print(a[3]);

        li.addAll(con);
        //li.forEach(System.out::println);
        li.clear();

        boolean ans=  li.contains(40);
        System.out.println(ans);

        li.forEach(System.out::println);
        */
 for(Student s:sud){
     System.out.println(s);
 }

}

}


