package org.opentutorials.javatutorials.array;

public class ForeachDemo {
    public static void main(String[] args){
        String[] members = {"최진혁", "최유빈", "한이람"};
        for (String member : members){
            System.out.println(member + "이 상담을 받았습니다");
        }
    }
}
