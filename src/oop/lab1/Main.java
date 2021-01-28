package oop.lab1;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Point3d A = null, B = null, C = null;

        System.out.print("Выбирете способ ввода (1 - Автоматический, 2 - Ручной): ");
        int option = in.nextInt();
        switch (option) {
            case 1 -> {
                A = new Point3d(RC(), RC(), RC());
                System.out.println("Точка A: x = " + A.getX() + ", x = " + A.getY() + ", z = " + A.getZ());
                B = new Point3d(RC(), RC(), RC());
                System.out.println("Точка B: x = " + B.getX() + ", x = " + B.getY() + ", z = " + B.getZ());
                C = new Point3d(RC(), RC(), RC());
                System.out.println("Точка C: x = " + C.getX() + ", x = " + C.getY() + ", z = " + C.getZ());
            }
            case 2 -> {
                System.out.println("*все координаты вводятся в дестичном виде");
                System.out.println("Введите координаты точки А:");
                System.out.print("Координата X: ");
                double ax = in.nextDouble();
                System.out.print("Координата Y: ");
                double ay = in.nextDouble();
                System.out.print("Координата Z: ");
                double az = in.nextDouble();
                A = new Point3d(ax, ay, az);
                System.out.println("Получены координаты точки А");
                System.out.println("Введите координаты точки B:");
                System.out.print("Координата X: ");
                double bx = in.nextDouble();
                System.out.print("Координата Y: ");
                double by = in.nextDouble();
                System.out.print("Координата Z: ");
                double bz = in.nextDouble();
                B = new Point3d(bx, by, bz);
                System.out.println("Получены координаты точки B");
                System.out.println("Введите координаты точки C:");
                System.out.print("Координата X: ");
                double cx = in.nextDouble();
                System.out.print("Координата Y: ");
                double cy = in.nextDouble();
                System.out.print("Координата Z: ");
                double cz = in.nextDouble();
                C = new Point3d(cx, cy, cz);
                System.out.println("Получены координаты точки C");
            }
        }

        if (A.equals(B) || A.equals(C) || B.equals(C)) {
            System.out.println("Некоторые точки совпадают, расчет не возможен");
            System.exit(-1);
        }
        else {
            System.out.printf("Площадь треугольника равна: %.2f", computeArea(A, B, C));
        }
    }

    public static double computeArea(Point3d A, Point3d B, Point3d C) {

        double line_ab = A.distanceTo(B);
        double line_ac = A.distanceTo(C);
        double line_bc = B.distanceTo(C);

        double p = (line_ab + line_ac + line_bc) / 2;
        return Math.sqrt(p * (p - line_ab) * (p - line_ac) * (p - line_bc));
    }
    public static double RC() {
        double min = -100;
        double max = 100;

        return (Math.random() * (max - min)) + min;
    }
}
