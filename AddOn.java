class Main{
public static void main(String args[]){
Number n1=new Number();
int res=n1.addNo(10);
System.out.println(res);
}
}
class Number{
int no=0;
int addNo(int no){
this.no=this.no+no;
return(no);
}
}