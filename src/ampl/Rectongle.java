package ampl;

import api.Element;
import api.Visitor;

public  class Rectongle implements Element {
    private int width;
    private int height;

    public Rectongle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String accepteVisitor(ConcretVisitor v) {
        return v.visiteRectongle(this);

    }

    @Override
    public String toString() {
        return "Rectongle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
