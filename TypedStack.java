/**
 * TypedStack class
 * @author Joris Berthelot <admin@eexit.net>
 * @copyright Copyright (c) 2010, Joris Berthelot
 * @version 1.00
 */
public class TypedStack extends Stack
{
    /**
     * The stack type
     * @since 1.00
     * @version 1.00
     */
    private String type;
    
    /**
     * Default constructor
     * @param String type The stack type
     * @since 1.00
     * @version 1.00
     */
    public TypedStack(String type)
    {
        super();
        this.type = type;
    }
    
    /**
     * Constructor with stack length as parameter
     * @param String type The stack type
     * @param int length The stack length
     * @since 1.00
     * @version 1.00
     */
    public TypedStack(String type, int length)
    {
        super(length);
        this.type = type;
    }
    
    /**
     * Push typed stack method (overloads {@link Stack.push()})
     * @param Object obj The new type element to push
     * @return TypedStack The current instance
     * @throws ArrayIndexOutOfBoundsException|ClassNotFoundException|Exception
     * {@link Stack.push()}| Typed class not found | Typed element does not
     * match to the typed stack
     * @since 1.00
     * @version 1.00
     */
    public TypedStack push(Object obj)
    {
        try {
            if (obj.getClass() != Class.forName(this.type)) {
                throw new Exception("Bad object type ("
                    + obj.getClass()
                    +")! Must match with the stack type ("
                    + Class.forName(this.type)
                    + ").");
            }
            super.push(obj);
        } catch (Exception e) {
            System.out.println(e);
        }
        return this;
    }
    
    /**
     * TypedStack stack output method (overloads {@link Stack.toString()})
     * @return String A description of the current typed stack
     * @since 1.00
     * @version 1.00
     */
    public String toString()
    {
        return this.type + " " + super.toString();
    }
}