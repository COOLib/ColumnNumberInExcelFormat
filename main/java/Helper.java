import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Helper {

    public static boolean isInteger(String userInput) {

        try {
            Integer.parseInt(userInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void writeToFile(String input) {

        JFileChooser dialog = new JFileChooser();
        dialog.showSaveDialog(null);
        File file = dialog.getSelectedFile();
        dialog.setVisible(true);

        if (file != null) {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(input);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("You did not choose any file.");
            System.out.println("Instead writing string to any file, the program will write it in console.");
            System.out.println(input);
        }
    }
}
