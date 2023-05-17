package Plane_Sperical_Trigonometry.Conversion;

public class To_Mils {
    //1mil = 360/6400 deg => 1mil = 9/160 deg
    //then from deg to radian or radian to deg use other class
    public static float degreeToMills(float degree,float minutes, float seconds){
        try {
            float degrees = degree + (minutes/60) + (seconds/3600);
            return (degrees*160)/9;
        }catch(NumberFormatException ex){
            System.out.println("Invalid Value: "+ex.getMessage());
            return 0;
        }
    }
    public static float RadianToMills(double angle){
        Radian_To_Degree.DegreeMeasure angleInDegrees=Radian_To_Degree.
                DegreeMeasure.getDegreeMeasure(angle);
        return degreeToMills(angleInDegrees.getDegrees(),angleInDegrees.getMinutes(),angleInDegrees.getSeconds());
    }
    public static float RadianToMills(double dividend, double divisor){
        Radian_To_Degree.DegreeMeasure angleInDegrees=Radian_To_Degree.
                DegreeMeasure.getDegreeMeasure_Fraction(dividend,divisor);
        return degreeToMills(angleInDegrees.getDegrees(),
                angleInDegrees.getMinutes(),angleInDegrees.getSeconds());

    }
    public static void main(String...args){
        System.out.println(degreeToMills(18,0,0));
        System.out.println(degreeToMills(16,20,0));
        System.out.println(RadianToMills(0.22));
        System.out.println(RadianToMills(1.6));
        System.out.println(degreeToMills(45,0,0));
        System.out.println(degreeToMills(10,15,0));
        System.out.println(RadianToMills(0.4));
        System.out.println(RadianToMills(0.06));
        System.out.println("===================================================");
        System.out.println(degreeToMills(45,0,0));
        System.out.println(degreeToMills(10,15,0));
        System.out.println(RadianToMills(0.4));
        System.out.println(RadianToMills(0.06));
    }
}
