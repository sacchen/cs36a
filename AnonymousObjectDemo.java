// Class notes for Tues Sep 17, 2024
// CIS 36A

// Reference reading: pg. 298 (The new Operator and Anonymous Objects)

// This demonstrates anonymous objects. "Anonymous object" is just a term we use
// for an object that is never assigned to a variable!
public class AnonymousObjectDemo {

    public static void main(String[] args) {
        Pencil blue3 = new Pencil(3, "blue");
        Pencil yellow2 = new Pencil(2, "yellow");

        System.out.println("Let's test our equals method with anonymous objects:");

        System.out.print("Is blue3 equal to a pencil with hardness 2 and color blue? ");
        System.out.println(blue3.equals(new Pencil(2, "blue")));

        System.out.print("Is blue3 equal to a pencil with hardness 3 and color blue? ");
        System.out.println(blue3.equals(new Pencil(3, "blue")));

        System.out.print("Is blue3 equal to yellow2? ");
        System.out.println(blue3.equals(yellow2));

        System.out.print("Is yellow2 equal to a pencil with hardness 50 and color green? ");
        System.out.println(blue3.equals(new Pencil(50, "green")));

        System.out.print("What's the hardness of a pencil created with the no-argument constructor? ");
        System.out.println(new Pencil().getHardness());

        System.out.print("What's the color of a pencil created with the no-argument constructor? ");
        System.out.println(new Pencil().getColor());

    }


}
