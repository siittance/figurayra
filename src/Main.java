import java.util.Scanner;

abstract class Shape {
    abstract double calculateS();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateS() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateS() {
        return sideLength * sideLength;
    }

    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}

class Triangle extends Shape {
    private double storonaA;
    private double storonaB;
    private double storonaC;

    public Triangle(double storonaA, double storonaB, double storonaC) {
        this.storonaA = storonaA;
        this.storonaB = storonaB;
        this.storonaC = storonaC;
    }

    public double calculateS() {
        double p = (storonaA + storonaB + storonaC) / 2;
        return Math.sqrt(p * (p - storonaA) * (p - storonaB) * (p - storonaC));
    }

    public double calculatePerimeter() {
        return storonaA + storonaB + storonaC;
    }
}
class Pentagon extends Shape {
    private double storonka;

    public Pentagon(double sideLength) {
        this.storonka = sideLength;
    }

    public double calculateS() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * storonka * storonka;
    }

    public double calculatePerimeter() {
        return 5 * storonka;
    }
}

class Trapezoid extends Shape {
    private double storona1;
    private double storona2;
    private double height;
    private double storonaB1;
    private double storonaB2;

    public Trapezoid(double storona1, double storona2, double height, double storonaB1, double storonaB2) {
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.height = height;
        this.storonaB1 = storonaB1;
        this.storonaB2 = storonaB2;
    }

    public double calculateS() {
        return 0.5 * (storona1 + storona2) * height;
    }

    public double calculatePerimeter() {
        return storona1 + storona2 + storonaB1 + storonaB2;
    }
}

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double calculateS() {
        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}

class Parallelogram extends Shape {
    private double base;
    private double height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateS() {
        return base * height;
    }

    public double calculatePerimeter() {
        return 2 * (base + height);
    }
}
class Parallelepiped extends Shape {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateS() {
        return 2 * (length * width + length * height + width * height);
    }

    public double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double calculateS() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateS() {
        return 4 * Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 0; // Сфера не имеет периметра
    }
}

class Rhombus extends Shape {
    private double storona;
    private double diagonal1;
    private double diagonal2;

    public Rhombus(double sideLength, double diagonal1, double diagonal2) {
        this.storona = storona;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double calculateS() {
        return 0.5 * diagonal1 * diagonal2;
    }

    public double calculatePerimeter() {
        return 4 * storona;
    }
}

class Cone extends Shape {
    private double radius;
    private double height;
    private double obraz;

    public Cone(double radius, double height, double slantHeight) {
        this.radius = radius;
        this.height = height;
        this.obraz = slantHeight;
    }

    public double calculateS() {
        return Math.PI * radius * (radius + obraz);
    }

