import java.io.*;
import java.nio.file.Path;

public class Lab4 {
    public static void main(String[] args) throws IOException {
        File naturalText1 = new File("C:\\Users\\aandr\\OneDrive\\Рабочий стол\\WorkSpace\\CryptoMAI\\src\\main\\java\\ru\\aandr\\naturalText1.txt");
        File naturalText2 = new File("C:\\Users\\aandr\\OneDrive\\Рабочий стол\\WorkSpace\\CryptoMAI\\src\\main\\java\\ru\\aandr\\naturalText2.txt");
        File randomSymbols1 = new File("C:\\Users\\aandr\\OneDrive\\Рабочий стол\\WorkSpace\\CryptoMAI\\src\\main\\java\\ru\\aandr\\randomSymbols1.txt");
        File randomSymbols2 = new File("C:\\Users\\aandr\\OneDrive\\Рабочий стол\\WorkSpace\\CryptoMAI\\src\\main\\java\\ru\\aandr\\randomSymbols2.txt");
        File randomWords1 = new File("C:\\Users\\aandr\\OneDrive\\Рабочий стол\\WorkSpace\\CryptoMAI\\src\\main\\java\\ru\\aandr\\randomWords1.txt");
        File randomWords2 = new File("C:\\Users\\aandr\\OneDrive\\Рабочий стол\\WorkSpace\\CryptoMAI\\src\\main\\java\\ru\\aandr\\randomWords2.txt");
        System.out.println("Two meaningful texts");
        System.out.println(compare(naturalText1, naturalText2));
        System.out.println("Meaningful text and text with random symbols");
        System.out.println(compare(naturalText1, randomSymbols2));
        System.out.println("Meaningful text and text with random words");
        System.out.println("Two random symbols texts");
        System.out.println(compare(randomSymbols1, randomSymbols2));
        System.out.println("Two random words texts");
        System.out.println(compare(randomWords1, randomWords2));
    }

    public static double compare (File file1, File file2) throws IOException {
        int coincidence = 0;
        int length = 0;
        try(BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
            int ch1;
            int ch2;
            while ((ch1 = reader1.read()) != -1 && (ch2 = reader2.read()) != -1) {
                if (ch1 == ch2) {
                    coincidence++;
                }
                length++;
            }
        }
        return (double) coincidence / length;
    }

}
