
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;


public class Reader {
    public String readFromInputStream(InputStream inputStream)
    throws IOException{
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
}   

public int listToInt(List<String> list) {
    int out = 0;
    for (String string : list) {
        out = out + Integer.parseInt(string);
    }
    return out;
}}