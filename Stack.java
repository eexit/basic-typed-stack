/**
 * Stack class
 * @author Joris Berthelot <admin@eexit.net>
 * @copyright Copyright (c) 2010, Joris Berthelot
 * @version 1.00
 */
public class Stack
{
    /**
     * The stack content
     * @since 1.00
     * @version 1.00
     */
    private Object stack[];
    
    /**
     * The stack length
     * @since 1.00
     * @version 1.00
     */
    private int length = 0;
    
    /**
     * Stack default constructor
     * @since 1.00
     * @version 1.00
     */
    public Stack()
    {
        this.stack = new Object[100];
    }
    
    /**
     * Stack constructor with length parameter
     * @param int length The wanted stack length
     * @since 1.00
     * @version 1.00
     */
    public Stack(int length)
    {
        this();
        this.stack = new Object[length];
    }
    
    /**
     * Push stack method, used to add elements to the stack
     * @param Object obj The element to push
     * @throws ArrayIndexOutOfBoundsException Exception if the stack limit is reached
     * @return Stack The current instance
     * @since 1.00
     * @version 1.00
     */
    public Stack push(Object obj)
        throws ArrayIndexOutOfBoundsException
    {
        if (this.isFull()) {
            throw new ArrayIndexOutOfBoundsException("Stack limit of "
                + this.stack.length
                + " is already reached!");
        }
        this.stack[this.length++] = obj;
        return this;
    }
    
    /**
     * Pop stack method, used to get the last pushed stack element
     * @return Object|null The last pushed stack element
     * @since 1.00
     * @version 1.00
     */
    public Object pop()
    {
        if (0 < this.length) {
            Object obj = this.stack[--this.length];
            this.stack[this.length] = null;
            return obj;
        }
        return null;
    }
    
    /**
     * Stack length getter
     * @return int The stack length
     * @since 1.00
     * @version 1.00
     */
    public int getLength()
    {
        return this.length;
    }
    
    /**
     * Checkes if the stack is empty
     * @return boolean Returns true if empty
     * @since 1.00
     * @version 1.00
     */
    public boolean isEmpty()
    {
        return 0 < this.length ? false : true;
    }
    
    /**
     * Checkes if the stack is full
     * @return boolean Returns true if full
     * @since 1.00
     * @version 1.00
     */
    public boolean isFull()
    {
        return this.length == this.stack.length;
    }
    
    /**
     * Stack output method (overloads toString())
     * @return String A description of name/address of each stack elements
     * @since 1.00
     * @version 1.00
     */
    public String toString()
    {
        String output = new String("#"
            + this.getLength()
            + "[");
            
        if (!this.isEmpty()) {
            int i = 0;
            while (i < this.length) {
                output += " "
                       + this.stack[i].getClass()
                       + "@"
                       + this.stack[i].hashCode();
                i++;
            }
            output += " ]";
        }
        return output;
    }
}