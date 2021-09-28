class C
{
public static void main(String args[])
{
B s1=new B();
System.out.println(s1.a+" "+s1.b);
}
}
class A
{
int a;
A()
{
a=10;
System.out.println("In class A Constructor");
}
}
class B extends A
{
int b;
B()
{
b=20;
System.out.println("In class B Constructor");
} 
}



