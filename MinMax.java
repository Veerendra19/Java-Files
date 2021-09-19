class MinMax {
public static void main(String[] args) {
    int num[] = {92,12,20,68};
    int min, max;
    min =  0;
    max =  0;
    for (int i = 1; i < 10; i++) {
        if (num[i] < min)
            min = num[i];
        if(num[i] > max){
            max = num[i];
        }
    }
    System.out.println("min is: " + min);
    System.out.println("max is: " + max);
}
}
