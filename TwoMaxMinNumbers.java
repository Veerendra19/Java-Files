class TwoMaxMinNumbers {
 public static void main(String a[]){
	int num[] = {5,34,78,2,45,1,99,23};
        int maxOne = 0;
        int maxTwo = 0;
	int minOne = 100;
	int minTwo = 100;
        for(int n:num){
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
	for(int n:num){
		if (minOne > n){
			minOne = minTwo;
			minOne = n;
}		else if(minTwo > n){
                	minTwo = n;
            }
}
	System.out.println("First Min Number: "+minOne);
        System.out.println("Second Min Number: "+minTwo);
    }
    }
