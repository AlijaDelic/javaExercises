package abstractClaseesAnd;

public class Square extends Quad implements IGeom {

    public int area() {

        return a * a;
    }

	    @Override
    public int perimeter() {

       return 4 * this.a;
    }

	    @Override
    public void setxya(int x, int y, int a) {

        this.x = x;
        this.y = y;
        this.a = a;
    }
}
