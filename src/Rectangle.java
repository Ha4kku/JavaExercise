public class Rectangle {
    private double length;
    private double width;
    private double Area;
    private double Diagonal;
    private boolean isSquare;




    //constructor


    public Rectangle(double length, double width, double area, double diagonal, boolean isSquare) {
        this.length = length;
        this.width = width;
        Area = area;
        Diagonal = diagonal;
        this.isSquare = isSquare;
    }

    // getters and setters


    public boolean isSquare() {
        return isSquare;
    }

    public void setSquare(boolean square) {
        isSquare = square;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getDiagonal() {
        return Diagonal;
    }

    public void setDiagonal(double diagonal) {
        Diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", Area=" + Area +
                ", Diagonal=" + Diagonal +
                ", isSquare=" + isSquare +
                '}';
    }

    //runner

}
