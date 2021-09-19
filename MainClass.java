class MainClass{
public static void main(String args[]){
subClass sc=new subClass();
sc.display();
}
}
class subClass{
String msg="Hello";
void display()
{
System.out.println(msg);
subClass1 sc1=new subClass1();
sc1.display1();
}
}
class subClass1{
String msg="Welcome to My world";
void display1()
{
System.out.println(msg);
}
}