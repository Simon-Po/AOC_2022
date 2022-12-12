package Day7_JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import utils.java.*;

public class App {

    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map;
        map = new HashMap<String, Integer>();
        String r = new Reader("..\\Day7_JAVA\\test.txt").read();
        String[] out = r.split("\n");
        List<String[]> x = new ArrayList<>();
        for (String s : out) {
            x.add(s.split(" "));
        }
        for (String[] s : x) {
            for (String string : s) {
                if(IsNumeric.check(string)){
                    
                    String arr = s[1];
                    if(arr.length() >= 2) {
                        String[] stringArr = arr.split("");
                        map.put(stringArr[0],Integer.parseInt(string));
                    } else {
                        map.put(arr, Integer.parseInt(string));
                    }
                    
                }
            }
        }
        System.out.println(map);


    }




}
