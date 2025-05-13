package lang.object.equals;

import java.util.Objects;

public class Rectangle {
    private int widht;
    private int height;

    public Rectangle(int widht, int height) {
        this.widht = widht;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "widht=" + widht +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return widht == rectangle.widht && height == rectangle.height;
    }
}
