//using Comparator interface
package prcode;
import java.util.*;
class Student1
{
  int rno,age;
  String name;
  Student1(int rno, String name, int age)
  {
    this.rno=rno;
    this.age=age;
    this.name=name;
  }
}
class Agecomparator implements Comparator
{
  public int compare(Object o1, Object o2)
  {
    Student1 s1=(Student1)o1;
    Student1 s2=(Student1)o2;
    if(s1.age==s2.age)
      return 0;
    else if(s1.age<s2.age)
      return 1;
    else
      return -1;
  }
}
class Namecomparator implements Comparator
{
  public int compare(Object o1, Object o2)
  {
    Student1 s1=(Student1)o1;
    Student1 s2=(Student1)o2;
    return s1.name.compareTo(s2.name);
  }
}
class Rnocomparator implements Comparator
{
  public int compare(Object o1, Object o2)
  {
    Student1 s1=(Student1)o1;
    Student1 s2=(Student1)o2;
    if(s1.rno==s2.rno)
      return 0;
    else if(s1.rno>s2.rno)
      return 1;
    else
      return -1;
  }
}


public class comparator_interface {
  public static void main(String[] args) {
    ArrayList <Student1>all=new ArrayList<Student1>();
    all.add(new Student1(101,"Varun",25));
    all.add(new Student1(110,"Kalyan",20));
    all.add(new Student1(121,"Raju",18));    
    all.add(new Student1(113,"Hari",21));
    
    System.out.println("Sorting on Age");
    Collections.sort(all,new Agecomparator());
    System.out.println("Rno\tName\tAge");
    for(Student1 s:all)
        System.out.println(s.rno+"\t"+s.name+"\t"+s.age);
    
    System.out.println("Sorting on Roll Number");
    Collections.sort(all,new Rnocomparator());
    System.out.println("Rno\tName\tAge");
    for(Student1 s:all)
      System.out.println(s.rno+"\t"+s.name+"\t"+s.age);
  
    System.out.println("Sorting on Name");
    Collections.sort(all,new Namecomparator());
    System.out.println("Rno\tName\tAge");
    for(Student1 s:all)
      System.out.println(s.rno+"\t"+s.name+"\t"+s.age);
  }
}