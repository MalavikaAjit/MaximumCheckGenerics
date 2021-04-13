import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumCheck<T extends Comparable<T>> {

    T max;

    public T testMax(T[]args){
        Arrays.sort(args);
        max = args[args.length - 1];
        return max;
    }
    public void printMax(){
        System.out.println("maximum is :" + max);
    }
    public static void main(String[] args){
        MaximumCheck maximumCheck = new MaximumCheck();
        maximumCheck.printMax();
    }
}