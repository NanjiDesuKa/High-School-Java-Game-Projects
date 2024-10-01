import java.util.Scanner;

public class Heir extends NorthKorean{
    private int percentPopularity;
    private boolean resigned;
    private boolean deposed;
    private boolean alliance=false;
    private int visit=3;

    public String toString() {
        return "Percent Popularity: "+percentPopularity+"\nResigned: "+resigned+"\nDeposed: "+deposed;
    }
    public boolean equals(Heir h){
        if (this.resigned==h.getResigned()&&this.deposed==h.getDeposed()&&this.percentPopularity==h.getPercent()){
            return true;
        }
        return false;
    }
    public boolean getResigned(){
        return resigned;
    }
    public boolean getDeposed(){
        return deposed;
    }
    public int getPercent(){
        return percentPopularity;
    }
    public Heir(){
        super();
    percentPopularity=200;
    deposed=false;
    resigned=false;
    }
    public Heir(int x, boolean y, boolean z){
        super();
        percentPopularity=x;
        deposed=y;
        resigned=z;
    }
    public void act(){
        if (percentPopularity>=100) percentPopularity=100;
        System.out.println("Popularity: "+ percentPopularity);
        menu();
        if (percentPopularity<0) percentPopularity=0;
        if (percentPopularity<10) deposed=true;

    }
    public void makeLaw(){
        System.out.println("(\\ \n" +
                "\\'\\ \n" +
                " \\'\\     __________  \n" +
                " / '|   ()_________)\n" +
                " \\ '/    \\ ~~~~~~~~ \\\n" +
                "   \\       \\ ~~~~~~   \\\n" +
                "   ==).      \\__________\\\n" +
                "  (__)       ()__________)");
        System.out.println("You made a new law.");
        int x=(int)(Math.random()*10+1);
        if (x==10) {
            System.out.println("The law was well received. You have increased security in your country.");
        percentPopularity+=15;
        }
        else if (x<9&&x>4) {
            percentPopularity -= 10;
            System.out.println("Your law were ruthless and not well received. The people have suffered from your careless act.");
        }
        else if (x==4){
            percentPopularity+=60;
            System.out.println("Your law allowed for more economic growth and prosperity. The effects can be felt even in the peasant fields.");
        }
        else if (x<4){
            percentPopularity-=15;
            System.out.println("Everyone hates your law, even the Pyongyang elite. No one wanted this.");
        }
        else System.out.println("Your laws did nothing.");
        }
    public void end(){
        Game.x.stop();
        System.out.println("You were hugely unpopular after what you've done, and even with all harsh restrictions, propaganda and censorship, the people were able to overthrow you.\nWill you choose to escape the country?\n type yes or no.");
        Scanner x =new Scanner(System.in);
        String gtfo = x.nextLine();
        if (gtfo.equals("yes")) escape();
        else if (gtfo.equals("no")) System.out.println("You will live in an underground bunker for the rest of your days.\n You may or may not be found, but if you are, you will most defintely die.\nSpend the rest of your days living in constant fear, you coward.");
    else {
        System.out.println("You couldn't make your decision in time, and you were beheaded.");
    }
    Game.x.setFile("src/gameover.wav");
    Game.x.play();
    System.out.println(Game.getName()+" the not so Great Leader.\nUnbeloved by  the people, hated by the world.");
    Game.slowPrint(14000);
    }
    public void escape(){
        System.out.println("            _\n" +
                "           _( }\n" +
                "          //| \\\n" +
                "       _ _ /`/\\\\\n" +
                "      |- --'\\ \\  \n" +
                "            / /\n" +
                "            \\)\n");
        System.out.println("You left your country as the great leader.");
        if (percentPopularity<=20) System.out.println("Good choice. If you had stayed, I'm sure the outcome would have been unfavorable");
        if (percentPopularity>20) {
            System.out.println("Wait. Why? You had the high life and highest status. People respected and feared you. What compelled you to leave?");
        }
        escaped=true;
    }
    public void menu(){
        Game.slowPrint(500);
        System.out.println("So many options, such little consequence. You hold all the power in this state. However, try to keep your popularity in order to stay in power. Certain actions will gain you popularity or make you lose it. Perhaps both?");
        System.out.println("What will you do today?\n\n1. Check on the People\n2. Resign\n3. Make a New Law\n4. Escape\n5. Enjoy Life\n6. Public Execution\n7. Make an Alliance\n8. Increase Nuclear Armaments");
        Scanner t = new Scanner(System.in);
        String answer = t.nextLine();
        if (answer.equals("1")||answer.equals("Check on the People")) checkOnthePeople();
        else if (answer.equals("Resign")||answer.equals("2")) resign();
        else if (answer.equals("Make an Alliance")||answer.equals("7")) alliance();
        else if (answer.equals("Make a New Law")||answer.equals("3")) makeLaw();
        else if (answer.equals("4")||answer.equals("Escape")) escape();
        else if (answer.equals("5")||answer.equals("Enjoy Life")){
            int we = (int)(Math.random()*10+1);
           if (we<=3) {
               System.out.println("  _\n" +
                       " {_}\n" +
                       " |(|\n" +
                       " |=|\n" +
                       "/   \\\n" +
                       "|.--|\n" +
                       "||  |\n" +
                       "||  |    .    ' .\n" +
                       "|'--|  '     \\~~~/\n" +
                       "'-=-' \\~~~/   \\_/\n" +
                       "       \\_/     Y\n" +
                       "        Y     _|_\n" +
                       "jgs    _|_");
               System.out.println();
               System.out.println("You took a sip of wine.");
           }
           else if (we<=7) {
           System.out.println("                       * \n" +
                   "                                  * \n" +
                   "     *                                             * \n" +
                   "                                          * \n" +
                   "               * \n" +
                   "                             * \n" +
                   "                                                       * \n" +
                   "    * \n" +
                   "                                             * \n" +
                   "        * \n" +
                   "                      *             * \n" +
                   "                                                * \n" +
                   " *                                                               * \n" +
                   "          * \n" +
                   "                          (             ) \n" +
                   "                  )      (*)           (*)      ( \n" +
                   "         *       (*)      |             |      (*) \n" +
                   "                  |      |~|           |~|      |          * \n" +
                   "                 |~|     | |           | |     |~| \n" +
                   "                 | |     | |           | |     | | \n" +
                   "                ,| |a@@@@| |@@@@@@@@@@@| |@@@@a| |. \n" +
                   "           .,a@@@| |@@@@@| |@@@@@@@@@@@| |@@@@@| |@@@@a,. \n" +
                   "         ,a@@@@@@| |@@@@@@@@@@@@.@@@@@@@@@@@@@@| |@@@@@@@a, \n" +
                   "        a@@@@@@@@@@@@@@@@@@@@@' . `@@@@@@@@@@@@@@@@@@@@@@@@a \n" +
                   "        ;`@@@@@@@@@@@@@@@@@@'   .   `@@@@@@@@@@@@@@@@@@@@@'; \n" +
                   "        ;@@@`@@@@@@@@@@@@@'     .     `@@@@@@@@@@@@@@@@'@@@; \n" +
                   "        ;@@@;,.aaaaaaaaaa       .       aaaaa,,aaaaaaa,;@@@; \n" +
                   "        ;;@;;;;@@@@@@@@;@      @.@      ;@@@;;;@@@@@@;;;;@@; \n" +
                   "        ;;;;;;;@@@@;@@;;@    @@ . @@    ;;@;;;;@@;@@@;;;;;;; \n" +
                   "        ;;;;;;;;@@;;;;;;;  @@   .   @@  ;;;;;;;;;;;@@;;;;@;; \n" +
                   "        ;;;;;;;;;;;;;;;;;@@     .     @@;;;;;;;;;;;;;;;;@@a; \n" +
                   "    ,%%%;;;;;;;;@;;;;;;;;       .       ;;;;;;;;;;;;;;;;@@;;%%%, \n" +
                   " .%%%%%%;;;;;;;a@;;;;;;;;     ,%%%,     ;;;;;;;;;;;;;;;;;;;;%%%%%%, \n" +
                   ".%%%%%%%;;;;;;;@@;;;;;;;;   ,%%%%%%%,   ;;;;;;;;;;;;;;;;;;;;%%%%%%%, \n" +
                   "%%%%%%%%`;;;;;;;;;;;;;;;;  %%%%%%%%%%%  ;;;;;;;;;;;;;;;;;;;'%%%%%%%% \n" +
                   "%%%%%%%%%%%%`;;;;;;;;;;;;,%%%%%%%%%%%%%,;;;;;;;;;;;;;;;'%%%%%%%%%%%% \n" +
                   "`%%%%%%%%%%%%%%%%%,,,,,,,%%%%%%%%%%%%%%%,,,,,,,%%%%%%%%%%%%%%%%%%%%' \n" +
                   "  `%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%' \n" +
                   "      `%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%' \n" +
                   "             \"\"\"\"\"\"\"\"\"\"\"\"\"\"`,,,,,,,,,'\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" \n" +
                   "                            `%%%%%%%' \n" +
                   "                             `%%%%%' \n" +
                   "                               %%% \n" +
                   "                              %%%%% \n" +
                   "                           .,%%%%%%%,. \n" +
                   "                      ,%%%%%%%%%%%%%%%%%%%, \n" +
                   "          ---------------------------------------------");
               System.out.println("You took a bite of your cake slice.");
           }
           else {
               System.out.println("       .............\n" +
                       "      .'             '.\n" +
                       "     : '.           .' :\n" +
                       "     :  :           :  :\n" +
                       "     :  :           :  :\n" +
                       "     :  :           :  :\n" +
                       "     :  :           :  :\n" +
                       "    .'  :           :  '.\n" +
                       " _.'    :...........:    '._\n" +
                       "(     .'             '.     )\n" +
                       " '._.'                 '._.'\n" +
                       "   (.....................)\n" +
                       "    \\___________________/\n" +
                       "     (. . . . . . . . .)\n" +
                       "      \\  /_/     \\_\\  /\n" +
                       "       ||           ||\n" +
                       "       )|           |(\n" +
                       "      (_/           \\_)  lc");
               System.out.println("You sat on your gilded throne and sighed heavily.");}
        }
        else if (answer.equals("6")||answer.equals("Public Execution")){
            System.out.println("  __.--.____________.--.__\n" +
                    "   (       _.------._       ).\n" +
                    "    '._.--'    ||    '--._.'  )\n" +
                    "     | |================| || (\n" +
                    "     | ||               | ||  )\n" +
                    "     | ||              _| || (\n" +
                    "     | ||          _.-' | ||  )\n" +
                    "     | ||      _.-'     | || (\n" +
                    "     | ||  _.-'         | ||  )\n" +
                    "     | |.-'             | || (\n" +
                    "     | ||               | ||  )\n" +
                    "     | ||               | || (\n" +
                    "     | ||               | ||  )\n" +
                    "     | ||               | || (\n" +
                    "     | ||               | ||  )\n" +
                    "     | ||               | || (\n" +
                    "     | .---.            | ||  )\n" +
                    "     | |   |            | || (\n" +
                    "     | |   |            | ||  )\n" +
                    "     | |  .'            | || (\n" +
                    "     | | '              | ||  )\n" +
                    "     | |  '.            | || (\n" +
                    "     | |   |            | ||  )\n" +
                    "     | |O__|  .))).     | || (\n" +
                    "     | ||    ( O O )    | ||\n" +
                    "     | ||===._ (_) _.===| ||\n" +
                    "     | ||     '-.-'     | ||\n" +
                    "     | || not one of my | ||\n" +
                    "     | ||  better days  | ||\n" +
                    "     | ||    ______     | ||\n" +
                    "     | ||   /      \\    | ||\n" +
                    "   __| ||  (\\______/)   | ||_____\n" +
                    "  /__| ||___) |''| (____| ||____/\n" +
                    " /___|_|/  (________)   |_|/___/\n" +
                    "/_____________________________/");
            int rng=(int)(Math.random()*10+1);
            if (rng>=6) {percentPopularity-=30;
            System.out.println("You executed a popular dissenter without proceeding with the appropriate propoganda, losing you a lot of support.");
                }
            else {
                percentPopularity+=20;
                System.out.println("You struck fear into everyone. Respect has grown a bit.");
            }
        }
        else if (answer.equals("8")||answer.equals("Increase Nuclear Armaments")){
            System.out.println("     \n" +
                    "   / \\\n" +
                    "  /___\\  \n" +
                    "  |  |     \n" +
                    "  |x |\n" +
                    "  |l | \n" +
                    "  |  |    \n" +
                    " / == \\    \n" +
                    "| /**\\ |    \n" +
                    "v      v\n");
            System.out.println("You caused world leaders to meet to discuss your problematic behavior. Because they're pushovers, you'll continue to build up nuclear arms just to get on their nerves.");
        }
        else if (answer.equals("orpheus")||answer.equals("Orpheus")) Game.secret();
        else menu();
    }
    public void checkOnthePeople(){
        if (visit>0) {
            System.out.println("You went around the country to visit your people. They are extremely happy.");
            percentPopularity+=30;
        }
        visit--;
        if (visit<=0) visit=0;
        System.out.println("You only have a limited amount of visits to the people.\nStaying around commoners hurts your sanity. You have "+visit+" visits left.");
    }
    public void resign(){
        System.out.println("You let a successor rise to office. You no longer have any power, but are still respected. You now live the rest of your days peacefully and quietly.");
        resigned=true;
    }
    public void alliance(){
        Game.x.stop();
        Game.x.setFile("src/Chinese Anthem.wav");
        Game.x.play();
        System.out.println(" ______________________\n" +
                "|   ..                 |\n" +
                "|  * .                 |\n" +
                "|   ..                 |\n" +
                "|                      |\n" +
                "|                      |\n" +
                "|                      |\n" +
                " ~~~~~~~~~~~~~~~~~~~~~~\n");
        if (alliance==false) System.out.println("You were dependent on trade with China, but now you ARE part of China.\nIn order to maintain your nuclear weapons and threats, you agreed to provide lumber and other raw materials.\nChina will provide the much needed assistance in the form of machinery and foreign investments.\n");
        System.out.println("You met with the Chairman of the People's Republic of China");
        System.out.println("You now have to listen to the anthem as punishment.");
        Game.slowPrint(48000);
        Game.x.stop();
        Game.x.setFile("src/russian kirby.wav");
        Game.x.play();
    }
}
