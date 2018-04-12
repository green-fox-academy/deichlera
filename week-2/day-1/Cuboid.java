public class Cuboid {
    public static void main(String[] args) {


        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        double side1=3.4;
        double side2=4.5;
        double side3=5.2;

        double surface=2*(side1*side2+side1*side3+side2*side3);
        System.out.println("Surface area: " + surface/1);

        double volume=side1*side2*side3;
        System.out.println("Volume: " + volume);



    }
}