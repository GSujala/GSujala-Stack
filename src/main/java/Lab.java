import java.util.Deque;
import java.util.ArrayDeque;

public class Lab {
    /**
     * Implement and return some class that implements Deque, such as ArrayDeque, which contains all the functionality
     * of a Stack. This challenge will not be using the Stack class, because the Stack class is known to have a shoddy
     * implementation as it hasn't been changed since the very earliest version of Java. Deques were made to exhibit
     * the exact same behavior and are generally better.
     *
     * @return a newly instantiated Deque. Deques implement both stack and queue behavior.
     */
    public Deque<String> createNewStack() {
        return new ArrayDeque<>();
    }

    /**
     * @param stack A Deque of Strings.
     * @return the number of elements in the deque.
     */
    public int getSize(Deque<String> stack) {
        return stack.size();
    }

    /**
     * Push a value to the top of the deque.
     * (this adds the value to the Stack.)
     *
     * @param stack A Deque of Strings.
     * @param item  a String to be added to the deque.
     */
    public void addToTopOfStack(Deque<String> stack, String item) {
        stack.push(item);
    }

    /**
     * Pop the value from the top of the deque and return that value.
     * (this removes the most recently-pushed value)
     *
     * @param stack A Deque of Strings.
     * @return the value popped from the top of the deque.
     */
    public String removeFromTopOfStack(Deque<String> stack) {
        return stack.pop();
    }

    /**
     * Peek the value at the top of a deque.
     * This returns the most recently-pushed value, without removing the value.
     *
     * @param stack A Deque of Strings.
     * @return the value peeked from the top of the deque.
     */
    public String getTopOfStackWithoutRemoving(Deque<String> stack) {
        return stack.peek();
    }
}
