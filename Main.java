public class Main
{
    public static void main(String[] args) {
        String[] wordNums = {"one" , "two" , "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        System.out.println(exampleOne.getAllPairs());
        String[] moreWords = {" the", "red", "fox", "the", "red" };
        WordPairList exmapleThree = new WordPairList(moreWords);
        System.out.println(exmapleThree.numMatches());
    }
}
