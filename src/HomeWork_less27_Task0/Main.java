package HomeWork_less27_Task0;

public class Main {
    public static void main(String[] args) {
        // Создаем массив объектов Shape
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);

        // Вычисляем общую площадь и периметр всех фигур в массиве
        double totalArea = 0;
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Общая площадь фигур: " + totalArea);
        System.out.println("Общий периметр фигур: " + totalPerimeter);
    }

}


