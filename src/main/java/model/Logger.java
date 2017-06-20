package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * Created by amitp on 20/06/2017
 */
public class Logger {

    private static Logger logger = new Logger();
    private int counter = 0;

    private Logger() {
        counter ++;
    }

    public static Logger getInstance() {
        return logger;
    }

    public void logError(String message) {
        log(message, "./log/errors.txt");
    }

    public void logAction(String message) {
        log(message, "./log/actions.txt");
    }

    private void log(String message, String path) {
        Date date = new Date();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write("***" + date.toString() +" : " + message + "***");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
