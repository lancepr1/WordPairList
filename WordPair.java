public class WordPair {
    /** Constructs a WordPair object. */                              
    private String f;
    private String s;  
    public WordPair(String first, String second) {
        f = first;
        s = second;     }

    /** Returns the first string of this WordPair object. */
    public String getFirst() 
    {
        return f;
    }

    /** Returns the second string of this WordPair object. */
    public String getSecond() {
        return s;}
    public String toString()
    {
        return "(\"" + f + "\",\"" + s + "\")";
    }
}
