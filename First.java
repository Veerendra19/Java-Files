class First{
static int a=0;s
void update(int value){
a=value;}
void disp()
{
System.out.println("Value of a : "+a);
}
public static void main(String args[])
{
First fob=new First();
System.out.println("Initial value is : "+a);
fob.update(10);
fob.disp();
}
}