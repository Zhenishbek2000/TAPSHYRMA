public abstract class Shape {
    private String nameShape;

    public Shape(String nameShape) {
        this.nameShape = nameShape;
    }

    public String getNameShape() {
        return nameShape;
    }

    public void setNameShape(String nameShape) {
        this.nameShape = nameShape;
    }

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "nameShape='" + nameShape + '\'' +
                '}';
    }
}
