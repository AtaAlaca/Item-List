package Learning.Java;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    //Methods of the abstract class.Override is needed to ensure node inherits from the abstract class.

    @Override
    ListItem next() {
        return this.rightLink ;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink ;
    }

    @Override
    ListItem previous() {
        return leftLink ;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item ;
        return this.leftLink ;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue()) ;
        }else {
            return -1 ;
            }
    }







}
