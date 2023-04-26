package less1.polymorph;

public class Circle implements Shape{

    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public void findSquare() {
        System.out.println("Вычисляем площадь круга по формуле Pi * радиус в квадрате. Она равна: "+(Math.sqrt(radius) * Math.PI));
    }
}
