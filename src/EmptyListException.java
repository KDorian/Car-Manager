
public class EmptyListException extends Exception {

    public EmptyListException(){

        super("List");
    }

    public EmptyListException(String name){
        super(name + " is empty");
    }
}
