package school.mjc.stage0.loops.task1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad(){
    	int n = 20;
    	String text = "writing the same code doesn't have much impact, and it's also time consuming \n";
    		
    String resultado = IntStream.range(0, n)
    									.mapToObj(i -> text)
    									.collect(Collectors.joining());
    System.out.println(resultado);
    }
    
    public static void main(String[] args) {
    	RepeatIsBad repeat = new RepeatIsBad();
    	repeat.repeatIsBad();
    }
}
