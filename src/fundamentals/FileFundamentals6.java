package fundamentals;

import java.io.File;
import java.util.Scanner;

public class FileFundamentals6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println();
        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}
