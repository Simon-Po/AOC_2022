
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;



public class App{ 

    public static void main(String[] args) throws IOException {
          Reader r = new Reader();
          InputStream inputStream = App.class.getResourceAsStream("/input.txt");
          String data = r.readFromInputStream(inputStream);
          String[] d = data.split("\n");
          List<String> collection = new ArrayList<String>();
          List<List<String>> cc = new ArrayList<List<String>>();
          
          for (String string : d) {
            if(string != ""){
               collection.add(string);
            } else {
                List<String> tmp = new ArrayList<String>(collection);
                cc.add(tmp);
                collection.clear();
            }

          }
          List<Integer> l = new ArrayList<Integer>();
          for (List<String> list : cc) {
           l.add(r.listToInt(list)); 
          };
          l.sort(null);
         
          System.out.println(l.get(l.size()-1) + l.get(l.size()-2) + l.get(l.size()-3) );
        
          
    }
     


    }
