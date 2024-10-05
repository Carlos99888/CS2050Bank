import java.io.Serializable;
import java.util.ArrayList;

public class AccountStack<T> implements Serializable
{
	private ArrayList<T> stackList;

    // Constructor to initialize the stack
    public AccountStack() 
    {
        stackList = new ArrayList<>();
    }

    // Push method to add an element to the top of the stack
    public void push(T newEntry)
    {
        stackList.add(newEntry);
    }

    // Pop method to remove and return the top element
    public T pop() throws Exception 
    {
        if (isEmpty()) 
        {
            throw new Exception("Stack is empty.");
        }
        return stackList.remove(stackList.size() - 1);
    }

    // Peek method to return the top element without removing it
    public T peek() throws Exception 
    {
        if (isEmpty()) 
        {
            throw new Exception("Stack is empty. Cannot peek.");
        }
        return stackList.get(stackList.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() 
    {
        return stackList.isEmpty();
    }

    // Return the size of the stack
    public int size() 
    {
        return stackList.size();
    }
    
}
