package api;


import ampl.ConcretVisitor;

public interface Element  {
    String accepteVisitor(ConcretVisitor v);


}
