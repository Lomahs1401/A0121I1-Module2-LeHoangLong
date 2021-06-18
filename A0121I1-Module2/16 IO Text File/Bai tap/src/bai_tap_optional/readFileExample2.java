package bai_tap_optional;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class readFileExample2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/Admin/IdeaProjects/A0121I1-Module2/" +
                "16 IO Text File/Bai tap/src/bai_tap_optional/file.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            char[] chars = new char[500];
            int length = bufferedReader.read(chars);
            String s = new String(chars, 0, length);
            String[] result = s.split("[,]+");
            System.out.println(Arrays.toString(result));
            System.out.println("Succeed!");
        } catch (IOException exception) {
            System.err.println("Không tìm thấy file nguồn!");
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
}
