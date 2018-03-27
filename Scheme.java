import java.util.*;
import java.io.*;

class Scheme {
  List<Attribute> attrList;
  Scheme() {
    this.attrList = new ArrayList();
  }
  void loadSchemeFile(String fileName) {
    try {
      Scanner sc = new Scanner(new File(fileName));
      int numPara = sc.nextInt();
      /*Read the fist n-1 attrubutes */
      sc.nextLine();
      //System.out.println(numPara);
      for(int i = 0; i<numPara; i++) {
        sc.nextLine();
        String name = sc.nextLine();
        int numVals = sc.nextInt();
        sc.nextLine();
        String valsLine = sc.nextLine();
        List<String> tempAttrList = new ArrayList();
        String[] attrArr =  valsLine.split(" ");
        for(String a : attrArr) {
          tempAttrList.add(a);
        }
        Attribute at = new Attribute(name, tempAttrList,i);
        this.attrList.add(at);
      }
    }catch(FileNotFoundException e){
      System.out.println("Please enter a scheme file " + e);
    }
  }
  Attribute getFunctionAttribute(){
    return this.attrList.get(attrList.size() - 1);
  }

}
