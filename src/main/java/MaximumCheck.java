
public class MaximumCheck {

    public Integer testMax(Integer x, Integer y, Integer z){
        int max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {

        MaximumCheck maximumCheck = new MaximumCheck();
        System.out.println(maximumCheck.testMax(1, 2, 3));
    }
}