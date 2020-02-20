package HomeWork3;

import java.util.Arrays;

public class StringReverser {
    private String regex;
    public StringReverser(String regex){
        this.regex=regex;
    }
    public String reverse(String string){
        String[] arr = string.split(regex);
        String answer= "";
        Stack<String> stack = new Stack<>(arr.length);
        for (String item:arr){
            stack.push(item);
        }
        for (String item:arr){
            answer+=stack.pop()+" ";
        }
        return answer;
    }
}
