package Day5_JAVA;

import java.io.IOException;
import java.util.List;
import java.util.Stack;

import utils.java.*;

public class App {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader("crates.txt");
        String[] data = r.read().split("\n");
        StackHandler stackHandler = new StackHandler(data);
        List<Stack<String>> stacks = stackHandler.getStackList();
        
        
        Reader r1 = new Reader("input.txt");
        String[] input = r1.read().split("\n");
        // System.out.println(stacks);
        
        Stack<String> tempStack = new Stack<String>();
        for (int i = 0; i < input.length; i++) {
            String[] temp = input[i].split("");
            int amount,from,to;
            if(temp.length == 3) {
                 amount =  Integer.valueOf(temp[0]);
                 from= Integer.valueOf(temp[1]);
                 to = Integer.valueOf(temp[2]);
            } else {
                String tomp = temp[0] + temp[1];
                 amount =  Integer.valueOf(tomp);
                 from= Integer.valueOf(temp[2]);
                 to = Integer.valueOf(temp[3]);
            }
            
            for (int j = 0; j < amount; j++) {
                String tmp = stacks.get(from - 1).pop();
                tempStack.push(tmp);
            }
            for (int j = 0; j < amount; j++) {
                String tmp = tempStack.pop();
                stacks.get(to - 1).push(tmp);
            }
        }

        System.out.println(stacks);

        




    }

    public void createStacks(){

        
    }

    

    
}