package mistartasks;
import variables.UtilLogger;

import java.util.Scanner;
public class FirstMillionGame {
    private static final String FAIL = "No! You are wrong! Goodbye!!!";
    private static final String CONTINUE_OR_NOT = "Do you want to continue? Type 'Yes' if yes, and 'No' if not";
    private static final String TAKING_MONEY = "Here is your money! Goodbye!";

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        UtilLogger.LogToConsole("Let's begin! Please introduce yourself!!!");
        String name = sc.nextLine();
        UtilLogger.LogToConsole("Hello, " + name + "\nHere is your first question!");
        UtilLogger.LogToConsole("1) What is name of Earth's satellite?\n\tA) Jupiter; B) Mars; C) Moon; D) Europe;");
        if (sc.next().equalsIgnoreCase("c")) {
            UtilLogger.LogToConsole("Super! It's true!" + "\n" + CONTINUE_OR_NOT);
            if (sc.next().equalsIgnoreCase("yes")) {
                UtilLogger.LogToConsole("Next question is:" +
                                        "\n2) How much meters are in one kilometers?" +
                                        "\n\tA) 1000; B) 10; C) 100; D) 10000");
                if (sc.next().equalsIgnoreCase("a")) {
                    UtilLogger.LogToConsole("It's right answer!" + "\n" + CONTINUE_OR_NOT);
                    if (sc.next().equalsIgnoreCase("yes")) {
                        UtilLogger.LogToConsole("Next question is:" +
                                                "\n3) What is the capital of Germany?" +
                                                "\n\tA) Kyiv; B) Moscow; C) Vienna; D) Berlin");
                        if (sc.next().equalsIgnoreCase("d")) {
                            UtilLogger.LogToConsole("Congratulation!!!" + "\n" + CONTINUE_OR_NOT);
                            if (sc.next().equalsIgnoreCase("yes")) {
                                UtilLogger.LogToConsole("Here is your fourth question:" +
                                                        "\n4) What color is absent in the rainbow?" +
                                                        "\n\tA) Green: B) Brown; C) Red; D) Yellow");
                                if (sc.next().equalsIgnoreCase("b")) {
                                    UtilLogger.LogToConsole("You are clever one!" + "\n" + CONTINUE_OR_NOT);
                                    if (sc.next().equalsIgnoreCase("yes")) {
                                        UtilLogger.LogToConsole("Let's continue:" +
                                                                "\n5) What country doesn't exist now?" +
                                                                "\n\tA) Poland; B) Yugoslavia; C) Mexico; D) Somali");
                                        if (sc.next().equalsIgnoreCase("b")) {
                                            UtilLogger.LogToConsole("Yeees!" + "\n" + CONTINUE_OR_NOT);
                                            if (sc.next().equalsIgnoreCase("yes")) {
                                                UtilLogger.LogToConsole("Computer, please next question:" +
                                                                        "\n6) Which of these substances isn't acid?" +
                                                                        "\n\tA) Na2SO4; B) HCl; C) H3PO4; D) HNO3");
                                                if (sc.next().equalsIgnoreCase("a")) {
                                                    UtilLogger.LogToConsole("You gonna rob us!" + "\n" + CONTINUE_OR_NOT);
                                                    if (sc.next().equalsIgnoreCase("yes")) {
                                                        UtilLogger.LogToConsole("Next please:" +
                                                                                "\n7)What is the currency of Kazakhstan?" +
                                                                                "\n\tA) Lek; B) Tugrik; C) Som; D) Tenge");
                                                        if (sc.next().equalsIgnoreCase("d")) {
                                                            UtilLogger.LogToConsole("Million is near!" + "\n" + CONTINUE_OR_NOT);
                                                            if (sc.next().equalsIgnoreCase("yes")) {
                                                                UtilLogger.LogToConsole("Next one:" +
                                                                                        "\n8) Which one of these combats Napoleon lost?" +
                                                                                        "\n\tA) Borodino; B) Marengo; C) Austerlitz; D) Near pyramids");
                                                                if (sc.next().equalsIgnoreCase("a")) {
                                                                    UtilLogger.LogToConsole("Exactly!" + "\n" + CONTINUE_OR_NOT);
                                                                    if (sc.next().equalsIgnoreCase("yes")) {
                                                                        UtilLogger.LogToConsole("Next:" +
                                                                                                "\n9) Who has never won Nobel Prise?" +
                                                                                                "\n\tA) Ilya Mechnikov; B) Maria Kuri; C) Thomas Edison; D) Barak Obama");
                                                                        if (sc.next().equalsIgnoreCase("c")) {
                                                                            UtilLogger.LogToConsole("Bravo!!!" + "\n" + CONTINUE_OR_NOT);
                                                                            if (sc.next().equalsIgnoreCase("yes")) {
                                                                                UtilLogger.LogToConsole("Here is your next question:" +
                                                                                                        "\n10) In what country, the capital is the biggest city?" +
                                                                                                        "\n\tA) Austria; B) Australia; C) Brazil; D) Israel");
                                                                                if (sc.next().equalsIgnoreCase("a")) {
                                                                                    UtilLogger.LogToConsole("You are right!!!" + "\n" + CONTINUE_OR_NOT);
                                                                                    if (sc.next().equalsIgnoreCase("yes")) {
                                                                                        UtilLogger.LogToConsole("Next is:" +
                                                                                                                "\n11) The closest star to The Sun is:" +
                                                                                                                "\n\tA) Arcturus; B) Sirius; C) Betelgeuse; D) Proxima centauri");
                                                                                        if (sc.next().equalsIgnoreCase("d")) {
                                                                                            UtilLogger.LogToConsole("It's true - Proxima centauri!" + "\n" + CONTINUE_OR_NOT);
                                                                                            if (sc.next().equalsIgnoreCase("yes")) {
                                                                                                UtilLogger.LogToConsole("Next question:" +
                                                                                                                        "\n12) What club has won Champion's League in 1972?" +
                                                                                                                        "\n\tA) AC Milan; B) AFC Ajax; C) FC Liverpool; D) FC Celtic");
                                                                                                if (sc.next().equalsIgnoreCase("b")) {
                                                                                                    UtilLogger.LogToConsole("I can see you are football fan." + "\n" + CONTINUE_OR_NOT);
                                                                                                    if (sc.next().equalsIgnoreCase("yes")) {
                                                                                                        UtilLogger.LogToConsole("Next question is:" +
                                                                                                                                "\n13) How many hearts does an octopus have?" +
                                                                                                                                "\n\tA) 5; B) 4; C) 3; D) 2");
                                                                                                        if (sc.next().equalsIgnoreCase("c")) {
                                                                                                            UtilLogger.LogToConsole("Do you feel this smell of victory?" + "\n" + CONTINUE_OR_NOT);
                                                                                                            if (sc.next().equalsIgnoreCase("yes")) {
                                                                                                                UtilLogger.LogToConsole("Please next:" +
                                                                                                                                        "\n14) What of these isn't alphabet in Japanese" +
                                                                                                                                        "\n\tA) Mitori; B) Hiragana; C) Katakana; D) Kanji");
                                                                                                                if (sc.next().equalsIgnoreCase("a")) {
                                                                                                                    UtilLogger.LogToConsole("My darling, finally, tha last question!!!" + "\n" + CONTINUE_OR_NOT);
                                                                                                                    if (sc.next().equalsIgnoreCase("yes")) {
                                                                                                                        UtilLogger.LogToConsole("Are you ready to become a millionaire?" +
                                                                                                                                "\nIf yes, just answer one question:" +
                                                                                                                                "\n15) What is the biggest fear of every decent Mistar?" +
                                                                                                                                "\n\tA) Johny; B) Kapral; C) Gorodzhev; D) Guks");
                                                                                                                        if (sc.next().equalsIgnoreCase("d")) {
                                                                                                                            UtilLogger.LogToConsole("$$$$$$$$$$$$$$$$$$$$$$$$$$" +
                                                                                                                                                    "\nCongratulation!!! You are a new millionaire!!!");
                                                                                                                        } else {UtilLogger.LogToConsole("You were close, but not today\nGAME OVER");}
                                                                                                                    } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                                                                                                                } else {UtilLogger.LogToConsole(FAIL);}
                                                                                                            } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                                                                                                        } else {UtilLogger.LogToConsole(FAIL);}
                                                                                                    } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                                                                                                } else {UtilLogger.LogToConsole(FAIL);}
                                                                                            } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                                                                                        } else {UtilLogger.LogToConsole(FAIL);}
                                                                                    } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                                                                                } else {UtilLogger.LogToConsole(FAIL);}
                                                                            } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                                                                        } else {UtilLogger.LogToConsole(FAIL);}
                                                                    } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                                                                } else {UtilLogger.LogToConsole(FAIL);}
                                                            } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                                                        } else {UtilLogger.LogToConsole(FAIL);}
                                                    } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                                                } else {UtilLogger.LogToConsole(FAIL);}
                                            } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                                        } else {UtilLogger.LogToConsole(FAIL);}
                                    } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                                } else {UtilLogger.LogToConsole(FAIL);}
                            } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                        } else {UtilLogger.LogToConsole(FAIL);}
                    } else {UtilLogger.LogToConsole(TAKING_MONEY);}
                } else {UtilLogger.LogToConsole(FAIL);}
            } else{UtilLogger.LogToConsole(TAKING_MONEY);}
        } else {UtilLogger.LogToConsole(FAIL);}


    }
}
