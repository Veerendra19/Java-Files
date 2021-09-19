class Employee{
int id;
String name;
int salary;

void setId (int i)
{
id=i;
}
void setName(String n){
name=n;
}
void setSalary(int s)
{
salary = s;
}
void getEmployeeDetails(){
System.out.println(name+" Salary is $"+salary+" per month.");
}
public static void main(String args[])
{
Employee emp=new Employee();
emp.setId(10);
emp.setName("Veerendra");
emp.setSalary(100000);
emp.getEmployeeDetails();
}
}
