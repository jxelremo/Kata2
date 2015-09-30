package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {

        Integer[] vector = {1,1,1,4,4,2,2,2,100,-4,-2};
        
        String[] vector1 = {"Ana","Juan","Pedro","Ana","Juan"};
        
        Histogram miHisto = new Histogram(vector);
        Histogram miHisto1 = new Histogram(vector1);
        
        HashMap<Integer,Integer> histogram = miHisto.getHisto();
        HashMap<String,Integer> histogram1 = miHisto1.getHisto();
        
        System.out.println(histogram);
        System.out.println(histogram1);
        
    }
}
