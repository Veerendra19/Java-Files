class SumOfDigits   
{  
public static void main(String[] args)  
{ 
int number=Integer.parseInt(args[0]); 
int sum=1;  
System.out.print("Enter the number: ");  
while(number != 0)  
{   
int digit;  
digit = number % 10;  
sum = sum + digit;  
number = number / 10;  
}  
System.out.println("Sum of Digits: "+sum);  
}  
}
  