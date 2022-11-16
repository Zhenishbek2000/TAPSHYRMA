public class Main {
    public static void main(String[] args) {
        Shape squere=new Square("Kvadrat",7);
        System.out.println(squere);
        System.out.println(squere.getPerimeter());
        Shape traingle=new Triangle("Triangle",7);
        System.out.println(traingle);
        System.out.println(traingle.getPerimeter());
        Shape rectangle=new Rectangle("Rectengle",5,7);
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());
        Shape pentangle=new Pentagons("Pentagons",6);
        System.out.println(pentangle);
        System.out.println(pentangle.getPerimeter());
        Shape romik=new Romik("Romik",8);
        System.out.println(romik);
        System.out.println(romik.getPerimeter());

    }
}