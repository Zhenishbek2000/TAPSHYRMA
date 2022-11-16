public class Romik extends  Shape{
    private double romik;

    public Romik(String nameShape, double romik) {

        super(nameShape);
        this.romik = romik;
    }
    public double getRomik() {

        return romik;
    }

    public void setRomik(double romik) {
        this.romik = romik;
    }


    @Override
    public double getPerimeter() {
        return romik*4;
    }

    @Override
    public String toString() {
        return "Romik{" +
                "romik=" + romik +
                '}'+super.toString();
    }
}
