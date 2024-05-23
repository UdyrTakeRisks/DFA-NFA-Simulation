import java.io.*;

public class FSAFileService {
    static String problemNumber;
    static String problemInputLine;
    static BufferedReader reader;
    static BufferedWriter writer;
    static String fileName = "output.txt";

    public static void parseFile(int problemNumber, BufferedReader reader) throws IOException {

        switch (problemNumber) {

            case 1 -> writeProblem1(reader);

            case 2 -> writeProblem2(reader);

            case 3 -> writeProblem3(reader);

            case 4 -> writeProblem4(reader);

            case 5 -> writeProblem5(reader);

            case 6 -> writeProblem6(reader);

            case 7 -> writeProblem7(reader);

            case 8 -> writeProblem8(reader);

            case 9 -> writeProblem9(reader);

            case 10 -> writeProblem10(reader);

            default -> System.exit(0);
        }
    }

    public static void writeProblem1(BufferedReader reader) throws IOException {
        //write problem number to output file
        writeToFile("1");
        while ((problemInputLine = reader.readLine()) != null) {
            if (problemInputLine.equals("end"))
                break;
            FSAController.simulateProblem1(problemInputLine);
        }
        //problem finished, so write x to output file
        writeToFile("x\n");
    }

    public static void writeProblem2(BufferedReader reader) throws IOException {
        //write problem number to output file
        writeToFile("2");
        while ((problemInputLine = reader.readLine()) != null) {
            if (problemInputLine.equals("end"))
                break;
            FSAController.simulateProblem2(problemInputLine);
        }
        //problem finished, so write x to output file
        writeToFile("x\n");
    }

    public static void writeProblem3(BufferedReader reader) throws IOException {
        //write problem number to output file
        writeToFile("3");
        while ((problemInputLine = reader.readLine()) != null) {
            if (problemInputLine.equals("end"))
                break;
            FSAController.simulateProblem3(problemInputLine);
        }
        //problem finished, so write x to output file
        writeToFile("x\n");
    }

    public static void writeProblem4(BufferedReader reader) throws IOException {
        //write problem number to output file
        writeToFile("4");
        while ((problemInputLine = reader.readLine()) != null) {
            if (problemInputLine.equals("end"))
                break;
            FSAController.simulateProblem4(problemInputLine);
        }
        //problem finished, so write x to output file
        writeToFile("x\n");
    }

    public static void writeProblem5(BufferedReader reader) throws IOException {
        //write problem number to output file
        writeToFile("5");
        while ((problemInputLine = reader.readLine()) != null) {
            if (problemInputLine.equals("end"))
                break;
            FSAController.simulateProblem5(problemInputLine);
        }
        //problem finished, so write x to output file
        writeToFile("x\n");
    }

    public static void writeProblem6(BufferedReader reader) throws IOException {
        //write problem number to output file
        writeToFile("6");
        while ((problemInputLine = reader.readLine()) != null) {
            if (problemInputLine.equals("end"))
                break;
            FSAController.simulateProblem6(problemInputLine);
        }
        //problem finished, so write x to output file
        writeToFile("x\n");
    }

    public static void writeProblem7(BufferedReader reader) throws IOException {
        //write problem number to output file
        writeToFile("7");
        while ((problemInputLine = reader.readLine()) != null) {
            if (problemInputLine.equals("end"))
                break;
            FSAController.simulateProblem7(problemInputLine);
        }
        //problem finished, so write x to output file
        writeToFile("x\n");
    }

    public static void writeProblem8(BufferedReader reader) throws IOException {
        //write problem number to output file
        writeToFile("8");
        while ((problemInputLine = reader.readLine()) != null) {
            if (problemInputLine.equals("end"))
                break;
            FSAController.simulateProblem8(problemInputLine);
        }
        //problem finished, so write x to output file
        writeToFile("x\n");
    }

    public static void writeProblem9(BufferedReader reader) throws IOException {
        //write problem number to output file
        writeToFile("9");
        while ((problemInputLine = reader.readLine()) != null) {
            if (problemInputLine.equals("end"))
                break;
            FSAController.simulateProblem9(problemInputLine);
        }
        //problem finished, so write x to output file
        writeToFile("x\n");
    }

    public static void writeProblem10(BufferedReader reader) throws IOException {
        //write problem number to output file
        writeToFile("10");
        int testCases = 1;
        while ((problemInputLine = reader.readLine()) != null) {
            if (problemInputLine.equalsIgnoreCase("end") || testCases > 4) //End
                break;
            testCases++;
            FSAController.simulateProblem10(problemInputLine);
        }
        //problem finished, so write x to output file
        writeToFile("x");
    }

    public static void readFromFile(String fileName) {
        try {
            reader = new BufferedReader(new FileReader(fileName));
            while ((problemNumber = reader.readLine()) != null) {
                // handles white spaces
                if (problemNumber.isEmpty())
                    continue;
                // parse numbers in file
                int number = Integer.parseInt(problemNumber);
                parseFile(number, reader);
            }
            reader.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    public static void writeToFile(String line) {
        // inside simulateProblems
        try {
            writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(line + "\n");
            writer.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    public static void play() {
        // call read file
        String fileName = "input.txt";
        readFromFile(fileName);
    }
}
