package hash_map_examples;

public class AutoCorrect {
    /**
     Autocorrect Text

     Task
     You've been tasked with writing an autocorrect service for messages sent by your legal team. The messages which are sent to other lawyers need to be updated so that each message sent references the lawyer's client for clarity. To do this you need to replace all instances of "you" and its misspellings with "your client".

     Complete the function so that it takes a string and replaces all instances of "you", "youuu", or "u" (not case sensitive) with "your client" (always lower case).

     Return the resulting string.

     The Catch
     Here's the slightly tricky part: These are informal messages, so there are different forms of "you" and "u".

     For the purposes of this task, here's what you need to support:

     "youuuuu" with any number of "u" characters tacked onto the end
     "u" at the beginning, middle, or end of a string, but NOT part of a word
     "you" but NOT as part of another word like "young" or "Bayou"
     Specification
     autocorrect(input)
     Parameters
     input: String - the text to be autocorrected

     Return Value
     String - The autocorrected text

     Examples
     input	                                         Return Value
     "We have sent the deliverables to you."	        "We have sent the          deliverables to your client."
     "Our team is excited to finish this with you."	"Our team is excited to finish this with your client."
     "youtube"	                                    " youtube"
     */

//    public static String autocorrect(String text) {
//        String autocorrectText = "";
//        if(text.equalsIgnoreCase("you")){
//            autocorrectText = text.replace("you", "your client");
//            return autocorrectText;
//        }
//        if (text.contains("you")){
//            autocorrectText = text.replace(text,"your client");
//            return autocorrectText;
//        }
//        return autocorrectText;
//    }
    public static String autocorrect(String text) {
        // Pattern explanation:
        // \b: word boundary
        // u: matches a literal "u"
        // you+: matches "you" followed by one or more "u" (covers "you", "youu", "youuu", etc.)
        // (?i): makes the match case-insensitive
        // \b(?<!\S)u(?!\S)\b: matches a standalone "u", ensuring it's not part of a larger word
        String pattern = "\\b(?i)(you+|\\b(?<!\\S)u(?!\\S)\\b)\\b";
        return text.replaceAll(pattern, "your client");
    }

    public static void main(String[] args) {
        System.out.println(autocorrect("youuuuuuuuuu"));
    }
}
