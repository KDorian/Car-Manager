
public class List<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private String name;

    public List(){

        name = "List";
        firstNode = lastNode = null;
    }

    public List(String ListName){

        name = ListName;
        firstNode = lastNode = null;
    }

    public boolean isEmpty() {

        return firstNode == null;
    }

    public void insertAtFront(T insertItem){

        if(isEmpty()){

            firstNode  = lastNode = new Node<T> (insertItem);
        } else {

            firstNode = lastNode = new Node<T> (insertItem, firstNode);
        }
    }

    public void insertAtBack(T insertItem){

        if(isEmpty()){

            firstNode = lastNode = new Node<T>(insertItem);
        } else {

            lastNode.nextNode = new Node<T>(insertItem);
            lastNode = lastNode.nextNode;
        }
    }

    public String print(){

        String str = null;

        if(isEmpty()){

            str = "Empty " + name;
        } else {

            str = "The " + name + " is : \n\n";
        }

        Node <T> current = firstNode;

        while(current != null){

            str = str + current.getData() + "\n";
            current = current.getNext();
        }

        str = str + "\n";
        str = str + "End of " + name + "\n";

        return str;
    }

    public void removeAll(){

        firstNode = lastNode = null;
    }

    public T removeFromFront() throws EmptyListException {

        if(isEmpty()){
            throw new EmptyListException(name);
        }

        T removedItem = firstNode.getData();

        if(firstNode == lastNode){

            firstNode = lastNode = null;
        } else {

            firstNode = firstNode.getNext();
        }

        return removedItem;
    }

    public T removeFromBack() throws EmptyListException{

        if(isEmpty()){
            throw new EmptyListException(name);
        }

        T removedItem = lastNode.getData();

        if(firstNode == lastNode){

            firstNode = lastNode = null;
        } else {

            Node <T> current = firstNode;
            while(current.getNext() != lastNode){

                current = current.getNext();
            }

            lastNode = current;
            current.setNext(null);
        }

        return removedItem;
    }

    public String searchBrand(String brand){

        String str = null;
        if(isEmpty()){

            str = "Empty " + name;
            return str;
        }

        str = "The " + name + " is:\n\n";

        Node<T> current = firstNode;

        String word;

        while(current != null){

            word = current.getData().toString();
            String line1 = word.substring(0, word.indexOf("\n"));
            line1 = line1.substring(line1.lastIndexOf(":")+1);

            if(line1.equals(brand)){

                str = str + current.getData() + "\n";
            }

            current = current.getNext();
        }

        str = str + "\n";
        str = str + "End " + name + "\n";
        return str;
    }

    public String numOfCars(){

        int num = 0;
        String str = null;

        if(isEmpty()){

            str = "Empty " + name;
            return str;
        }

        str = "The length of " + name + " is: \n\n";

        Node<T> current = firstNode;

        while(current != null){

            num++;
            current = current.getNext();
        }

        str = str + num;
        return str;
    }

    public String printNode(int number){

        int num = 1;
        String str = null;

        if(isEmpty()){

            str = "Empty " + name;
            return str;
        }

        str = "The Node is " + ":\n\n";

        Node<T> current = firstNode;

        while(current !=  null){

            if(num==number){

                str = str + current.getData() + "\n";
            }

            num++;
            current = current.getNext();
        }

        return str;
    }

    public boolean deleteNode(int number){

        int num = 1;
        String str = null;

        if(isEmpty()){

            return false;
        }

        Node<T> current = firstNode;

        Node <T> prev = firstNode;

        if(number == 1){

            firstNode = current.nextNode;

            return true;
        }

        while(current != null){

            if(num == number){

                prev.nextNode = current.nextNode;
                return true;
            }

            num++;
            prev = current;
            current = current.getNext();
        }

        return true;
    }

}

