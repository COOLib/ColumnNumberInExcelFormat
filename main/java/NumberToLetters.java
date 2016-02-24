import java.util.Scanner;

public class NumberToLetters {

    private Scanner scanner = new Scanner(System.in);

    public String numberToNameOfColumn(int input) {

        if (input <= 0) {
            return null;
        }

        int startOfInterval = 'A' - 1;
        int interval = 'Z' - startOfInterval;
        String result;

        StringBuilder letters = new StringBuilder();

        while (input != 0) {
            char intToChar = (char) (input % interval + startOfInterval);
            letters.append(intToChar);
            input = input / interval;
        }
        result = letters.reverse().toString();

        return result;
    }

    private void choiceOutPutWay(String input) {

        System.out.println("You can write an output string in the console or you can write it to the file.");
        System.out.println("Please, enter 'c' if you want to output your string in the console,");
        System.out.println("or 'f' - to write it to the file.");

        while (true) {
            String s = scanner.nextLine();

            if (s.equals("c")) {
                System.out.println(input);
                break;
            } else if (s.equals("f")) {
                Helper.writeToFile(input);
                break;
            }

            System.out.println("Please, make your choice, and select one of these letters: 'c' or 'f'.");
        }
    }

    private int getInput() {

        int enteredNumber;

        while (true) {

            String input = scanner.nextLine();

            if (Helper.isInteger(input)) {
                enteredNumber = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Please, enter positive integer number.");
            }
        }

        return enteredNumber;
    }

    public void startDialog() {

        System.out.println("Please, enter counting number to translate it to Excel format.");

        int input = getInput();
        String result = numberToNameOfColumn(input);

        choiceOutPutWay(result);
    }

}
