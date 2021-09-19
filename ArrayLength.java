class ArrayLength{
public static void main(String[] args){
int[] s={100,200,300};
int[] d=new int[3];
System.arraycopy(s,0,d,0,s.length);
for (int i=0; i<d.length;i++){
	System.out.println("Elements at index"+i+":"+d[i]);
}
}
}

how to intialize an int array with values and find min and max in array in java