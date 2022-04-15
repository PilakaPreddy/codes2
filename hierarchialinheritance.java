//Hierarchical inheritance
package prcode;

import java.util.Scanner;

class abcd
{
  int x;
  void setdata(int n)
  {
    x=n;
  }
  void show()
  {
     System.out.println("x="+x);
  }
}
class xyz extends abcd
{
  int y;
  void input(int n)
  {
    y=n;
  }
  void display()
  {
     System.out.println("Sum of x and y is "+(x+y));
  }
}
class pqr extends abcd
{
  int z;
  void accept(int n)
  {
    z=n;
  }
  void output()
  {
     System.out.println("Sum of x and z is "+(x+z));
  }
}
public class hierarchialinheritance {

  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int a,b,c;
    System.out.println("Enter any 3 numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    xyz p=new xyz();
    p.setdata(a);
    p.input(b);
    p.display();
    pqr s=new pqr();
    s.setdata(a);
    s.accept(c);
    s.output();
    sc.close();

  }

}