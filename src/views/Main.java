package views;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter source path: ");
        String sourcePath = input.nextLine();

        System.out.println("Enter target path: ");
        String targetPath = input.nextLine();

        copyFile.copyFile(sourcePath, targetPath);
    }
}