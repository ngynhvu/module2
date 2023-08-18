package oop.bai_tap.ptbac2;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDelta(){
        return b*b - 4*a*c;
    }
    public double getRoot12(){
        return -b/2*a;
    }
    public  double getRoot1(){
        return (-b + Math.sqrt(this.getDelta()))/2*a;
    }
    public  double getRoot2(){
        return (-b - Math.sqrt(this.getDelta()))/2*a;
    }
}
