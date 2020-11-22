package ampl;

import api.Element;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Element> shapes =new ArrayList<>();
        shapes.add(new Rectongle(20,40));
        shapes.add(new Circle(15));
        shapes.add(new Rectongle(40,60));


        for (Element e : shapes){
            System.out.println(e.accepteVisitor(new ConcretVisitor()));
        }
    }

}
//attention il faut que le type de return de acceptVisitor() et de visitor doivent être de même type.