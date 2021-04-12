/**
 * Implement your code here
 * @Author Your Name
 * @Date Date
 */
public class Guitar37 implements Guitar {

    /** Class constant(s)
     */
    public static final int NUM_STRING = 37;
    public static final String KEYBOARD =
        "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";  // keyboard layout

    /**
     * Implement your code here
     * Change comments
     */
    public Guitar37(boolean useKP){
    }

    /**
     * Implement your code here
     * Change comments
     */
    @Override
    public void playNote(int pitch) {
    }

    /**
     * Implement your code here
     * Change comments
     */
    @Override
    public boolean hasString(char key) {
        return false;
    }

    /**
     * Implement your code here
     * Change comments
     */
    @Override
    public void pluck(char key) {
    }

    /**
     * Implement your code here
     * Change comments
     */
    @Override
    public double sample() { return -1; }

    /**
     * Implement your code here
     * Change comments
     */
    @Override
    public void tic() {
    }

    /**
     * Implement your code here
     * Change comments
     */
    @Override
    public int time() {
        return -1;
    }
}