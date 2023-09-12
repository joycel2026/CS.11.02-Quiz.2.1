package PACKAGE_NAME;public class Main {
    public static void main (String[] args){
        int resultOne = add(11,14);
        System.out.println(resultOne);
        String resultTwo = greeting ("Joyce");
        System.out.println(resultTwo);
        int resultThree = add(2,5,8,12);
        System.out.println(resultThree);
        printMe("Beluga");
    }
    public static int add (int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static String greeting (String name){
        return "Bonjour, "+name+"!";
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int numFive = add(numOne, numTwo);
        int numSix = add(numThree, numFour);
        return add(numFive, numSix);
    }
    public static void printMe(String toBePrinted){
        System.out.println(toBePrinted);
    }
}

