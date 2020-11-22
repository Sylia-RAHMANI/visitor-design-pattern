package ampl;

import api.Element;
import api.Visitor;

public class Circle implements Element {
    private int raduis;

    public int getRaduis() {
        return raduis;
    }

    public Circle(int raduis) {
        this.raduis = raduis;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "raduis=" + raduis +
                '}';
    }

    @Override
    public  String accepteVisitor(ConcretVisitor v) {
        return v.visiteCircle(this);

    }
}
