package Aula_4.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);

        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        ArrayList<Circle> circles = new ArrayList<Circle>();
        ArrayList<Triangle> triangles = new ArrayList<Triangle>();

        do {
            System.out.println("Options:");
            System.out.println("1 - Add Rectangle");
            System.out.println("2 - Add Circle");
            System.out.println("3 - Add Triangle");
            System.out.println("4 - Show Current Rectangle");
            System.out.println("5 - Show Current Circle");
            System.out.println("6 - Show Current Triangle");
            System.out.println("7 - Change Circle Radius");
            System.out.println("8 - Change Rectangle Width and Height");
            System.out.println("9 - Change Triangle Sides");
            System.out.println("10 - Show Circle Area");
            System.out.println("11 - Show Rectangle Area");
            System.out.println("12 - Show Triangle Area");
            System.out.println("13 - Show Circle Perimeter");
            System.out.println("14 - Show Rectangle Perimeter");
            System.out.println("15 - Show Triangle Perimeter");
            System.out.println("16 - Compare All Circles");
            System.out.println("17 - Compare All Rectangles");
            System.out.println("18 - Compare All Triangles");
            System.out.println("0 - Exit");

            option = sc.nextInt();
            if (option < 0 || option > 18) {
                System.out.println("Invalid option.");
                continue;
            } else {
                switch (option) {
                    case 1:
                        System.out.println("Enter the width of the rectangle:");
                        double width = sc.nextDouble();
                        System.out.println("Enter the height of the rectangle:");
                        double height = sc.nextDouble();
                        rectangles.add(new Rectangle(width, height));
                        break;

                    case 2:
                        System.out.println("Enter the radius of the circle:");
                        double radius = sc.nextDouble();
                        circles.add(new Circle(radius));
                        break;

                    case 3:
                        System.out.println("Enter the first side of the triangle:");
                        double side1 = sc.nextDouble();
                        System.out.println("Enter the second side of the triangle:");
                        double side2 = sc.nextDouble();
                        System.out.println("Enter the third side of the triangle:");
                        double side3 = sc.nextDouble();
                        triangles.add(new Triangle(side1, side2, side3));
                        break;

                    case 4:
                        System.out.println("Enter the index of the rectangle you want to see:");
                        int index = sc.nextInt();
                        System.out.println(rectangles.get(index));
                        break;

                    case 5:
                        System.out.println("Enter the index of the circle you want to see:");
                        index = sc.nextInt();
                        System.out.println(circles.get(index));
                        break;

                    case 6:
                        System.out.println("Enter the index of the triangle you want to see:");
                        index = sc.nextInt();
                        System.out.println(triangles.get(index));
                        break;

                    case 7:
                        System.out.println("Enter the index of the circle you want to change:");
                        index = sc.nextInt();
                        System.out.println("Enter the new radius:");
                        radius = sc.nextDouble();
                        circles.get(index).setRadius(radius);
                        break;

                    case 8:
                        System.out.println("Enter the index of the rectangle you want to change:");
                        index = sc.nextInt();
                        System.out.println("Enter the new width:");
                        width = sc.nextDouble();
                        System.out.println("Enter the new height:");
                        height = sc.nextDouble();
                        rectangles.get(index).setWidth(width);
                        rectangles.get(index).setHeight(height);
                        break;

                    case 9:
                        System.out.println("Enter the index of the triangle you want to change:");
                        index = sc.nextInt();
                        System.out.println("Enter the new first side:");
                        side1 = sc.nextDouble();
                        System.out.println("Enter the new second side:");
                        side2 = sc.nextDouble();
                        System.out.println("Enter the new third side:");
                        side3 = sc.nextDouble();
                        triangles.get(index).setSide1(side1);
                        triangles.get(index).setSide2(side2);
                        triangles.get(index).setSide3(side3);
                        break;

                    case 10:
                        System.out.println("Enter the index of the circle you want to see the area:");
                        index = sc.nextInt();
                        System.out.println(circles.get(index).getArea());
                        break;

                    case 11:
                        System.out.println("Enter the index of the rectangle you want to see the area:");
                        index = sc.nextInt();
                        System.out.println(rectangles.get(index).getArea());
                        break;

                    case 12:
                        System.out.println("Enter the index of the triangle you want to see the area:");
                        index = sc.nextInt();
                        System.out.println(triangles.get(index).getArea());
                        break;

                    case 13:
                        System.out.println("Enter the index of the circle you want to see the perimeter:");
                        index = sc.nextInt();
                        System.out.println(circles.get(index).getPerimeter());
                        break;

                    case 14:
                        System.out.println("Enter the index of the rectangle you want to see the perimeter:");
                        index = sc.nextInt();
                        System.out.println(rectangles.get(index).getPerimeter());
                        break;

                    case 15:
                        System.out.println("Enter the index of the triangle you want to see the perimeter:");
                        index = sc.nextInt();
                        System.out.println(triangles.get(index).getPerimeter());
                        break;

                    case 16:
                        System.out.println("Enter the index of the first circle you want to compare:");
                        int index1 = sc.nextInt();
                        System.out.println("Enter the index of the second circle you want to compare:");
                        int index2 = sc.nextInt();
                        System.out.println(circles.get(index1).equals(circles.get(index2)));
                        break;

                    case 17:
                        System.out.println("Enter the index of the first rectangle you want to compare:");
                        index1 = sc.nextInt();
                        System.out.println("Enter the index of the second rectangle you want to compare:");
                        index2 = sc.nextInt();
                        System.out.println(rectangles.get(index1).equals(rectangles.get(index2)));
                        break;

                    case 18:
                        System.out.println("Enter the index of the first triangle you want to compare:");
                        index1 = sc.nextInt();
                        System.out.println("Enter the index of the second triangle you want to compare:");
                        index2 = sc.nextInt();
                        System.out.println(triangles.get(index1).equals(triangles.get(index2)));
                        break;

                    case 0:
                        System.out.println("Exiting...");
                        break;
                }
            }
        } while (option != 0);
        sc.close();
    }
}
