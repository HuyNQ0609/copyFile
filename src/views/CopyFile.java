package views;

import java.io.*;

public class CopyFile {
    public void copyFile(String path, String newFile) {
        try {
            File file1 = new File(path);
            if (!file1.exists()) {
                System.out.println("File does not exists");
            }
            File file2 = new File(newFile);
            if(file2.exists()) {
                System.out.println("File already exists!");
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
            String line;
            FileWriter fileWriter = new FileWriter(file2, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\n");
            }
            bufferedWriter.flush();
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
