import java.lang.*;
public class Speedconverter {
    public static long toMilesPerHour(double KilometersPerHour){
        if( KilometersPerHour<0){
            return -1;
        }
        else{
            return Math.round( KilometersPerHour/1.609);
        }
    }
    public static void PrintConversion(double KilometersPerHour){
        if( KilometersPerHour<0){
            System.out.println("inavlid value");
        }
        else{
            System.out.println(KilometersPerHour+"km/h"+toMilesPerHour(KilometersPerHour)+"mi/h");
        }
    }
    public static void main(String[] args){
        Speedconverter s=new Speedconverter();
        PrintConversion(3.67);
    }
}
