package org.opentutorials.javatutorials.method;

public class ParameterReturn {
    public static String numbering(int init, int end){
        String output = "";
        for (int i = init; i <= end; i++){
            output += i;
        }
        return output;
    }

    public static void main(String[] args){
        String res = numbering(1, 5);
        System.out.println(res);
    }
}
