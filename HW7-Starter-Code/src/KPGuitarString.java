import java.util.*;

/**
 * Implement your code here.
 * Change comments
 * @Author Your Name
 * @Date
 */
public class KPGuitarString implements GuitarString{
    private Queue<Double> ringBuffer;
    public static final double ENERGY_DECAY_FACTOR = 0.996;

    /**
     * Constructor: Implement your code here
     * change comments
     */
    public KPGuitarString(double frequency){
    }

    /**
     * Constructor: Implement your code here
     * change comments
     */
    public KPGuitarString(double[] init){
    }

    /**
     * Implement your code here
     * Change comments
     */
    @Override
    public void pluck(){
    }

    /**
     * Implement your code here
     * Change comments
     */
    @Override
    public void tic(){
    }

    /**
     * Implement your code here
     * Change comments
     */
    @Override
    public double sample(){
        return -1;
    }
}