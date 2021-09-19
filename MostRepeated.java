class MostRepeated{
	public static void main(String[] args) 
    {
        int x, count = 0, i = 0;
        System.out.print("Enter no. of elements you want in array:");
        int n[] = {10,20,10,30,40,100,99};
        for(i = 0; i<n; i++)
        {
          n[i]=n[i]+1;  
        }
        x = x+1;
        for(i = 0; i<n; i++)
        {
            if(n[i] == x)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}