package hw1.server;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileLog implements ILog{
    private String pathLog = "D:\\Java_code\\JavaCore\\jdk_pr\\jdk_pr\\src\\main\\java\\hw1\\server\\log.txt";

    @Override
    public void writeLog(String msg) throws IOException {
        FileWriter fw = new FileWriter(pathLog, true);
        fw.append(msg).append("\n");
        fw.flush();
    }

    @Override
    public StringBuilder readLog() throws IOException {
        StringBuilder sb = new StringBuilder();
        List<String> lines = Files.readAllLines(Paths.get(pathLog));
        for (String line : lines) {
            sb.append(line);
            sb.append("\n");
        }
        return sb;
    }

    @Override
    public String readLast() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(pathLog));
        return lines.getClass() + "\n";
    }
}
