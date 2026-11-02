class Circle {
    double PI=3.14;
    int r=10;
    double area;

    void ClaculateArea(){
        area=PI*r*r;
    }
    void display(){
        System.out.println("Area of circle="+ area);
    }
    public static void  main(String[] args){
        Circle c=new Circle();
        c.ClaculateArea();
        c.display();
    }
}
