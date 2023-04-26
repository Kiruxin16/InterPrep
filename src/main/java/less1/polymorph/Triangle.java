package less1.polymorph;

public class Triangle implements Shape{

    private int foundation;
    private int height;

    public Triangle(int foundation, int height){
        this.foundation=foundation;
        this.height=height;
    }

    @Override
    public void findSquare() {
        System.out.println("Вычисляем площадь треугольника по формуле половина произведения основания на высоту. Она равна: "+(0.5f * foundation * height));
    }
}
