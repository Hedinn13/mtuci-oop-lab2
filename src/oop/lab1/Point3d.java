package oop.lab1;

public class Point3d {

    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d (double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public double getZ() {
        return zCoord;
    }

    private void setX(double val) {
        xCoord = val;
    }

    private void setY(double val) {
        yCoord = val;
    }

    private void setZ(double val) {
        zCoord = val;
    }

    // проверка на совпадение точек
    public boolean equals(Object obj) {

        // проверяем, а точно ли в объект передана точка
        if (obj instanceof Point3d) {

            Point3d point3d = (Point3d) obj;
            if (this.xCoord == point3d.xCoord && this.yCoord == point3d.yCoord && this.zCoord == point3d.zCoord) {
                return true;
            }
        }

        return false;
    }

    // вычисление длинны отрезка
    public double distanceTo(Point3d point3d) {
        return Math.sqrt(Math.pow(point3d.xCoord - this.xCoord, 2)
                + Math.pow(point3d.yCoord - this.yCoord, 2)
                + Math.pow(point3d.zCoord - this.zCoord, 2));
    }
}
