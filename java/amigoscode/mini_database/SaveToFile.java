package mini_database;

import java.io.*;

public class SaveToFile {
    String path = MainWindow.filePath;
    PrintWriter pr = createFile(path);

    PrintWriter createFile(final String path) {
        this.path = path;

        try {
            File file = new File(path);
            return new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    void printToFile(String x, PrintWriter pr) {
        this.pr = pr;

        pr.println(x);
    }

    void addSpace() {
        this.pr.println();
    }
}
