package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {
    public static void main(String[] args){
        String[] names = {"김씨", "박씨", "이씨"};

        for (int i = 0; i < names.length; i++){
            String member = names[i];
            System.out.println(member + "가 상담을 받았습니다");
        }
    }
}
