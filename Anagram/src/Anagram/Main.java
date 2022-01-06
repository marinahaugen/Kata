package Anagram;

import java.util.Arrays;

public class Main {

    static void checkStrings(String s1, String s2) {
        s1.replaceAll("\\s", "");
        s1.replaceAll("\\s", "");
        boolean result = true;

        if (s1.length() != s2.length()) {
            result = false;
        }
        else {
            char[] s1Ch = s1.toLowerCase().toCharArray();
            char[] s2Ch = s2.toLowerCase().toCharArray();
            Arrays.sort(s1Ch);
            Arrays.sort(s2Ch);
            result = Arrays.equals(s1Ch, s2Ch);
        }

        if(result) {
            System.out.println("'" + s1 + "'" + " and " + "'" + s2 + "'" + " is an anagram.");
        }
        else {
           System.out.println("'" + s1 + "'" + " and " + "'" + s2 + "'" + " is NOT an anagram.");
        }
    }

    public static void main(String[] args) {
	System.out.println("Hello world!");
	checkStrings("Hei på deg", "Hei på deg");
	checkStrings("Hei på deg", "Nei nei hei");
    }
}
