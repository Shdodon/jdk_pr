package hw1.server;

import java.io.IOException;

public interface ILog {
    void writeLog(String msg) throws IOException;
    StringBuilder readLog () throws IOException;
    String readLast () throws IOException;
}
