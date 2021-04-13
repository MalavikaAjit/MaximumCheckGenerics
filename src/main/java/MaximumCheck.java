import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumCheck<T extends Comparable<T>> {

    T max;

    public T testMax(T[]args){
        Arrays.sort(args);
        max = args[args.length - 1];
        return max;
    }
}