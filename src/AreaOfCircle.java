public class AreaOfCircle {
    public double areaOfCircle(double radius){
        double response = 0;
        response = 3.14 * radius * radius;
        return response;
    }

    public static void main(String[] args) {
        //need an object
        // to call or invoke the method
        AreaOfCircle object = new AreaOfCircle();
        double radius = 5;
        double area = object.areaOfCircle(radius);
        System.out.println("area = " + area);

    }
}
