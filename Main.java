import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    for (int i = args.length - 1; i >= 0; i--) {
      String arg = args[i];
      System.out.println(caseByLength(arg));
    }

    // int i = args.length-1;
    // while (i >= 0) {
    //   String arg = args[i];
    //   System.out.println(arg);
    //   i--;
    // }


    // for (String arg: args) {
    //   System.out.println(arg):
    // }
 


  }
  // LOOKING AT THE LENGTH OF THE STRING OF THE ARRAY NOT AT THE ARRAY ITSELF

/** this allows java doc to identify comments for extraction
*/


/**
 * Returns a case-modified version of {@code input}. If
 * the length is even, a lowercase version is returned, otherwise, an uppercase version is 
 * returned.
 * 
 * @param input {@link String} to be re-cased.
 * @return Re-cased version of {@code input}.
 */
  private static String caseByLength(String input) {
    // String output;

    // Use the length and content of input to assign the correct value to output.
    //  -Odd length: Uppercase;
    //  -Even-length: Lowercase.

    // if (input.length() % 2 == 0) {
    //   output = input.toLowerCase();
    // } else {
    //   output = input.toUpperCase();
    // }

    // return output;

    return (input.length() % 2 == 0) ? input.toLowerCase() : input.toUpperCase();

  }
 
}


