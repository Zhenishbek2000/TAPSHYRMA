public class Square extends Shape{
    private int length;
    public Square(String nameShape,int length) {
        super(nameShape);
        this.length=length;


    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return length*4;
    }


    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}'+super.toString();
    }
}
