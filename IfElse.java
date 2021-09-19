class IfElse {

    public static void main(String[] args) {
	char gender=args[0].charAt(0);
	int age=Integer.parseInt(args[1]);
	if ((gender=='F') && (age>=10 && (age<=58)){
        System.out.println("Interest=8.2%");
	}
	else if((gender=='Female') && (age>=59) && (age<=120)){	
	System.out.println("Interest=7.6%");
	}
	else if((gender=='Male') && (age>=1) && (age<=60)){	
	System.out.println("Interest=9.2%");
	}
	else if((gender=='Male') && (age>=61) && (age<=120)){	
	System.out.println("Interest=8.3%");
	}
	else{
	System.out.println("Invalid Input");
	}
}
}