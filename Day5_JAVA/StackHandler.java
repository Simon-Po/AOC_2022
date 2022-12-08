
package Day5_JAVA;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class StackHandler {

    public List<Stack<String>> stackList = new ArrayList<Stack<String>>();

    public List<Stack<String>> getStackList() {
        return stackList;
    }

    public StackHandler(String[] data) {

        
        createStacks(data);

    }

    private void createStacks(String[] data) {
        
       
        for (int i = 0; i < data.length; i ++) {
            stackList.add(i,new Stack<String>()); 
            // System.out.println(data[i]);
            String[] s = data[i].split("");
            for (int j = 0; j < s.length; j++) {
                this.stackList.get(i).push(s[j]);
            }

            

          
        }

    }


}
