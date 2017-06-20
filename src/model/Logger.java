/**
 * Created by amitp on 20/06/2017
 */
public class Logger {

    private static Logger logger = new Logger();

    public static Logger getInstance() {
        return logger;
    }

    private Logger() {
    }

    public void actionLogger(String actions){
        
    }

    public void errorLogger(String error){

    }

    private void log(String message, String path){

    }
}
