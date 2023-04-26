package less1.polymorph;

public class SquareRectangle implements Shape{

    private int side;

    public SquareRectangle(int side){
        this.side=side;
    }

    @Override
    public void findSquare() {
        System.out.println("Вычисляем площадь квадрата по формуле квадрат стороны. Она равна: "+Math.sqrt(side));
    }
}
