import java.util.Scanner;

class animal
{
    String name;
    double height;
    int weight;
    int speed;
    double x;
    double y;
    int z;

    Scanner sc = new Scanner(System.in);

    double distance()
    {
        System.out.println("enter time (minute) and acceleration = ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        x = x * this.speed * y ;
        System.out.println("distance = " + x + "\n");
        return x;
    }

    int distance2()
    {
        System.out.println("enter only time (minute) = ");
        z = sc.nextInt();
        z = z * this.speed;
        System.out.println("distance (only time) = " + z + "\n \n");
        return z;
    }
}

public class A1113339_0324_1 
{
    public static void main (String [] args)
    {
        animal an1, an2, an3, an4;
        an1 = new animal();
        an2 = new animal();
        an3 = new animal();
        an4 = new animal();

        an1.name = "olaf";
        an1.height = 1.1;
        an1.weight = 52;
        an1.speed = 100;
        System.out.println(an1.name + "\n" + "height " + an1.height + "\t" + "weight " + an1.weight + "\t" + "speed " + an1.speed);
        an1.distance();
        an1.distance2();

        an2.name = "donkey";
        an2.height = 1.5;
        an2.weight = 99;
        an2.speed = 200;
        System.out.println(an2.name + "\n" + "height " + an2.height + "\t" + "weight " + an2.weight + "\t" + "speed " + an2.speed);
        an2.distance();
        an2.distance2();

        an3.name = "anna";
        an3.height = 1.7;
        an3.weight = 48;
        an3.speed = 120;
        System.out.println(an3.name + "\n" + "height " + an3.height + "\t" + "weight " + an3.weight + "\t" + "speed " + an3.speed);
        an3.distance();
        an3.distance2();

        an4.name = "elsa";
        an4.height = 1.7;
        an4.weight = 50;
        an4.speed = 120;
        System.out.println(an4.name + "\n" + "height " + an4.height + "\t" + "weight " + an4.weight + "\t" + "speed " + an4.speed);
        an4.distance();
        an4.distance2();
    }
}
