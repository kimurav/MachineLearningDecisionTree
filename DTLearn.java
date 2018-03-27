import java.util.*;
import java.io.*;


class DTLearn {
  void learnDecisionTree(Sample s, List<Attribute> atList, Attribute function){
    atList.remove(atList.size() - 1);
    Attribute tempAt = s.getAttribute(atList, s);
    System.out.println(tempAt.name);
  }
  public static void main(String[] args){
    DTLearn dtlearn = new DTLearn();
    Scheme scheme = new Scheme();
    Sample sample = new Sample();
    scheme.loadSchemeFile(args[0]);
    sample.loadExamples(args[1], scheme);
    Util util = new Util();
    //util.printAttrList(scheme);
    //util.printSample(sample);
    dtlearn.learnDecisionTree(sample, scheme.attrList, scheme.getFunctionAttribute());
  }

}
