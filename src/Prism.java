public class Prism {
    // instance variables
    private int length;
    private int width;
    private int height;

    // constructors
    public Prism() {
        length = 0;
        width = 0;
        height = 0;
    }
    /*
    public Prism() {
        length = (int)(Math.random() * 91 + 10);
        width = (int)(Math.random() * 91 + 10);
        height = (int)(Math.random() * 91 + 10);
    }
     */
    public Prism(int l) {
        length = l;
        width = l;
        height = l;
    }
    public Prism(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    // public getter/setter methods
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setLength(int newL) {
        length = newL;
    }
    public void setWidth(int newW) {
        width = newW;
    }
    public void setHeight(int newH) {
        height = newH;
    }

    // public methods
    public int volume() {
        return length * width * height;
    }
    public int surfaceArea() {
        return 2 * (length * width) + 2 * (length * height) + 2 * (height * width);
    }
    public String dimensions() {
        return "Length = " + length + ", \nWidth = " + width + ", \nHeight = " + height;
    }
}
