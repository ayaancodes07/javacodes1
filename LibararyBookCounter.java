class LibararyBookCounter {
    static String title;
    static String authore;
    static int price;
    static void Book(){
        title="Ramayana";
        authore="Valmukki";
        price=200;
    }
    static void display(){
        System.out.println("Title Name = "+title);
        System.out.println("Book Authore = "+authore);
        System.out.println("Price Of Book = "+price);
    }
    public static void main(String[] args){
        LibararyBookCounter.Book();
        LibararyBookCounter.display();
    }
}
