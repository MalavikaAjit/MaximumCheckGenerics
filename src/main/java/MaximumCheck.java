
public class MaximumCheck <T extends Comparable>{

    T x,y,z;
    T max;

    public MaximumCheck(T x,T y,T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static < T extends Comparable <T>> T testMax(T x, T y ,T z){
        T max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;
        return max;
    }
    public T testMax(){
        return (T) MaximumCheck.testMax(x,y,z);
    }

    public static void main(String[] args) {
       Integer xInt=3, yInt=2,zInt=1;
       Float xF1=3.2f, yF2=2.2f, zF3=1.2f;
       String xStr="peach",yStr="banana",zStr="apple";

       MaximumCheck.testMax(xStr,yStr,zStr);
       MaximumCheck.testMax(xInt,yInt,zInt);
       MaximumCheck.testMax(xF1,yF2,zF3);
       // maximumCheck.testMax(xStr,yStr,zStr);
    }
}