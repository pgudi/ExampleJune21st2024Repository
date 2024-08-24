package com.sgtesting.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo1 {
    public static void main(String[] args) {
    //   matchIntegerValue();
    //    matchIntegerValue2();
        matchWordsAlone();
    }

    private static void matchIntegerValue()
    {
        Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
        String str="Bangalore has received 125 mili meter of rain yesterday";
        Matcher match =pattern.matcher(str);

        String s=match.replaceAll("many");
        System.out.println(s);
    }

    private static void matchIntegerValue2()
    {
        Pattern pattern=Pattern.compile("[0-9]{3}");
        String str="Bangalore has received 125 mili meter of rain yesterday";
        Matcher match =pattern.matcher(str);

        String s=match.replaceAll("many");
        System.out.println(s);
    }

    private static void matchWordsAlone()
    {
        Pattern pattern=Pattern.compile("[a-zA-Z]+");
        String str="The temple is at the top of the hill";
        Matcher match =pattern.matcher(str);

        while(match.find())

        {
            System.out.println(match.group());
        }
    }
}
