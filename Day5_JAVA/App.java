package Day5_JAVA;

import java.io.IOException;

import utils.java.*;

public class App {
    public static void main(String[] args) throws IOException {
       Reader r = new Reader("test.txt");
       String data = r.read();
        System.out.println(data);

    }

    
}