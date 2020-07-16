/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeeksforGeeksStringOnFlipkart {
    public static void main(String[] args) {
        String input="asdfkamaghjlkjhfdasskamafgsafhklhfkamaskamafghjlgfadgjkama";
        Pattern pattern=Pattern.compile("kama");
        Matcher match=pattern.matcher(input);
        System.out.println(match.matches());
        System.out.println(Pattern.matches("//*ama",input));

    }
}
