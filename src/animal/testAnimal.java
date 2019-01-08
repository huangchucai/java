package animal;
import java.io.*;

public class testAnimal {
    public static void main(String args[]) throws IOException {
        InputStream val = System.in;
        InputStreamReader stdReader = new InputStreamReader(val);
        char[] buffer = new char[0];
        int length = stdReader.read(buffer);
        System.out.println(length);
        int[] bWrite = { 11, 21, 3, 40, 5, 1 };
        OutputStream os = new FileOutputStream("res/output.txt");
        for (int i = 0; i < bWrite.length; i++) {
            os.write(bWrite[i]);
        }
        os.close();
        InputStream is = new FileInputStream("res/output.txt");
        byte[] buffer2 = new byte[20];
        int length2 = is.read(buffer2);

//        int size = is.available();
//        System.out.println(size);
        System.out.println(length2);
        for (int i = 0; i < length2; i++) {
            System.out.print(buffer2[i] + "  ");
        }
        is.close();
    }
}
