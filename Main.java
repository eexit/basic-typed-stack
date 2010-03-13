public class Main
{
    private static Stack counterStack;
    
    public static void initCounterStack()
    {
        counterStack = new TypedStack("Counter", 3);
        counterStack.push(new Counter(0, 10, 1))
            .push(new Counter(0, 20, 1))
            .push(new Counter(0, 30, 1));
    }
    
    public static void main(String[] args) {
        System.out.println("*** TEST START ***");
        System.out.println("Counter stack initializing...");
        initCounterStack();
        System.out.println("Counter stack initalized:");
        System.out.println(counterStack);
        System.out.println("Getting the last pushed Counter...");
        Counter last = (Counter) counterStack.pop();
        System.out.println("Outputing popped Counter ("
            + last.getClass()
            + "@"
            + last.hashCode()
            + ") end value: "
            + last.getEnd());
        System.out.println("Current Counter stack state:");
        System.out.println(counterStack);
        System.out.println("*** TEST END ***");
    }
}