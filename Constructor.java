class Main{
public static void main(String args[]){
Constructor c1=new Constructor();
Constructor c2=new Constructor(100);
}
}
class Constructor{
Constructor()
{
System.out.println("Default");
}
Constructor (int a)
{
System.out.println("Constructor with One Argument "+a);
}
}
