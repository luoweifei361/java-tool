package weifei.lwf.comm.tool;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTool {

    public static BufferedReader open(String txtFile) {
        FileReader fileReader;
        try {
            fileReader = new FileReader(new File(txtFile));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader reader = new BufferedReader(fileReader);
        return reader;
    }

    public static void close(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            // 吃掉它，因为你无法处理
        }
    }
    public static String readLine(BufferedReader br) {
        try {
            return br.readLine();
        } catch (IOException e) {
            close(br);
            throw new RuntimeException(e);
        }
    }
}
