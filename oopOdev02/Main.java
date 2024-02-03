package oopOdev02;

public class Main {

    public static void main(String[] args) {

        Circle circle= new Circle();
        Rectangle rectangle= new Rectangle();
        Triangle triangle= new Triangle();

        circle.setRadius(7);
        System.out.println("çember alanı: " + circle.calculateArea());

        System.out.println("");
        triangle.setBase(12);
        triangle.setHeight(11);
        System.out.println("üçgenin alanı: " + triangle.calculateArea());

        System.out.println("");
        rectangle.setHeight(8);
        rectangle.setWidth(9);
        System.out.println("dikdörtgenin dlanı: "+ rectangle.calculateArea());
    }

}
