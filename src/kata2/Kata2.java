package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {

        Integer[] vector = {1,1,1,4,4,2,2,2,100,-4,-2};
        
        String[] vector1 = {"Ana","Juan","Pedro","Ana","Juan"};
        
        //Histogram <Integer> histogram = CalculaHistograma.calcHisto(vector);
        Histogram <String> histogram = CalculaHistograma.calcHisto(vector1);
        
        for (Object K : histogram.keySet()) {
            System.out.println(K+"->"+histogram.get(K));
        }
        
    }
}
