import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Volume Conversion ----------");

        double inAmt1 = 0.0075708236;
        double inAmt2 = 28.316847;
        double inAmt3 = 2.1133764;
        double inAmt4 = 247.20267;

        String in1 = "L";
        String out1 = "G";
        String in2 = "L";
        String out2 = "F";
        String in3 = "G";
        String out3 = "L";
        String in4 = "F";
        String out4 = "L";

        double conversion1 = convVol(inAmt1,in1,out1);
        double conversion2 = convVol(inAmt2,in2,out2);
        double conversion3 = convVol(inAmt3,in3,out3);
        double conversion4 = convVol(inAmt4,in4,out4);

        System.out.println(inAmt1 + " liters is " + conversion1 + " gallons");
        System.out.println(inAmt2 + " liters is " + conversion2 + " cubic feet");
        System.out.println(inAmt3 + " gallons is " + conversion3 + " liters");
        System.out.println(inAmt4 + " cubic feet is " + conversion4 + " liters");

        System.out.println("------------------------------------------------------------------------------");


        problem2();


        System.out.println("--------- Pythagorean Triples ---------");

        double a1 = 1;
        double b1 = 2;
        double c1 = 3;

        double a2 = 5;
        double b2 = 4;
        double c2 = 3;

        double a3 = Math.sqrt(2);
        double b3 = 1;
        double c3 = 1;

        double a4 = 9;
        double b4 = 12;
        double c4 = 14;

        boolean triple1 = isPyTriple(a1,b1,c1);
        boolean triple2 = isPyTriple(a2,b2,c2);
        boolean triple3 = isPyTriple(a3,b3,c3);
        boolean triple4 = isPyTriple(a4,b4,c4);

        if(triple1)
            System.out.println("The set {" + a1 + "," + b1 + "," + c1 + "} forms a Pythagorean triple");
        else
            System.out.println("The set {" + a1 + "," + b1 + "," + c1 + "} does not form a Pythagorean triple");
        if(triple2)
            System.out.println("The set {" + a2 + "," + b2 + "," + c2 + "} forms a Pythagorean triple");
        else
            System.out.println("The set {" + a2 + "," + b2 + "," + c2 + "} does not form a Pythagorean triple");
        if(triple3)
            System.out.println("The set {" + a3 + "," + b3 + "," + c3 + "} forms a Pythagorean triple");
        else
            System.out.println("The set {" + a3 + "," + b3 + "," + c3 + "} does not form a Pythagorean triple");
        if(triple4)
            System.out.println("The set {" + a4 + "," + b4 + "," + c4 + "} forms a Pythagorean triple");
        else
            System.out.println("The set {" + a4 + "," + b4 + "," + c4 + "} does not form a Pythagorean triple");

        System.out.println("----------------------------------------------------------------------------------------");


        problem4();
    }
    public static double convVol(double inAmt, String in, String out) {
        if (in.equals("G") && out.equals("L"))
            return inAmt * 3.785;
        else if (in.equals("G") && out.equals("F"))
            return inAmt / 7.481;
        else if (in.equals("L") && out.equals("F"))
            return inAmt / 28.317;
        else if (in.equals("L") && out.equals("G"))
            return inAmt / 3.785;
        else if (in.equals("F") && out.equals("G"))
            return inAmt * 7.481;
        else if (in.equals("F") && out.equals("L"))
            return inAmt * 28.317;
        else
            System.out.println("I am sorry but this is invalid. Please try again.");
        return -1;
    }
    public static void problem2() {
        System.out.println("--------- Victor's Movie/Music Recommender ---------");
        System.out.println("Choose a recommendation: ");
        System.out.println("(1) Movie");
        System.out.println("(2) Music");
        System.out.println("(3) Neither");

        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num == 1) {
            System.out.println("(1) Action");
            System.out.println("(2) Drama");
            System.out.println("(3) Space");

            System.out.print("Your choice: ");
            int num1 = scan.nextInt();

            System.out.println("Victor's recommendations are:");

            if (num1 == 1) {
                System.out.println("1. Mission Impossible 4 - Ghost Protocol");
                System.out.println("2. 007 - Casino Royale");
                System.out.println("3. Inglourious Basterds");
            } else if (num1 == 2) {
                System.out.println("1. Wonder");
                System.out.println("2. Moonlight");
                System.out.println("3. 1917");
            } else {
                System.out.println("1. Star Wars III - Revenge of the Sith");
                System.out.println("2. Gravity");
                System.out.println("3. Interstellar");
            }
        } else if (num == 2) {
            System.out.println("(1) Rock");
            System.out.println("(2) Hip Hop/Rap");
            System.out.println("(3) Bossa Nova");

            System.out.print("Your choice: ");
            int num2 = scan.nextInt();

            System.out.println("Victor's recommendations are:");
            if (num2 == 1) {
                System.out.println("1. The day that never comes - Metallica");
                System.out.println("2. Roll Over Beethoven - Chuck Berry");
                System.out.println("3. November Rain - Guns'n Roses");
            } else if (num2 == 2) {
                System.out.println("1. U Can't Touch This - MC Hammer");
                System.out.println("2. The Real Slim Shady - Eminem");
                System.out.println("3. When I Grow Up - NF");
            } else {
                System.out.println("1. Chega de Saudade (No more sadness) - Joao Gilberto");
                System.out.println("2. Wave - Tom Jobim");
                System.out.println("3. Desafinado (Out of tune) - Joao Gilberto");
            }
        } else {
            System.out.println("Why would you look for a recommendation if you are not going to choose any of the options!!");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------\n\n");
    }
    public static boolean isPyTriple(double a, double b, double c) {
        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
            return true;
        else if(Math.pow(b,2) == Math.pow(c,2) + Math.pow(a,2))
            return true;
        else if(Math.pow(c,2) == Math.pow(b,2) + Math.pow(a,2))
            return true;
        else
            return false;
    }
    public static void problem4() {
        System.out.println("--------- Three Die Yahtzee-ish Game ---------");
        int a = (int) (Math.random() * 6) + 1;
        int b = (int) (Math.random() * 6) + 1;
        int c = (int) (Math.random() * 6) + 1;

        System.out.println("You rolled " + a + ", " + b + ", " + c);
        System.out.print("Indicate which dice should be re-rolled by entering a Y for yes\n");
        System.out.println("or N for no in each positions, as one string (YNY means re=roll 1st and 3rd)");

        if (a != b || a != c || b!=c){
            Scanner scan = new Scanner(System.in);
            String dice = scan.nextLine();
            if (dice.equals("YYN")) {
                a = (int) (Math.random() * 6) + 1;
                b = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled " + a + ", " + b + ", " + c);
            }
            else if(dice.equals("YNY")) {
                a = (int) (Math.random() * 6) + 1;
                c = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled " + a + ", " + b + ", " + c);
            }
            else if(dice.equals("NYY")){
                b = (int) (Math.random() * 6) + 1;
                c = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled " + a + ", " + b + ", " + c);
            }
            else if(dice.equals("YNN")){
                a = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled " + a + ", " + b + ", " + c);
            }
            else if(dice.equals("NYN")){
                b = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled " + a + ", " + b + ", " + c);
            }
            else{
                c = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled " + a + ", " + b + ", " + c);
            }
        }
        else {
            System.out.println("You rolled " + a + ", " + b + ", " + c);
            System.out.println("You win!!");
        }
        if(a != b || a != c || b!=c){
            Scanner scan = new Scanner(System.in);
            String dice = scan.nextLine();
            if (dice.equals("YYN")) {
                a = (int) (Math.random() * 6) + 1;
                b = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled " + a + ", " + b + ", " + c);
            }
            else if(dice.equals("YNY")) {
                a = (int) (Math.random() * 6) + 1;
                c = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled " + a + ", " + b + ", " + c);
            }
            else if(dice.equals("NYY")){
                b = (int) (Math.random() * 6) + 1;
                c = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled " + a + ", " + b + ", " + c);
            }
            else if(dice.equals("YNN")){
                a = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled " + a + ", " + b + ", " + c);
            }
            else if(dice.equals("NYN")){
                b = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled " + a + ", " + b + ", " + c);
            }
            else{
                c = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled " + a + ", " + b + ", " + c);
            }
        }
        else {
            System.out.println("You rolled " + a + ", " + b + ", " + c);
            System.out.println("You win!!");
        }
        if(a != b || a != c || b!=c)
            System.out.println("You Lose!! Game Over");
        else
            System.out.println("You win!!");
    }
}