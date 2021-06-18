package copy_file_text;

import java.io.*;

public class CopyFileExample1 {
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
                    "16 IO Text File/Bai tap/src/writeFileExample1.txt");
            // Có thể sinh ra ngoại lệ FileNotFoundException
            // FileNotFoundException extends IOException, IOException extends Exception
            fileReader = new FileReader(fileRead);
            bufferedReader = new BufferedReader(fileReader);
            int i;
            int number = 0;
            // Kiểm tra file đích đã tồn tại hay chưa
            if (!fileWrite.exists()) {
                fileWriter = new FileWriter(fileWrite);
                bufferedWriter = new BufferedWriter(fileWriter);
                while ((i = bufferedReader.read()) != -1) {
                    System.out.print((char) i);
                    bufferedWriter.write(i);
                    number++;
                }
                System.out.println("\nFile co " + number + " ki tu byte");
                bufferedWriter.newLine();
                bufferedWriter.write("File co " + number + " ki tu byte");
                bufferedWriter.flush();
                System.out.println("Successed!");
            } else {
                System.err.println("File cần ghi đã tồn tại!");
            }
        } catch (IOException e) {
            System.err.println("Không tìm thấy file nguồn!");
        } finally {
            CopyFileExample2.closeFile(fileReader, fileWriter, bufferedReader, bufferedWriter);
        }
    }
}
