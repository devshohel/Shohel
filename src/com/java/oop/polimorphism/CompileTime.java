
package com.java.oop.polimorphism;

public class CompileTime {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(10.50,20.25,19.25));
        System.out.println(cal.add(20,50));
        System.out.println(cal.add(15,5.50));
        System.out.println(cal.add(5,8,7,10,15,25));
        cal.add();
    }
}

class Calculator{
    public int add(int a, int b){
        return a*b;
    }
    public double add(double a, double b, double c){
        return a+b+c;
    }
    public int add(int a, double b){
        return (int)(a+b);
    }
    public int add(int ...numbers){
        int sum = 0;
        for(int n : numbers){
        sum += n;
        }
        return sum;
    }
    public void add(){
        System.out.println("No number");
    }
}
