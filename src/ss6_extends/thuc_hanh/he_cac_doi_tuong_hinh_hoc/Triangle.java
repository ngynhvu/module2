package ss6_extends.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Triangle extends Shape{
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;
    Triangle(){}
    Triangle(String color, boolean filled){
        super(color, filled);
    }
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public  double getPerimeter(){
        return side1+side2+side3;
    }
    public double getHalfPerimeter(){
        return getPerimeter()/2;
    }
    public double getHeight(){
        return 2*(Math.sqrt(getHalfPerimeter()*(getHalfPerimeter()-side1)*(getHalfPerimeter()-side2)*(getHalfPerimeter()-side3)))/4;
    }
    public double getArea(){
        return 0.5*getHeight()*side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", Area="  + getArea() +
                ", Perimeter=" +getPerimeter() +
                '}'+super.toString();
    }
}
