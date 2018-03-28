import java.util.*;
import java.io.*;

class Node {
  String attributeName;
  String label;
  String parentLabel;
  int majority;
  Node parent;

  Node(int m){
    this.majority = m;
  }
  Node(Attribute at){
    this.label = at.name;

  }
  Node(String l){
    this.label = l;
  }

}
