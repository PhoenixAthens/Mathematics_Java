package Plane_Sperical_Trigonometry.Conversion;

public class RadianToDegree {
    public static String radianToDegree_String(String angle){
        return null;
    }
    public static float[] radianToDegree_Array(String angle){
        return null;
    }
    public static String radianToDegree_String(float angle){
       return null ;
    }
    public static float[] radianToDegree_Array(double dividend, double divisor){
        double angle=dividend/divisor;
        return innerWorkings(angle);
    }
    private static float[] innerWorkings(double angle){
        //the return value from our function is in the form [degree,minutes,seconds]
        //why not return a string? Because it's not efficient and can't be used directly.
        //1 rad= 180/PI degrees
        double degree_Angle = (angle*180*7);
        int degree = (int)(degree_Angle/22);
        double remainingDegrees = (degree_Angle%22)*60;
        int minutes = (int)(remainingDegrees/22);
        double remainingMinutes =(remainingDegrees%22)*60;
        double seconds = remainingMinutes/22;
        float[] arr={degree,minutes,(float)seconds};
        return arr;
    }
    public static void main(String...arg){
        System.out.println(Math.toDegrees(0.7402));
        float[] result1 = innerWorkings(0.742);
        System.out.println((int)result1[0]+"°"+(int)result1[1]+"'"+result1[2]+"\"");
    }
}
