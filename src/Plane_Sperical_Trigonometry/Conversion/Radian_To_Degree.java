package Plane_Sperical_Trigonometry.Conversion;

public class Radian_To_Degree {
    public static class DegreeMeasure{
        private int Degrees;
        private int Minutes;
        private float Seconds;
        public DegreeMeasure(int Degrees, int minutes,float Seconds){
            this.Degrees=Degrees;
            this.Minutes=minutes;
            this.Seconds=Seconds;
        }
        public String toString(){
            return Degrees+"°"+Minutes+"'"+Seconds+"\"";
        }
        public int getDegrees(){ return Degrees;}
        public int getMinutes(){ return Minutes;}
        public float getSeconds(){ return Seconds;}

        private static float[] ConversionMechanism(double angle){
            //the return value from our function is in the form [degree,minutes,seconds]
            //why not return a string? Because it's not efficient and can't be used directly.
            //1 rad= 180/PI degrees
            double degree_Angle = (angle*180*7);
            int degree = (int)(degree_Angle/22);
            double remainingDegrees = (degree_Angle%22)*60;
            int minutes = (int)(remainingDegrees/22);
            double remainingMinutes =(remainingDegrees%22)*60;
            double seconds = remainingMinutes/22;
            return new float[]{degree,minutes,(float)seconds};
        }
        //If angle is a fraction use the method below
        public static DegreeMeasure getDegreeMeasure_Fraction(double dividend, double divisor){
            double angle=dividend/divisor;
            return getDegreeMeasure(angle);
        }
        //Use of Math.toDegrees() method
        public static double getDegreeMeasure_Simple(double angle){
            return Math.toDegrees(angle);
        }

        //else use the method below
        public static DegreeMeasure getDegreeMeasure(double angle){
            float[] result = ConversionMechanism(angle);
            return new DegreeMeasure((int)result[0],(int)result[1],result[2]);
        }

    }
    public static void main(String...arg){
        System.out.println(Math.toDegrees(0.7402));
        System.out.println(DegreeMeasure.getDegreeMeasure(0.7402));
        System.out.println(DegreeMeasure.getDegreeMeasure_Fraction(Math.PI,3));
        System.out.println(DegreeMeasure.getDegreeMeasure_Fraction(5*Math.PI,9));
        System.out.println(DegreeMeasure.getDegreeMeasure_Fraction(2,5));
        System.out.println(DegreeMeasure.getDegreeMeasure_Fraction(4,3));
        System.out.println(DegreeMeasure.getDegreeMeasure_Fraction(Math.PI,4));
        System.out.println(DegreeMeasure.getDegreeMeasure_Fraction(7*Math.PI,10));
        System.out.println(DegreeMeasure.getDegreeMeasure_Fraction(5*Math.PI,6));
        System.out.println(DegreeMeasure.getDegreeMeasure_Fraction(1,4));
        System.out.println(DegreeMeasure.getDegreeMeasure_Fraction(7,5));
    }
}
