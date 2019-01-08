package test8;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FileFirst file = new FileFirst("./res/test.txt");
        file.writeString("黄楚才fsfsdfsdfsd\nsdfsdfsdfsdfsdf");
        System.out.println(file.readToString());
    }
}
