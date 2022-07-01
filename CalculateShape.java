import java.util.Scanner;

// interface Shape {
//     public abstract void show();
// }
//
// class Square implements Shape {
//     public double length;
//     Square (double l) {
//         length = l;
//     }
//     public void show () {
//         double area;
//         area = Math.round(length *length * 100) / 100.0;
//         double perimeter;
//         perimeter = Math.round(4 * length * 100) / 100.0;
//         System.out.println(perimeter + " " + area);
//     }
// }

abstract class Shape {
    protected double area;
    double perimeter;
    public abstract void show();
}

class Square extends Shape {
    public double length;
    Square (double l) {
        length = l;
    }
    public void show () {
        area = Math.round(length * length * 100) / 100.0;
        perimeter = Math.round(4 * length * 100) / 100.0;
        System.out.printf("%.2f %.2f\n", perimeter, area);
    }
}

class Tri extends Shape {
    public double edge1, edge2, edge3;
    public Tri (double e1, double e2, double e3) {
        edge1 = e1;  edge2 = e2;  edge3 = e3;
    }
    public void show () {
        double s = (edge1 + edge2 + edge3) / 2;
        area = Math.round((Math.sqrt(s * (s-edge1) * (s-edge2) * (s-edge3))) * 100) / 100.0;
        perimeter = Math.round((edge1 + edge2 + edge3) * 100) / 100.0;
        System.out.printf("%.2f %.2f\n", perimeter, area);
    }
}

class Rect extends Shape {
    public double length, width;
    Rect (double l, double w) {
        length = l;
        width = w;
    }
    public void show () {
        area = Math.round(length * width * 100) / 100.0;
        perimeter = Math.round(2 * (length+width) * 100) / 100.0;
        System.out.printf("%.2f %.2f\n", perimeter, area);
    }
}

class Circle extends Shape {
    public double radius;
    Circle (double r) {
        radius = r;
    }
    public void show () {
        final double PI = 3.14;
        area = Math.round((radius * radius * PI) * 100) / 100.0;
        perimeter = Math.round((2 * radius * PI) * 100) / 100.0;
        System.out.printf("%.2f %.2f\n", perimeter, area);
    }
}

public class CalculateShape {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n;
        double t_area = 0.0, t_perimeter = 0.0;
        String type = new String();
        n = in.nextInt();
        for (i=0; i<n; i++) {
            type = in.next();
            if (type.equals("S")) {
                double l;
                l = in.nextDouble();
                Square s = new Square(l);
                s.show();
                t_area += s.area;
                t_perimeter += s.perimeter;
            }
            else if (type.equals("R")) {
                double l, w;
                l = in.nextDouble();
                w = in.nextDouble();
                Rect r = new Rect(l, w);
                r.show();
                t_area += r.area;
                t_perimeter += r.perimeter;
            }
            else if (type.equals("C")) {
                double r;
                r = in.nextDouble();
                Circle c = new Circle(r);
                c.show();
                t_area += c.area;
                t_perimeter += c.perimeter;
            }
            else if (type.equals("T")) {
                double e1, e2, e3;
                e1 = in.nextDouble();
                e2 = in.nextDouble();
                e3 = in.nextDouble();
                Tri t = new Tri(e1, e2, e3);
                t.show();
                t_area += t.area;
                t_perimeter += t.perimeter;
            }
        }
        System.out.printf("%.2f %.2f", t_perimeter, t_area);
        in.close();
    }
}
