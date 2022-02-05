package mistartasks;
import java.util.Scanner;
public class FirstMillionGame {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's begin! Please introduce yourself!!!");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "\nHere is your first question!");
        System.out.println("1) What is name of Earth's satellite?");
        String a1 = "Jupiter", a2 = "Mars", a3 = "Moon", a4 = "Europe";
        String fail = "No! You are wrong! Goodbye!!!";
        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
        if (sc.next().equals(a3)) {
            System.out.println("Super! It's true" + "\nNext question is:" +
                                "\n2) How much meters are in one kilometers?" );
            String b1 = "1000", b2 = "10", b3 = "100", b4 = "10000";
            System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
            if (sc.next().equals(b1)) {
                System.out.println("Congratulation!!! Next question is:" +
                                    "\n3) What is the capital of Germany?");
                String c1 = "Kyiv", c2 = "Moscow", c3 = "Vienna", c4 = "Berlin";
                System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);
                if (sc.next().equals(c4)) {
                    System.out.println("You are clever one! Here is your fourth question:" +
                                        "\n4) What color is absent in the rainbow?");
                    String d1 = "Green", d2 = "Brown", d3 = "Red", d4 = "Yellow";
                    System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);
                    if (sc.next().equals(d2)) {
                        System.out.println("Yeees! Let's continue:" +
                                            "\n5) What country doesn't exist now?");
                        String e1 = "Poland", e2 = "Yugoslavia", e3 = "Mexico", e4 = "Somali";
                        System.out.println(e1 + " " + e2 + " " + e3 + " " + e4);
                        if (sc.next().equals(e2)) {
                            System.out.println("You have won 10000$. Computer, please next question:" +
                                                "\n6) Which of these substances isn't acid?");
                            String f1 = "Na2SO4", f2 = "HCl", f3 = "H3PO4", f4 = "HNO3";
                            System.out.println(f1 + " " + f2 + " " + f3 + " " + f4);
                            if (sc.next().equals(f1)) {
                                System.out.println("You gonna rob us! Next please:" +
                                                    "\n7)What is the currency of Kazakhstan?");
                                String g1 = "Lek", g2 = "Tugrik", g3 = "Som", g4 = "Tenge";
                                System.out.println(g1 + " " + g2 + " " + g3 + " " + g4);
                                if (sc.next().equals(g4)) {
                                    System.out.println("Million is near! Next one:" +
                                                        "\n8) Which one of these combats Napoleon lost?");
                                    String h1 = "Borodino", h2 = "Marengo", h3 = "Austerlitz", h4 = "Near pyramids";
                                    System.out.println(h1 + " " + h2 + " " + h3 + " " + h4);
                                    if (sc.next().equals(h1)) {
                                        System.out.println("Exactly! Next:" +
                                                            "\n9) Who has never won Nobel Prise?");
                                        String i1 = "Ilya_Mechnikov", i2 = "Maria_Kuri", i3 = "Thomas_Edison", i4 = "Barak_Obama";
                                        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);
                                        if (sc.next().equals(i3)) {
                                            System.out.println("Bravo!!! Here is your next question:" +
                                                                "\n10) In what country, the capital is the biggest city?");
                                            String j1 = "Austria", j2 = "Australia", j3 = "Brazil", j4 = "Israel";
                                            System.out.println(j1 + " " + j2 + " " + j3 + " " + j4);
                                            if (sc.next().equals(j1)) {
                                                System.out.println("You are right!!! Next is:" +
                                                                    "\n11) The closest star to The Sun is:");
                                                String k1 = "Arcturus", k2 = "Sirius", k3 = "Betelgeuse", k4 = "Proxima_centauri";
                                                System.out.println(k1 + " " + k2 + " " + k3 + " " + k4);
                                                if (sc.next().equals(k4)) {
                                                    System.out.println("It's true - Proxima_centauri! Next question:" +
                                                                        "\n12) What club has won Champion's League in 1972?");
                                                    String l1 = "AC_Milan", l2 = "AFC_Ajax", l3 = "FC_Liverpool", l4 = "FC_Celtic";
                                                    System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);
                                                    if (sc.next().equals(l2)) {
                                                        System.out.println("I can see you are football fan. Next question is:" +
                                                                            "\n13) How many hearts does an octopus have?");
                                                        String m1 = "5", m2 = "4", m3 = "3", m4 = "2";
                                                        System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);
                                                        if (sc.next().equals(m3)) {
                                                            System.out.println("Do you feel this smell of victory? Please next:" +
                                                                                "\n14) What of these isn't alphabet in Japanese");
                                                            String n1 = "Mitori", n2 = "Hiragana", n3 = "Katakana", n4 = "Kanji";
                                                            System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
                                                            if (sc.next().equals(n1)) {
                                                                System.out.println("My darling, finally, tha last question." +
                                                                                    "\nAre you raedy to become a millionaire?" +
                                                                                    "\nIf yes, just answer one question:" +
                                                                                    "\n15) What is the biggest fear of every decent Mistar?");
                                                                String o1 = "Johny", o2 = "Kapral", o3 = "Gorodzhev", o4 = "Guks";
                                                                System.out.println(o1 + " " + o2 + " " + o3 + " " + o4);
                                                                if (sc.next().equals(o4)) {
                                                                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$" +
                                                                                        "\nCongratulation!!! You are a new millionaire!!!");
                                                                } else {
                                                                    System.out.println("You were close, but not today" +
                                                                                        "\nGAME OVER");
                                                                }
                                                            } else {
                                                                System.out.println(fail);
                                                            }
                                                        } else {
                                                            System.out.println(fail);
                                                        }
                                                    } else {
                                                        System.out.println(fail);
                                                    }
                                                } else {
                                                    System.out.println(fail);
                                                }
                                            } else {
                                                System.out.println(fail);
                                            }
                                        } else {
                                            System.out.println(fail);
                                        }
                                    } else {
                                        System.out.println(fail);
                                    }
                                } else {
                                    System.out.println(fail);
                                }
                            } else {
                                System.out.println(fail);
                            }
                        } else {
                            System.out.println(fail);
                        }
                    } else {
                        System.out.println(fail);
                    }
                } else {
                    System.out.println(fail);
                }
            } else {
                System.out.println(fail);
            }
        } else {
            System.out.println(fail);
        }


    }
}
