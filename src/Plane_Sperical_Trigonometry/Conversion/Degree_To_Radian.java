package Plane_Sperical_Trigonometry.Conversion;

public class Degree_To_Radian {
    // 1 rad = 180/pi deg
    // 1 deg = pi/180 rad
    // To calculate Smaller angles we use minutes and seconds
    // 1deg = 60 minutes
    // 1min = 1/60deg
    // 1 minute = 60 seconds
    // 1 sec= 1/3600 deg

    // Here we use float to reduce the precision of radian measure.
    public static float DegreeToRadian_String(String degrees) {
        char[] degreeArray = degrees.toCharArray();
        boolean flagOfInvalidity = false;
        for (char i : degreeArray) {
            if (i > 57 && i != 176 || i < 48 && i != 39 && i != 34) {
                flagOfInvalidity = true;
                break;
            }
        }
        if (flagOfInvalidity) {
            System.out.println("Invalid value Entered!");
            return -1;
        }
        double PI = Math.PI;
        float deg = 0;
        float minutes = 0;
        float seconds = 0;
        int i = 0;
        while (i < degreeArray.length && degreeArray[i] != 176) {
            deg += degreeArray[i++] - 48;
            deg *= 10;
        }
        deg /= 1800;
        deg *= PI;
        i++;
        while (i < degreeArray.length && degreeArray[i] != 39) {
            minutes += degreeArray[i++] - 48;
            minutes *= 10;
        }
        i++;
        minutes /= 600;
        minutes *= PI;
        minutes /= 180;
        while (i < degreeArray.length && degreeArray[i] != 34) {
            seconds += degreeArray[i++] - 48;
            seconds *= 10;
        }
        seconds /= 36000;
        seconds *= PI;
        seconds /= 180;
        return deg + minutes + seconds;
    }
    public static float DegreeToRadian(float degrees, float minutes, float seconds){
        try{
            double radianMeasure = ((degrees + (minutes/60) + (seconds/3600))*Math.PI)/180;
            return (float)radianMeasure;
        }catch(NumberFormatException ex){
            System.out.println("Invalid Input: "+ex.getMessage());
            return 0;
        }
    }

    public static void main(String...args){
        /*
        * Symbols:
        * Degree: °
        * Minute: '
        * Seconds: "
        * */
        //Test Runs
        System.out.println(DegreeToRadian_String("30"));
        System.out.println(DegreeToRadian_String("135"));
        System.out.println(DegreeToRadian_String("25°30'"));
        System.out.println(DegreeToRadian_String("42°24'35\""));
        System.out.println(DegreeToRadian_String("ABC"));
        System.out.println(DegreeToRadian_String("25°"));
        System.out.println(DegreeToRadian_String("160°"));
        System.out.println(DegreeToRadian_String("112°40'"));
        System.out.println(DegreeToRadian_String("12°12'20\""));
        System.out.println(DegreeToRadian_String("75°30'"));
        System.out.println("==============================================================");
        System.out.println(DegreeToRadian(30,0,0));
        System.out.println(DegreeToRadian(135,0,0));
        System.out.println(DegreeToRadian(25,30,0));
        System.out.println(DegreeToRadian(42,24,35));
        //System.out.println(DegreeToRadian());
        System.out.println(DegreeToRadian(25,0,0));
        System.out.println(DegreeToRadian(160,0,0));
        System.out.println(DegreeToRadian(112,40,0));
        System.out.println(DegreeToRadian(12,12,20));
        System.out.println(DegreeToRadian(75,30,0));
        /*
        int val = '°';
        int minute = '\'';
        int second='\"';
        int zero='0';
        int nine='9';
        System.out.println("Degree: "+val+"\nMinute: "+minute+"\nSecond: "+second);
        System.out.println("ZERO: "+zero+"\nNINE: "+nine);
        Degree: 176
        Minute: 39
        Second: 34
        */
    }
}
