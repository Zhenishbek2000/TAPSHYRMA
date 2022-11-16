public class Pentagons extends Shape{
    private double length;
    public Pentagons(String nameShape, double length) {
        super(nameShape);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }



    @Override
    public double getPerimeter() {

       return length+length+length+length+length;
    }

    @Override
    public String toString() {
        return "Pentagons{" +
                "length=" + length +
                '}'+super.toString();
    }
}
