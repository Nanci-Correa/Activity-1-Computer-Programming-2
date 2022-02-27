package 
CorreaRemovingWhiteSpaceFromAString;

public class RemovingWhiteSpaceFromAString {


public static void main(String[] args)
    {
        String str = " C o m p u t e r  P r o g r a m m i n g  2  ";
       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);
    }
}
