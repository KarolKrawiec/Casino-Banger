public class designs {
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[37m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        printHeads();
        printTails();
        printSlots();
    }

    public static void printHeads(){
        System.out.println(YELLOW + "       _____________");
        System.out.println("     _|             |_");
        System.out.println("    |     _<@@@>      |");
        System.out.println("    |     0 * \\*\\     |");
        System.out.println("    |     \\  ~  /     |");
        System.out.println("    |    __|   |__    |");
        System.out.println("    |_  /         \\  _|");
        System.out.println("      |_____________|" + RESET);
    }

    public static void printTails(){
        System.out.println(YELLOW + "      _____________");
        System.out.println("    _|     __      |_");
        System.out.println("   |      / |        |");
        System.out.println("   |     /  |        |");
        System.out.println("   |        |        |");
        System.out.println("   |      __|__      |");
        System.out.println("   |_               _|");
        System.out.println("     |_____________|" + RESET);
    }

    public static void printSlots() {
        System.out.println(RED + "###############" + RESET);
        System.out.println(RED + "#####" + YELLOW + "BIG 7" + RED + "#####" + RESET);
        System.out.println(RED + "###############" + RESET);
        System.out.println(RED + "####" + WHITE + "| | | |" + RED + "####" + WHITE + "___" + RESET);
        System.out.println(RED + "###############  " + WHITE + "|" + RESET);
        System.out.println(RED + "#########" + WHITE + "|-|" + RED + "###  " + WHITE + "|" + RESET);
        System.out.println(RED + "###############  " + RED + "O" + RESET);
        System.out.println(RED + "###" + WHITE + "|_______|" + RED + "###" + RESET);
        System.out.println(RED + "###############" + RESET);
    }
}