public class Rectangle extends Shape{
    private int rectangle;
    private int length;
    public Rectangle(String nameShape,int rectangle,int length) {
        super(nameShape);
        this.rectangle=rectangle;
        this.length=length;
    }

    public int getRectangle() {
        return rectangle;
    }

    public void setRectangle(int rectangle) {
        this.rectangle = rectangle;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return rectangle+length+rectangle+length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "rectangle=" + rectangle +
                ", length=" + length +
                '}'+super.toString();
    }
}
