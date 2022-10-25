package A8javahomeworkweek8;

public class A16PointProgramme16_Done {
    private int x;
    private int y;

    public A16PointProgramme16_Done() {
    }

    public A16PointProgramme16_Done(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }
    public double distance(int x, int y) {

        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(A16PointProgramme16_Done secondPoint) {

        return distance(secondPoint.x, secondPoint.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    public static void main(String[] args) {

        A16PointProgramme16_Done first = new A16PointProgramme16_Done(6, 5);

        A16PointProgramme16_Done second = new A16PointProgramme16_Done(3,1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        A16PointProgramme16_Done point = new A16PointProgramme16_Done();

        System.out.println("distance()= " + point.distance());


    }
}

