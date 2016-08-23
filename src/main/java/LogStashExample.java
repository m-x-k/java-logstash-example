import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogStashExample {

    private static final Logger LOG = LoggerFactory.getLogger(LogStashExample.class);

    public static void main(String[] args) {
        LogStashExample logStashExample = new LogStashExample();
        logStashExample.firstLogExample();
        logStashExample.secondLogExample();
    }

    private void firstLogExample() {
        LOG.info("My First Log Example");
    }

    private void secondLogExample() {
        LOG.debug("My Second Log Example");
    }

}
