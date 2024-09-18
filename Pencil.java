public class Pencil {

    int hardness; // The hardness of the graphite



    String color; // The color of the paint

    // No-argument constructor
    public Pencil() {
        this.hardness = 2;
        this.color = "yellow";
    }

    public Pencil(int initHardness, String initColor) {
        this.hardness = initHardness;
        this.color = initColor;
    }

    // The equals method, which compares this instance of Pencil to another.
    // Two pencils are considered equal only if both their hardnesses and colors match.
    public boolean equals(Pencil otherPencil) {
        if (this.hardness == otherPencil.getHardness() && this.color.equals(otherPencil.getColor())) {
            return true;
        } else {
            return false;
        }
    }

    public int getHardness() {
        return this.hardness;
    }

    public void setHardness(int newHardness) {
        this.hardness = newHardness;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String initColor) {
        this.color = initColor;
    }

}
