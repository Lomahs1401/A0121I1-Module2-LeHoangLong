package copy_file_text;

import java.io.*;

public class CopyFileExample2 {
    public static void main(String[] args) throws IOException {
        File fileRead;
        File fileWrite;
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileRead = new File("C:/Users/Admin/IdeaProjects/A0121I1-Module2/" +
                    "16 IO Text File/Bai tap/src/readFile.txt");
            fileWrite = new File("C:/Users/Admin/IdeaProjects/A0121I1-Module2/" +
                    "16 IO Text File/Bai tap/src/writeFileExample2.txt");
            // Có thể sinh ra ngoại lệ FileNotFoundException
            // FileNotFoundException extends IOException, IOException extends Exception
            fileReader = new FileReader(fileRead);
            bufferedReader = new BufferedReader(fileReader);
            int length;
            char[] charBuffers = new char[256];
            // Kiểm tra file đích đã tồn tại hay chưa
            if (!fileWrite.exists()) {
                fileWriter = new FileWriter(fileWrite);
                bufferedWriter = new BufferedWriter(fileWriter);
                length = bufferedReader.read(charBuffers);
                String result = new String(charBuffers, 0, length);
                System.out.println(result);
                System.out.println("File co " + length + " ki tu byte");
                bufferedWriter.write(result);
                // hoặc bufferedWriter.write(charBuffers, 0, length)
                bufferedWriter.newLine();
                bufferedWriter.write("File co " + length + " ki tu byte");
                bufferedWriter.flush();
                System.out.println("Successed!");
            } else {
                System.err.println("File cần ghi đã tồn tại!");
            }
        } catch (IOException exception) {
            System.err.println("Không tìm thấy file nguồn");
        } finally {
            closeFile(fileReader, fileWriter, bufferedReader, bufferedWriter);
        }
    }

    static void closeFile(FileReader fileReader, FileWriter fileWriter,
        BufferedReader bufferedReader, BufferedWriter bufferedWriter) throws IOException {
        if (fileReader != null) {
            fileReader.close();
        }
        if (fileWriter != null) {
            fileWriter.close();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
    }
}
