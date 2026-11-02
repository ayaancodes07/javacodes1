 class STUDENT {
    String name;
    int USN;

    void Student(String name,int USN){
        this.name=name;
        this.USN=USN;
    }
    void display(){
        System.out.println("Name="+name);
        System.out.println("USN="+USN);
    }
    public static void main(String[] args){
        STUDENT s1= new STUDENT();
        STUDENT s2= new STUDENT();
        s1.Student("Vinod",73);
        s2.Student("Thejas",68);
        s1.display();
        s2.display();

    }
}
