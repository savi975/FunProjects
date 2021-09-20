import java.lang.*;

public class FindPi{
    public static void main(String args[]){
        double[][] coordsList = new double[1000000][2];
        double withinTotal = 0;
        for (int i = 0; i < coordsList.length; i++){
            double[] coordinate = {random(), random()};
            coordsList[i] = coordinate;
        }
        for (int i = 0; i < coordsList.length; i++){
           if(isInsideUnitCircle(coordsList[i][0], coordsList[i][1])){
               withinTotal++;
            }
        }
        System.out.println(4*withinTotal/coordsList.length);

    }
    public static double random(){
        return Math.random();
    }
    public static boolean isInsideUnitCircle(double x, double y){
        return Math.hypot(x, y) < 1;
    }
}