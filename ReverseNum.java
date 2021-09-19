class ReverseNum {
  public static void main(String[] args) {

    int num = Integer.parseInt(args[0]);
    int reversed = 0;
    int temp = num;
    while(num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }
    System.out.println("Reversed Number: " + reversed);
if(temp==reversed){
System.out.println(reversed+" is Palindrone");
}else{System.out.println(reversed+" is not a Palindrone");}
  }
}