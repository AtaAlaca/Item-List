package Learning.Java;

public class MyLinkedList implements NodeList {

//My interpretation of a linkedList not java's .

    //Fields.
    private ListItem root ;

    //Constructor.
    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root ;
    }


    @Override
    public boolean addItem(ListItem newItem) {
        //Check the list item first and add it as the head element if its empty.
        if (this.root == null){
            this.root = newItem ; //The list was empty, so this.item becomes the new root/head of the list.
            return true ;
        }
        ListItem currentItem = this.root ;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem)) ;
            if (comparison < 0){//New item is greater move right if possible.
                if (currentItem.next() != null){
                    currentItem = currentItem.next() ;
                    }else {//There is no next insert at the end of the list.
                        currentItem.setNext(newItem).setPrevious((currentItem)) ;
                        return true ;
                        }
                }else if (comparison > 0){//newItem is less, insert before currentItem.
                    if (currentItem.previous() != null) {
                        currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                        newItem.setNext(currentItem).setPrevious(newItem);
                        }else {
                            newItem.setNext(this.root).setPrevious(newItem) ;
                            this.root = newItem ;
                            }
                        return true ;
                    }else {//equal no need to add.
                        System.out.println(newItem.getValue() + " is already present, not added.");
                        return false ;
                        }
        }
    return false ;
    }


    @Override
    public boolean removeItem(ListItem item) {
        if (item != null){
            System.out.println("Deleting item " + item.getValue());
            }

        ListItem currentItem = this.root ;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item) ;
            if (comparison == 0) {//Item to be deleted found.
                    if (currentItem == this.root){
                        this.root = currentItem.next() ;
                    }else {
                        currentItem.previous().setNext(currentItem.next());
                        if (currentItem.next() != null){
                            currentItem.next().setPrevious(currentItem.previous());
                            }
                        }
                    return true;
                }else if (comparison < 0){//Haven't found the the item to be deleted yet.
                    currentItem = currentItem.next() ;
                    }else {//comparison > 0. We're at an item greater than the item to be deleted.
                        //So item is not in the list. We can't do anything else.
                        return false ;
                        }
            }
        //We have reached the end of the list.
        //without finding item to be deleted.
    return false ;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null){
            System.out.println("The list is empty.");
            }else{
                while (root != null){
                    System.out.println(root.getValue());
                    root = root.next() ;
                    }
                }
    }










}
