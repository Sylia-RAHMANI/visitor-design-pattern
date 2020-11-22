package ampl;

import api.Element;
import api.Visitor;

public class ConcretVisitor implements Visitor {
    @Override
    public String visiteCircle(Element e) {
        return e.toString();
    }

    @Override
    public String visiteRectongle(Element e) {
        return e.toString();
    }
}
