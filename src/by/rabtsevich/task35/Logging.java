package by.rabtsevich.task35;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logging {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        try {
            fh = new FileHandler("MyLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            int [] values = new int[3];
            for (int i= 0; i <= values.length; i++){
                values[i] = i;
            }
        } catch (SecurityException e) {
            logger.info("SecurityException!");
        } catch (IOException e) {
            logger.info("IOException!");
        } catch (IndexOutOfBoundsException e) {
            logger.info("IndexOutOfBoundsException!");
        }

    }
}
