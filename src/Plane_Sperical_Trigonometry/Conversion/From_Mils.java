package Plane_Sperical_Trigonometry.Conversion;
public class From_Mils {
    //1mil = 360/6400 = 9/160 deg
    //we have to go from mills to deg, mills to radian
    public static float MillsToDegree(double mills){
        return (float)((mills*9)/160);
    }
    public static float MillsToRadian(double mills){
        //1 radian = 180/pi degree, 1deg = pi/180 rad
        double tempDegree = MillsToDegree(mills);
        return (float)((tempDegree*Math.PI)/180);
    }
    public static float[] MillsToDegree_Defined(double mills){
        float radianMeasure = MillsToRadian(mills);
        Radian_To_Degree.DegreeMeasure obj= Radian_To_Degree.DegreeMeasure.getDegreeMeasure(radianMeasure);
        return new float[]{obj.getDegrees(),obj.getMinutes(),obj.getSeconds()};
    }
    public static void main(String...args){
        System.out.println(MillsToDegree(40));
        System.out.println(java.util.Arrays.toString(MillsToDegree_Defined(40)));
        System.out.println(MillsToRadian(40));

        System.out.println(MillsToDegree(100));
        System.out.println(java.util.Arrays.toString(MillsToDegree_Defined(100)));
        System.out.println(MillsToRadian(100));
    }

}
