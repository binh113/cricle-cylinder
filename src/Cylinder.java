public class Cylinder extends Circle {
    private int height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolumeCylinder() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString() + "volume" + getVolumeCylinder();
    }
}
