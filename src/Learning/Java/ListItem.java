package Learning.Java;

public abstract class ListItem {
//Basically creating a DIY linkedList.
    //Fields.
    protected ListItem rightLink = null ;
    protected ListItem leftLink = null ;
    protected Object value ;

    //Constructor.
    public ListItem(Object value) {
        this.value = value;
    }

    //Methods.
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    //Getter and Setter.
    public  Object getValue() {
        return value ;
    }
    public void setValue(Object value) {
        this.value = value ;
    }



}