    public double calculatePerimeter() {
        return 0;
    }
}


public class Main {
    public static void main(String[] args) {
        boolean konec = true;
        while(konec) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите фигуру для расчета площади и периметра:");
            System.out.println("1. Круг");
            System.out.println("2. Квадрат");
            System.out.println("3. Треугольник");
            System.out.println("4. Пятиугольник");
            System.out.println("5. Трапеция");
            System.out.println("6. Прямоугольник");
            System.out.println("7. Параллелограмм");
            System.out.println("8. Параллелепипед");
            System.out.println("9. Цилиндр");
            System.out.println("10. Сфера");
            System.out.println("11. Ромб");
            System.out.println("12. Конус");
            System.out.println("13. Выход");
            int vibor = scanner.nextInt();

            switch (vibor) {
                case 1:
                    System.out.print("Введите радиус круга: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Площадь круга: " + circle.calculateS());
                    System.out.println("Периметр круга: " + circle.calculatePerimeter());
                    break;
                case 2:
                    System.out.print("Введите длину стороны квадрата: ");
                    double sideLength = scanner.nextDouble();
                    Square square = new Square(sideLength);
                    System.out.println("Площадь квадрата: " + square.calculateS());
                    System.out.println("Периметр квадрата: " + square.calculatePerimeter());
                    break;
                case 3:
                    System.out.print("Введите длины сторон треугольника (через пробел): ");
                    double storonaA = scanner.nextDouble();
                    double storonaB = scanner.nextDouble();
                    double storonaC = scanner.nextDouble();
                    Triangle triangle = new Triangle(storonaA, storonaB, storonaC);
                    System.out.println("Площадь треугольника: " + triangle.calculateS());
                    System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
                    break;
                case 4:
                    System.out.print("Введите длину стороны пятиугольника: ");
                    double storonka = scanner.nextDouble();
                    Pentagon pentagon = new Pentagon(storonka);
                    System.out.println("Площадь пятиугольника: " + pentagon.calculateS());
                    System.out.println("Периметр пятиугольника: " + pentagon.calculatePerimeter());
                    break;
                case 5:
                    System.out.print("Введите длины оснований, высоту и боковые стороны трапеции (через пробел): ");
                    double storona1 = scanner.nextDouble();
                    double storona2 = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    double storonaB1 = scanner.nextDouble();
                    double storonaB2 = scanner.nextDouble();
                    Trapezoid trapezoid = new Trapezoid(storona1, storona2, height, storonaB1, storonaB2);
                    System.out.println("Площадь трапеции: " + trapezoid.calculateS());
                    System.out.println("Периметр трапеции: " + trapezoid.calculatePerimeter());
                    break;
                case 6:
                    System.out.print("Введите длину и ширину прямоугольника (через пробел): ");
                    double width = scanner.nextDouble();
                    double length = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(width, length);
                    System.out.println("Площадь прямоугольника: " + rectangle.calculateS());
                    System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
                    break;
                case 7:
                    System.out.print("Введите длину основания и высоту параллелограмма (через пробел): ");
                    double base = scanner.nextDouble();
                    double height1 = scanner.nextDouble();
                    Parallelogram parallelogram = new Parallelogram(base, height1);
                    System.out.println("Площадь параллелограмма: " + parallelogram.calculateS());
                    System.out.println("Периметр параллелограмма: " + parallelogram.calculatePerimeter());
                    break;
                case 8:
                    System.out.print("Введите длину, ширину и высоту параллелепипеда (через пробел): ");
                    double length1 = scanner.nextDouble();
                    double width2 = scanner.nextDouble();
                    double height3 = scanner.nextDouble();
                    Parallelepiped parallelepiped = new Parallelepiped(length1, width2, height3);
                    System.out.println("Площадь параллелепипеда: " + parallelepiped.calculateS());
                    System.out.println("Периметр параллелепипеда: " + parallelepiped.calculatePerimeter());
                    break;
                case 9:
                    System.out.print("Введите радиус цилиндра и его высоту (через пробел): ");
                    double radius1 = scanner.nextDouble();
                    double cylinderHeight = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(radius1, cylinderHeight);
                    System.out.println("Площадь цилиндра: " + cylinder.calculateS());
                    System.out.println("Периметр цилиндра: " + cylinder.calculatePerimeter());
                    break;
                case 10:
                    System.out.print("Введите радиус сферы: ");
                    double sphereRadius = scanner.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    System.out.println("Площадь сферы: " + sphere.calculateS());
                    System.out.println("Периметр cферы: " + sphere.calculatePerimeter());
                    break;
                case 11:
                    System.out.print("Введите длину стороны, диагональ 1 и диагональ 2 ромба (через пробел): ");
                    double storona = scanner.nextDouble();
                    double diag1 = scanner.nextDouble();
                    double diag2 = scanner.nextDouble();
                    Rhombus rhombus = new Rhombus(storona, diag1, diag2);
                    System.out.println("Площадь ромба: " + rhombus.calculateS());
                    System.out.println("Периметр ромба: " + rhombus.calculatePerimeter());
                    break;
                case 12:
                    System.out.print("Введите радиус основания, высоту и образующую конуса (через пробел): ");
                    double coneRadius = scanner.nextDouble();
                    double coneHeight = scanner.nextDouble();
                    double coneobraz = scanner.nextDouble();
                    Cone cone = new Cone(coneRadius, coneHeight, coneobraz);
                    System.out.println("Площадь конуса: " + cone.calculateS());
                    System.out.print("Периметр конуса: " + cone.calculatePerimeter() + "\n");
                    break;
                case 13:
                    konec = false;
            }
        }
    }
}
