class Main{
public static void main(String args[]){
Sample a1=new Sample();
Sample a2=new Sample("Java");
}
}
class Sample{
Sample(){
System.out.println("Default Constructor");
}
Sample(String str){
this();
System.out.println("One argument Constructor"+str);
}
}