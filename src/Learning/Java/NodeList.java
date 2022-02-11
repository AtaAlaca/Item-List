package Learning.Java;

public interface NodeList {
/*Before creating a linkedList it would be a good
idea to have a general interface where all node using structures can implement it.*/
    ListItem getRoot() ;
    boolean addItem(ListItem item) ;
    boolean removeItem(ListItem item) ;
    void traverse(ListItem root) ;


}
