package devide;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Divide {
    private static Logger logger = LogManager.getLogger(Divide.class);
    public static double add(double a, double b) throws Exception{
        double c;
        c = a / b;
        if (!(Double.isNaN(c)) && (!Double.isInfinite(c))){
        return c;}
        else {
            throw new Exception();
        }
    }
    public static void main(String[] args) throws Exception{
        logger.info(add(7,4));
    }



}
