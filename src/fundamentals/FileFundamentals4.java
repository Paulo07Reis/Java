package fundamentals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileFundamentals4 {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
        String path = "C:\\Users\\paulo\\Desktop\\fundamentals-java\\src\\files\\out.txt";

        //Com o new FileWriter(path, true) nós inserimos novas coisas ao final do arquivo, sem ele cria novamente o mesmo arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
