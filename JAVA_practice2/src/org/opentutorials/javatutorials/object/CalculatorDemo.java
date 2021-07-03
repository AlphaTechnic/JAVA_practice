package org.opentutorials.javatutorials.object;

class Calculator {
    // 클래스 변수
    static double PI = 3.14;

    // 인스턴스 변수
    int left, right;

    public void setOperands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo {
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOperands(20, 40);
        c2.sum();
        c2.avg();

        System.out.println(c1.PI);
        System.out.println(Calculator.PI);
    }
}
