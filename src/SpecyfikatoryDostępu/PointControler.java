package SpecyfikatoryDostępu;

public class PointControler {

    public void addX(Point point){
        int currentX = point.getX();
        point.setX(currentX +1);
    }

    public void minusX(Point point){
        int currentX = point.getX();
        point.setX(currentX - 1);
    }

    public void addY(Point point){
        int currentY = point.getY();
        point.setY(currentY + 1);
    }

    public void minusY(Point point){
        int currentY = point.getY();
        point.setY(currentY - 1);
    }
}
