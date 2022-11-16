public class Triangle extends Shape{
    private int trianlge;
    public Triangle(String nameShape,int trianlge) {
        super(nameShape);
        this.trianlge=trianlge;
    }

    public int getTrianlge() {
        return trianlge;
    }

    public void setTrianlge(int trianlge) {
        this.trianlge = trianlge;
    }

    @Override
    public double getPerimeter() {
        return trianlge+trianlge+trianlge;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "trianlge=" + trianlge +
                '}'+super.toString();
    }
}
