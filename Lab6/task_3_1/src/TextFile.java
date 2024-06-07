import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFile {
    private static TextFile instance;

    private TextFile() {}

    public static TextFile getInstance() {
        if (instance == null) {
            instance = new TextFile();
        }
        return instance;
    }

    public String readFile(String fileName) {
        StringBuilder text = new StringBuilder();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                text.append(scanner.nextLine());
                text.append("\n");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return text.toString();
    }

    public String addTextToFile(String fileName, String addText) {
        String text = readFile(fileName);
        return text + addText;
    }
}
