package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {

        int[] vector = {1,1,1,4,4,2,2,2,100,-4,-2};
        
        Histogram miHisto = new Histogram(vector);
        
        HashMap<Integer,Integer> histogram = miHisto.getHisto();
        
        System.out.println(histogram);
    }
}
