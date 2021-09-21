import java.lang.*;




public class Collatz{
    public static void main(String args[]) {
        int collatz = Integer.parseInt(args[0]);
        System.out.println(collatzLoop(collatz));
    }

    public static int collatzLoop(int i){
        return collatzLoopHelper(i, 0);
    }
    public static int collatzLoopHelper(int i, int count){
        if(i==1) {return count;}
        if (i%2!=0){
            count++;
            return collatzLoopHelper(3*i+1, count);
        }

        return collatzLoopHelper(i/2, ++count);
    }


}