//using of comparable interface
package prcode;
import java.util.*;
class Student implements Comparable<Student>
{
  int rno,age;
  String name;
  Student(int rno, String name, int age)
  {
    this.rno=rno;
    this.age=age;
    this.name=name;
  }
  @Override
 public int compareTo(Student st)
  {
    if(age==st.age)
      return 0;
    else if(age>st.age)
      return 1;
    else
      return -1;
  }
}

public class comparable_interface {
  public static void main(String[] args) {
    ArrayList <Student>al=new ArrayList<Student>();
    al.add(new Student(101,"Arun",25));
    al.add(new Student(110,"Kalyan",20));
    al.add(new Student(121,"Raju",18));    
    al.add(new Student(113,"Hari",21));
    Collections.sort(al);
    System.out.println("Rno\t\tName\t\tAge");
    for(Student s:al)
    {
      System.out.println(s.rno+"\t\t"+s.name+"\t\t"+s.age);
    }
    
  }

}