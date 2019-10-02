public class AreaCalculator
{
    public static void main(String[] args) {
        System.out.println(area(-1,-1));
    }

    public static double area(double radius)
    {
        if(radius < 0)return -1.0;

        return radius*radius*Math.PI;
    }

    public static double area(double rectangleX,double rectangleY)
    {
        if(rectangleX < 0 || rectangleY < 0)
        {
            return -1.0;
        }

        return rectangleX*rectangleY;
    }

}
