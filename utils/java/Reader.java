package utils.java;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import Day5_JAVA.App;


public class Reader {
    private String path;
  
    public Reader(String path) {
        setPath(path);
    }
    public String read()
    throws IOException{
        InputStream inputStream = App.class.getResourceAsStream(path);
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
}   
    private void setPath(String path) {
        this.path = path;
    }

}