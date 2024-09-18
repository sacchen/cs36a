// Class notes for Tues Sep 17, 2024
// CIS 36A

// Related reading:

public class ReferenceDemo {

    // This is a method with a primitive int parameter. The argument i will be passed by
    // value, which means that an unrelated copy of i will be used in the method body!
    public static void multiplyIntByTwo(int i) {
        i = i * 2;
    }

    // This is a method with an object parameter. The argument p will be passed by value.
    // But remember: the value of p is a reference to an object in memory, so any changes
    // made to the object in this method will "stick"!
    public static void multiplyPencilHardnessByTwo(Pencil p) {
        p.setHardness(p.getHardness() * 2);
    }

    public static void main(String[] args) {
        // First, let's demonstrate that methods with arguments of a primitive type cannot change
        // the value of a variable outside the method.
        int willNotChange = 50;
        System.out.println("Before passing as argument to multiplyIntByTwo: " + willNotChange);
        multiplyIntByTwo(willNotChange);
        System.out.println("After passing as argument to multiplyIntByTwo: " + willNotChange);

        // Now, let's demonstrate that methods which have arguments of an object type
        // can permanently change anything we want about the object that's passed in!
        System.out.println(); // Line break
        Pencil regularPencil = new Pencil(); // default hardness of 2
        System.out.println("Before passing as argument to multiplyPencilHardnessByTwo: " + regularPencil.getHardness());
        multiplyPencilHardnessByTwo(regularPencil);
        System.out.println("After passing as argument to multiplyPencilHardnessByTwo: " + regularPencil.getHardness());



    }





}
