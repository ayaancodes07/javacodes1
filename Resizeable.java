interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    public void display() {
        System.out.println("Rectangle width: " + width + ", height: " + height);
    }
}

public class ResizableDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.println("Initial dimensions:");
        rect.display();

        rect.resizeWidth(15);
        rect.resizeHeight(25);

        System.out.println("\nAfter resizing:");
        rect.display();
    }
}