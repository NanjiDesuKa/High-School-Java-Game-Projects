import java.util.Scanner;

public class Elite extends Heir{
    private boolean favoredByGreatLeader;
    private boolean rich;
    private int poorCount=0;
    private boolean old = false;
    private boolean know=false;
    private boolean support=false;
    private boolean goodEscape=false;
    private boolean dead=false;
    private boolean coupSuccess=false;
    private boolean firstJob=true;
    private String job="a homeless person";
    public Elite(){
        super();
        rich=true;
        favoredByGreatLeader=true;
    }
    public Elite(boolean x, boolean y){
        super();
        rich=x;
        favoredByGreatLeader=y;
    }
    public Elite(boolean dead){
        this.dead=dead;
    }
    public String toString() {
        return "Favored by the Great Leader: "+favoredByGreatLeader+"\nRich: "+rich;
    }
    public boolean equals(Elite e){
        if (this.favoredByGreatLeader==e.getFavored()&&this.rich==e.getRich()){
            return true;
        }
        return false;
    }
    public boolean getOld(){
        return old;
    }
    public void shopping(){
        int x=(int)(Math.random()*10+1);
        if (x>=5){
            System.out.println("|.'',        Public_Library_Halls         ,''.|\n" +
                    "|.'.'',                                 ,''.'.|\n" +
                    "|.'.'.'',                             ,''.'.'.|\n" +
                    "|.'.'.'.'',                         ,''.'.'.'.|\n" +
                    "|.'.'.'.'.|                         |.'.'.'.'.|\n" +
                    "|.'.'.'.'.|===;                 ;===|.'.'.'.'.|\n" +
                    "|.'.'.'.'.|:::|',             ,'|:::|.'.'.'.'.|\n" +
                    "|.'.'.'.'.|---|'.|, _MALL__ ,|.'|---|.'.'.'.'.|\n" +
                    "|.'.'.'.'.|:::|'.|'|???????|'|.'|:::|.'.'.'.'.|\n" +
                    "|,',',',',|---|',|'|???????|'|,'|---|,',',',',|\n" +
                    "|.'.'.'.'.|:::|'.|'|???????|'|.'|:::|.'.'.'.'.|\n" +
                    "|.'.'.'.'.|---|','   /%%%\\   ','|---|.'.'.'.'.|\n" +
                    "|.'.'.'.'.|===:'    /%%%%%\\    ':===|.'.'.'.'.|\n" +
                    "|.'.'.'.'.|%%%%%%%%%%%%%%%%%%%%%%%%%|.'.'.'.'.|\n" +
                    "|.'.'.'.','       /%%%%%%%%%\\       ','.'.'.'.|\n" +
                    "|.'.'.','        /%%%%%%%%%%%\\        ','.'.'.|\n" +
                    "|.'.','         /%%%%%%%%%%%%%\\         ','.'.|\n" +
                    "|.','          /%%%%%%%%%%%%%%%\\          ','.|\n" +
                    "|;____________/%%%%%Spicer%%%%%%\\____________;|");
            System.out.println("You went shopping and had some fun.\nYou also happened to hear some whisper work about a secret coup near the local food stand.");
            know=true;
        }
        if (x<5){
            System.out.println("The stores had nothing to sell. This is North Korea after all...");
        }
    }
    public boolean getGood(){
        return goodEscape;
    }
    public void escape(){
        int x= (int)(Math.random()*10+1);
        System.out.println("            _\n" +
                "           _( }\n" +
                "          //| \\\n" +
                "       _ _ /`/\\\\\n" +
                "      |- --'\\\\  \n" +
                "            //\n" +
                "            \\)\n");
        System.out.println();
        if (x==9) {
            System.out.println("You were selected to study overseas while you were still young.\nYou took the opportunity to never go back.");
            favoredByGreatLeader=false;
            goodEscape=true;
        }
        if (x==10){
            System.out.println("You bribe soldiers and illegally form a small battalion of your own.\nYou fight your way through the border and are now wanted fugitives.");
            favoredByGreatLeader=false;
            goodEscape=true;
        }
        if (x==8){
            System.out.println("You eventually rose up in society. You became a diplomat for other countries.\nSeizing the opportunity, you decide to not look back and ignore all calls to go home.\nYou now talk smack about North Korea constantly on television.");
            favoredByGreatLeader=false;
            goodEscape=true;
        }
        if (x>=1&&x<=7){
            System.out.println("================================\n" +
                    "||     ||<(.)>||<(.)>||     || \n" +
                    "||    _||     ||     ||_    || \n" +
                    "||   (__D     ||     C__)   || \n" +
                    "||   (__D     ||     C__)   ||\n" +
                    "||   (__D     ||     C__)   ||\n" +
                    "||   (__D     ||     C__)   ||\n" +
                    "||     ||     ||     ||     ||\n" +
                    "================================\n");
            System.out.println("You were caught trying to leave and your excuse was not believed nor taken seriously.\nYou were taken back to the capital.\nYou will be executed publicly by the Great Leader themself.\nYour corpse will be shown to your entire family.");
            favoredByGreatLeader=false;
        }
    }
    public void act(){
        menu();
    }
    public boolean getRich(){
        return rich;
    }
    public boolean getFavored(){
        return favoredByGreatLeader;
    }
    public void work(){
                if (firstJob==true){
                    firstJob=false;

                    System.out.println("What job do you have?\n1. Office Worker\n2. Beggar\n3. Performer\n4. Gatcha Game Developer\n5. Liberal Arts Teacher\n6. Mandatory Military Service");
                    Scanner z = new Scanner(System.in);
                    String ah = z.nextLine();
                    if (ah.equals("1")||ah.equals("Office Worker")){
                        System.out.println("            ,----------------,              ,---------,\n" +
                                "        ,-----------------------,          ,\"        ,\"|\n" +
                                "      ,\"                      ,\"|        ,\"        ,\"  |\n" +
                                "     +-----------------------+  |      ,\"        ,\"    |\n" +
                                "     |  .-----------------.  |  |     +---------+      |\n" +
                                "     |  |                 |  |  |     | -==----'|      |\n" +
                                "     |  |  Error          |  |  |     |         |      |\n" +
                                "     |  | NullPointerEx   |  |  |/----|`---=    |      |\n" +
                                "     |  |  line: 42       |  |  |   ,/|==== ooo |      ;\n" +
                                "     |  |                 |  |  |  // |(((( [33]|    ,\"\n" +
                                "     |  `-----------------'  |,\" .;'| |((((     |  ,\"\n" +
                                "     +-----------------------+  ;;  | |         |,\"     \n" +
                                "        /_)______________(_/  //'   | +---------+\n" +
                                "   ___________________________/___  `,\n" +
                                "  /  oooooooooooooooo  .o.  oooo /,   \\,\"-----------\n" +
                                " / ==ooooooooooooooo==.o.  ooo= //   ,`\\--{)B     ,\"\n" +
                                "/_==__==========__==_ooo__ooo=_/'   /___________,\"\n" +
                                "`-----------------------------'\n");
                        System.out.println("You worked a boring but stable office job.");
                        job="office worker";
                    }
                    if (ah.equals("2")||ah.equals("Beggar")){
                        System.out.println("You were sent to a work camp.");
                        Game.slowPrint(5000);
                        System.out.println("================================\n||     ||<(.)>||<(.)>||     || \n||    _||     ||     ||_    ||\n||   (__D     ||     C__)   || \n||   (__D     ||     C__)   || \n||   (__D     ||     C__)   || \n||   (__D     ||     C__)   || \n||     ||     ||     ||     ||\n================================");
                        favoredByGreatLeader=false;
                    }
                    if (ah.equals("3")||ah.equals("Performer")){
                        System.out.println("     ___\n" +
                                "   ,'._,`.\n" +
                                "  (-.___.-)\n" +
                                "  (-.___.-)\n" +
                                "  `-.___.-'                  \n" +
                                "   ((  @ @|              .            __\n" +
                                "    \\   ` |         ,\\   |`.    @|   |  |      _.-._\n" +
                                "   __`.`=-=mm===mm:: |   | |`.   |   |  |    ,'=` '=`.\n" +
                                "  (    `-'|:/  /:/  `/  @| | |   |, @| @|   /---)W(---\\\n" +
                                "   \\ \\   / /  / /         @| |   '         (----| |----) ,~\n" +
                                "   |\\ \\ / /| / /            @|              \\---| |---/  |\n" +
                                "   | \\ V /||/ /                              `.-| |-,'   |\n" +
                                "   |  `-' |V /                                 \\| |/    @'\n" +
                                "   |    , |-'                                 __| |__\n" +
                                "   |    .;: _,-.                         ,--\"\"..| |..\"\"--.\n" +
                                "   ;;:::' \"    )                        (`--::__|_|__::--')\n" +
                                " ,-\"      _,  /                          \\`--...___...--'/   \n" +
                                "(    -:--'/  /                           /`--...___...--'\\\n" +
                                " \"-._  `\"'._/                           /`---...___...---'\\\n" +
                                "     \"-._   \"---.                      (`---....___....---')\n" +
                                "      .' \",._ ,' )                     |`---....___....---'|\n" +
                                "      /`._|  `|  |                     (`---....___....---') \n" +
                                "     (   \\    |  /                      \\`---...___...---'/\n" +
                                "      `.  `,  ^\"\"                        `:--...___...--;'\n" +
                                "        `.,'          -Shimrod             `-._______.-'");
                        System.out.println("You became a performer in the theatre, providing entertainment for the masses and the Great Leader themself.");
                        job="performer";
                    }
                    if (ah.equals("4")||ah.equals("Gatcha Game Developer")){
                        System.out.println("            ,----------------,              ,---------,\n" +
                                "        ,-----------------------,          ,\"        ,\"|\n" +
                                "      ,\"                      ,\"|        ,\"        ,\"  |\n" +
                                "     +-----------------------+  |      ,\"        ,\"    |\n" +
                                "     |  .-----------------.  |  |     +---------+      |\n" +
                                "     |  |                 |  |  |     | -==----'|      |\n" +
                                "     |  |                 |  |  |     |         |      |\n" +
                                "     |  |    Senghin      |  |  |/----|`---=    |      |\n" +
                                "     |  |     Impact      |  |  |   ,/|==== ooo |      ;\n" +
                                "     |  |                 |  |  |  // |(((( [33]|    ,\"\n" +
                                "     |  `-----------------'  |,\" .;'| |((((     |  ,\"\n" +
                                "     +-----------------------+  ;;  | |         |,\"     \n" +
                                "        /_)______________(_/  //'   | +---------+\n" +
                                "   ___________________________/___  `,\n" +
                                "  /  oooooooooooooooo  .o.  oooo /,   \\,\"-----------\n" +
                                " / ==ooooooooooooooo==.o.  ooo= //   ,`\\--{)B     ,\"\n" +
                                "/_==__==========__==_ooo__ooo=_/'   /___________,\"\n" +
                                "`-----------------------------'\n");
                        System.out.println("Sensing a new danger to the world, the Great Leader sent you to a camp.");
                        Game.slowPrint(5000);
                        System.out.println("================================\n||     ||<(.)>||<(.)>||     || \n||    _||     ||     ||_    ||\n||   (__D     ||     C__)   || \n||   (__D     ||     C__)   || \n||   (__D     ||     C__)   || \n||   (__D     ||     C__)   || \n||     ||     ||     ||     ||\n================================");
                        favoredByGreatLeader=false;
                    }
                    if (ah.equals("5")||ah.equals("Liberal Arts Teacher")){
                        System.out.println("Yeaaaa... no. You were sent to a work camp.");
                        Game.slowPrint(5000);
                        System.out.println("================================\n||     ||<(.)>||<(.)>||     || \n||    _||     ||     ||_    ||\n||   (__D     ||     C__)   || \n||   (__D     ||     C__)   || \n||   (__D     ||     C__)   || \n||   (__D     ||     C__)   || \n||     ||     ||     ||     ||\n================================");
                        favoredByGreatLeader=false;
                    }
                    if (ah.equals("6")||ah.equals("Mandatory Military Service")){
                        System.out.println(" |\\                |\\                |\\                |\\\n" +
                                "   || .---.          || .---.          || .---.          || .---.\n" +
                                "   ||/_____\\         ||/_____\\         ||/_____\\         ||/_____\\\n" +
                                "   ||( '.' )         ||( '.' )         ||( '.' )         ||( '.' )\n" +
                                "   || \\_-_/_         || \\_-_/_         || \\_-_/_         || \\_-_/_\n" +
                                "   :-\"`'V'//-.       :-\"`'V'//-.       :-\"`'V'//-.       :-\"`'V'//-.\n" +
                                "  / ,   |// , `\\    / ,   |// , `\\    / ,   |// , `\\    / ,   |// , `\\\n" +
                                " / /|Ll //Ll|| |   / /|Ll //Ll|| |   / /|Ll //Ll|| |   / /|Ll //Ll|| |\n" +
                                "/_/||__//   || |  /_/||__//   || |  /_/||__//   || |  /_/||__//   || |\n" +
                                "\\ \\/---|[]==|| |  \\ \\/---|[]==|| |  \\ \\/---|[]==|| |  \\ \\/---|[]==|| |\n" +
                                " \\/\\__/ |   \\| |   \\/\\__/ |   \\| |   \\/\\__/ |   \\| |   \\/\\__/ |   \\| |\n" +
                                " /\\|_   | Ll_\\ |   /|/_   | Ll_\\ |   /|/_   | Ll_\\ |   /|/_   | Ll_\\ |\n" +
                                " `--|`^\"\"\"^`||_|   `--|`^\"\"\"^`||_|   `--|`^\"\"\"^`||_|   `--|`^\"\"\"^`||_|\n" +
                                "    |   |   ||/       |   |   ||/       |   |   ||/       |   |   ||/\n" +
                                "    |   |   |         |   |   |         |   |   |         |   |   |\n" +
                                "    |   |   |         |   |   |         |   |   |         |   |   |\n" +
                                "    |   |   |         |   |   |         |   |   |         |   |   |\n" +
                                "    L___l___J         L___l___J         L___l___J         L___l___J\n" +
                                "     |_ | _|           |_ | _|           |_ | _|           |_ | _|\n" +
                                "    (___|___)         (___|___)         (___|___)         (___|___)\n" +
                                "     ^^^ ^^^           ^^^ ^^^           ^^^ ^^^           ^^^ ^^^\n");
                        System.out.println("You are part of the many young citizens that partake in active  military participation. Good job.");
                        job="soldier";
                    }
                }
                else {
                    System.out.println("You worked as a "+ job+".");
                }
        }
        public void coup(){
            int rng = (int)(Math.random()*10+1);
            if (rng>=7||support){
                Game.x.stop();
                Game.x.setFile("src/victory.wav");
                Game.x.play();
                System.out.println("      .............\n" +
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
                System.out.println("The coup was an unexpected success. really thought you were going to die there, haha.\nNow you're the new leader.\nEnjoy your new throne...while it lasts...");
                Game.slowPrint(4000);
                coupSuccess=true;
            }
            else{
                System.out.println("WHAT WERE YOU THINKING?!\nIN WHAT WORLD WOULD YOU HAVE SUCCEEDED?!\nThink, "+ Game.getName() + ", think!\nYou were publically executed by the Great Leader himself.");
                rich=false;
                favoredByGreatLeader=false;
            }
        }
        public boolean getCoupSuccess(){
            return coupSuccess;
        }
        public void old(){
            old=true;
            System.out.println("             ...                            \n" +
                    "             ;::::;                           \n" +
                    "           ;::::; :;                          \n" +
                    "         ;:::::'   :;                         \n" +
                    "        ;:::::;     ;.                        \n" +
                    "       ,:::::'       ;           OOO\\         \n" +
                    "       ::::::;       ;          OOOOO\\        \n" +
                    "       ;:::::;       ;         OOOOOOOO       \n" +
                    "      ,;::::::;     ;'         / OOOOOOO      \n" +
                    "    ;:::::::::`. ,,,;.        /  / DOOOOOO    \n" +
                    "  .';:::::::::::::::::;,     /  /     DOOOO   \n" +
                    " ,::::::;::::::;;;;::::;,   /  /        DOOO  \n" +
                    ";`::::::`'::::::;;;::::: ,#/  /          DOOO \n" +
                    ":`:::::::`;::::::;;::: ;::#  /            DOOO\n" +
                    "::`:::::::`;:::::::: ;::::# /              DOO\n" +
                    "`:`:::::::`;:::::: ;::::::#/               DOO\n" +
                    " :::`:::::::`;; ;:::::::::##                OO\n" +
                    " ::::`:::::::`;::::::::;:::#                OO\n" +
                    " `:::::`::::::::::::;'`:;::#                O \n" +
                    "  `:::::`::::::::;' /  / `:#                  \n" +
                    "   ::::::`:::::;'  /  /   `#             \n" +
                    "\n");
            System.out.println("You died of old age, content with how rich and not fully oppressed you were.\nYou still lived in constant fear, but at least money wasn't a problem.\nHowever, you never got to see beyond the border with multiple guards patrolling it at all times.");

    }
    public void enjoy() {
        int x = (int) (Math.random() * 14 + 1);
        if (x==1) {
            System.out.println("                                          $\"   *.      *Bike*\n" +
                    "              d$$$$$$$P\"                  $    J\n" +
                    "                  ^$.                     4r  \"\n" +
                    "                  d\"b                    .db\n" +
                    "                 P   $                  e\" $\n" +
                    "        ..ec.. .\"     *.              zP   $.zec..\n" +
                    "    .^        3*b.     *.           .P\" .@\"4F      \"4\n" +
                    "  .\"         d\"  ^b.    *c        .$\"  d\"   $         %\n" +
                    " /          P      $.    \"c      d\"   @     3r         3\n" +
                    "4        .eE........$r===e$$$$eeP    J       *..        b\n" +
                    "$       $$$$$       $   4$$$$$$$     F       d$$$.      4\n" +
                    "$       $$$$$       $   4$$$$$$$     L       *$$$\"      4\n" +
                    "4         \"      \"\"3P ===$$$$$$\"     3                  P\n" +
                    " *                 $       \"\"\"        b                J\n" +
                    "  \".             .P                    %.             @\n" +
                    "    %.         z*\"                      ^%.        .r\"\n" +
                    "       \"*==*\"\"                             ^\"*==*\"\"   Gilo94'");
            System.out.println("You went biking around the traffic-less city.");
        }
        if (x==2){
            System.out.println("  ; \n" +
                    "     ;;\n" +
                    "     ;';.\n" +
                    "     ;  ;;\n" +
                    "     ;   ;;\n" +
                    "     ;    ;;\n" +
                    "     ;    ;;\n" +
                    "     ;   ;'\n" +
                    "     ;  ' \n" +
                    ",;;;,; \n" +
                    ";;;;;;\n" +
                    "`;;;;'");
            System.out.println("You enjoyed the eerie version of \"Where Are You My Dear General\" coming from the 1930's speakers that plays twice a day.");
        }
        if (x==3) {
            System.out.println("                .sss.      \n" +
                    "                $P'`T.     \n" +
                    "                $;  :;     \n" +
                    "                $;  :$     \n" +
                    "        __......$b__d$     \n" +
                    "   .sd$$$P^^^^^^^TBuG$s.   \n" +
                    "  .$P'      ___     _`T$.  \n" +
                    "  $P        \"\"\"    (_) T$  \n" +
                    " s$   _..---***---.._   $s \n" +
                    " $$ .'    ALCATEL    `. $$ \n" +
                    ".$$.  .-------------.  .$$.\n" +
                    ":$$: :               ; ;$$;\n" +
                    "$$;| |               | |:$$\n" +
                    "$$'| |               | |'$$\n" +
                    "$$ | |               | | $$\n" +
                    "$$ | |               | | $$\n" +
                    "$$ | :               ; | $$\n" +
                    "$$.;  `-------------'  :.$$\n" +
                    "$$; . (C)   .-.       . :$$\n" +
                    ":$$  `-.   / _ \\   .-'  $$;\n" +
                    "'$$  .-.`.: (_) ;.'.-.  $$'\n" +
                    " $$ :   ; `.___.' :   ; $$ \n" +
                    " $$  `-'           `-'  $$ \n" +
                    " $$.( 1 )  ( 2 )  ( 3 ).$$ \n" +
                    " $$;                   :$$ \n" +
                    " :$$ ( 4 ).( 5 ).( 6 ) $$; \n" +
                    " '$$                   $$' \n" +
                    "  $$ ( 7 ) ( 8 ) ( 9 ) $$  \n" +
                    "  $$                   $$  \n" +
                    "  $$ ( * ) ( 0 ) ( # ) $$  \n" +
                    "  $$.                 .$$  \n" +
                    "  $$; o               :$P  \n" +
                    "   T$b.             .d$P   \n" +
                    "    `^T$$$$$$$$$$$$$P^'");
            System.out.println("You used your cellphone.");
            if (know){
                System.out.println("\nYou start calling individuals who may be interested in a coup.\nThey promise you that they will back you up if you attempt a coup.");
                support=true;
            }
        }
        if (x==4) {
            System.out.println("          *\n" +
                    "                   :\n" +
                    "                   |\n" +
                    "                   |\n" +
                    "                   |\n" +
                    "                  :|:\n" +
                    "                  |||\n" +
                    "             _____|||_____\n" +
                    "            /=============\\\n" +
                    "        ---<~~~~~~~~~~~~~~~>---\n" +
                    "            \\-------------/\n" +
                    "             \\___________/\n" +
                    "               \\||:::||/\n" +
                    "                ||:::||\n" +
                    "                ||:::||\n" +
                    "                ||:::||\n" +
                    "                ||ooo||\n" +
                    "                ||___||\n" +
                    "                ||:::||\n" +
                    "                ||:::||\n" +
                    "                ||:::||\n" +
                    "                ||:::||\n" +
                    "                ||:::||\n" +
                    "               /||:::||\\\n" +
                    "              / ||:::|| \\\n" +
                    "             /  ||:::||  \\\n" +
                    "            /   ||:::||   \\\n" +
                    "        ___/____||:::||____\\____\n" +
                    "       /~~~~~~~~~~~~~~~~~~~~~~~~\\\n" +
                    "      /   |~~~~~~~~|  _____      \\\n" +
                    "      |   |________| |  |  |     | Cygnus Mineah\n" +
                    "______|______________|__|__|_____|_________");
            System.out.println("You went to the Science and Technology Center.");
        }
        if (x==5||x>11) {
            System.out.println("         (\n" +
                    "          )\n" +
                    "     __..---..__\n" +
                    " ,-='  /  |  \\  `=-.\n" +
                    ":--..___________..--;\n" +
                    " \\.,_____________,./");
            System.out.println("You bought food from a food stand.");
            if (know){
                System.out.println("Having found out about the secret coup, you approach the food stand worker and whisper words that I, the narrator, could not hear, and therefore I could not report you to the police. \nYou entered a secret basement underneath the stand and spoke to the people there. \nYou were able to rile up political support in case you decided to shake up the current system.");
                support=true;
                Game.slowPrint(9000);
            }
        }
        if (x==6) {
            System.out.println("IIIIIIIIIIIII| |IIIIIIIIIIIIIIIII| |IIIIIIIIIIIII\n" +
                    "|_|___|___|__| |__|___|___|___|__| |__|___|___|_|\n" +
                    "|___|___|___|| ||___|___|___|___|| ||___|___|___|\n" +
                    "|_|       |__| |__|           |__| |__|       |_|\n" +
                    "|_|_______|_|| ||_|___________|_|| ||_|_______|_|\n" +
                    "|_|___|___|__| |__|___|___|___|__| |__|___|___|_|\n" +
                    "|___|___|___|| ||___|___|___|___|| ||___|___|___|\n" +
                    "|_|___|___|__| |__East_Theatre___| |__|___|___|_|\n" +
                    "|___|___|___|| ||___|___|___|___|| ||___|___|___|\n" +
                    "|_|       |__| |__|___|___|___|__| |__|  ScS  |_|\n" +
                    "|_|_______|_|| ||___|   |   |___|| ||_|_______|_|\n" +
                    "|_|___|___|__| |__@ |   |   |_@__| |__|___|___|_|\n" +
                    "|___|_/^\\___|| ||___|  揉`  |___|| ||___/^\\_|___|\n" +
                    "|_|__<===>|__|_|__|_|   |   |_|__|_|__|<===>__|_|\n" +
                    "     ][o][  |_______|___|___|_______|  ][o][\n" +
                    "     <===>          |       |          <===>\n" +
                    "______\\T/________,_,|,_,o,_,|,_,________\\T/______\n" +
                    "|L_L_L_L_L_L_L_L_|\"|\"|\"|y|\"|\"|\"|_L_L_L_L_L_L_L_L|\n" +
                    "|_L_L_L_L_L_L_L_L| | | |y| | | |L_L_L_L_L_L_L_L_|\n" +
                    "|L_L_L_L_L_L_L_L_|_|_|_|y|_|_|_|_L_L_L_L_L_L_L_L|");
            System.out.println("You attended a show at the East PyongYang Grand Theater.");
        }
        if (x==7) {
            System.out.println("                                                     ___\n" +
                    "                                             ___..--'  .`.\n" +
                    "                                    ___...--'     -  .` `.`.\n" +
                    "                           ___...--' _      -  _   .` -   `.`.\n" +
                    "                  ___...--'  -       _   -       .`  `. - _ `.`.\n" +
                    "           __..--'_______________ -         _  .`  _   `.   - `.`.\n" +
                    "        .`    _ /\\    -        .`      _     .`__________`. _  -`.`.\n" +
                    "      .` -   _ /  \\_     -   .`  _         .` |Train Depot|`.   - `.`.\n" +
                    "    .`-    _  /   /\\   -   .`        _   .`   |___________|  `. _   `.`.\n" +
                    "  .`________ /__ /_ \\____.`____________.`     ___       ___  - `._____`|\n" +
                    "    |   -  __  -|    | - |  ____  |   | | _  |   |  _  |   |  _ |\n" +
                    "    | _   |  |  | -  |   | |.--.| |___| |    |___|     |___|    |\n" +
                    "    |     |--|  |    | _ | |'--'| |---| |   _|---|     |---|_   |\n" +
                    "    |   - |__| _|  - |   | |.--.| |   | |    |   |_  _ |   |    |\n" +
                    " ---``--._      |    |   |=|'--'|=|___|=|====|___|=====|___|====|\n" +
                    " -- . ''  ``--._| _  |  -|_|.--.|_______|_______________________|\n" +
                    "`--._           '--- |_  |:|'--'|:::::::|:::::::::::::::::::::::|\n" +
                    "_____`--._ ''      . '---'``--._|:::::::|:::::::::::::::::::::::|\n" +
                    "----------`--._          ''      ``--.._|:::::::::::::::::::::::|\n" +
                    "`--._ _________`--._'        --     .   ''-----..............LGB'\n" +
                    "     `--._----------`--._.  _           -- . :''           -    ''\n" +
                    "          `--._ _________`--._ :'              -- . :''      -- . ''\n" +
                    " -- . ''       `--._ ---------`--._   -- . :''\n" +
                    "          :'        `--._ _________`--._:'  -- . ''      -- . ''\n" +
                    "  -- . ''     -- . ''    `--._----------`--._      -- . ''     -- . ''\n" +
                    "                              `--._ _________`--._\n" +
                    " -- . ''           :'              `--._ ---------`--._-- . ''    -- . ''\n" +
                    "          -- . ''       -- . ''         `--._ _________`--._   -- . ''\n" +
                    ":'                 -- . ''          -- . ''  `--._----------`--._");
            System.out.println("You took a train at the PyongYang Railway Station.");}
        if (x==8) {
            System.out.println("                                 |\\    /|     \n" +
                    "                              ___| \\,,/_/     \n" +
                    "                           ---__/ \\/    \\     \n" +
                    "                          __--/     (D)  \\    \n" +
                    "                          _ -/    (_      \\   \n" +
                    "                         // /       \\_ / ==\\  \n" +
                    "   __-------_____--___--/           / \\_ O o) \n" +
                    "  /                                 /   \\==/  \n" +
                    " /                                 /          \n" +
                    "||          )                   \\_/\\          \n" +
                    "||         /              _      /  |         \n" +
                    "| |      /--______      ___\\    /\\  :         \n" +
                    "| /   __-  - _/   ------    |  |   \\ \\        \n" +
                    " |   -  -   /                | |     \\ )      \n" +
                    " |  |   -  |                 | )     | |      \n" +
                    "  | |    | |                 | |    | |       \n" +
                    "  | |    < |                 | |   |_/        \n" +
                    "  < |    /__\\                <  \\             \n" +
                    "  /__\\                       /___\\            ");
            System.out.println("You rode a horse.");}
        if (x==9) {
            System.out.println("    ___\n" +
                    " __/_  `.  .-\"\"\"-.\n" +
                    " \\_,` | \\-'  /   )`-')\n" +
                    "  \"\") `\"`    \\  ((`\"`\n" +
                    " ___Y  ,    .'7 /|\n" +
                    "(_,___/...-` (_/_/ sk");
            System.out.println("You got a new dog.");}
        if (x==10) System.out.println("You went to the coffee shop");
        if (x==11) {
            System.out.println("   |>>>                                                      |>>>\n" +
                    "    |                     |>>>          |>>>                  |\n" +
                    "    *                     |             |                     *\n" +
                    "   / \\                    *             *                    / \\\n" +
                    "  /___\\                 _/ \\           / \\_                 /___\\\n" +
                    "  [   ]                |/   \\_________/   \\|                [   ]\n" +
                    "  [ I ]                /     \\       /     \\                [ I ]\n" +
                    "  [   ]_ _ _          /       \\     /       \\          _ _ _[   ]\n" +
                    "  [   ] U U |        {#########}   {#########}        | U U [   ]\n" +
                    "  [   ]====/          \\=======/     \\=======/          \\====[   ]\n" +
                    "  [   ]    |           |   I |_ _ _ _| I   |           |    [   ]\n" +
                    "  [___]    |_ _ _ _ _ _|     | U U U |     |_ _ _ _ _ _|    [___]\n" +
                    "  \\===/  I | U U U U U |     |=======|     | U U U U U | I  \\===/\n" +
                    "   \\=/     |===========| I   | + W + |   I |===========|     \\=/\n" +
                    "    |  I   |           |     |_______|     |           |   I  |\n" +
                    "    |      |           |     |||||||||     |           |      |\n" +
                    "    |      |           |   I ||vvvvv|| I   |           |      |\n" +
                    "_-_-|______|-----------|_____||     ||_____|-----------|______|-_-_\n" +
                    "   /________\\         /______||     ||______\\         /________\\\n" +
                    "  |__________|-------|________\\_____/________|-------|__________|");
            System.out.println("You visited an amusement park.");
        }
    }
    public void menu(){
        Game.slowPrint(4000);
        System.out.println("\nHey, you're fortunate enough to live in PyongYang, the greatest city in the world.\nWhat will you do?\n1. Work\n2. Escape\n3. Enjoy your Privileges\n4. Attempt a Coup\n5. Go Shopping\n6. Pray\n7. Die of Old Age\n8. Nothing");
        Scanner e = new Scanner(System.in);
        String answer = e.nextLine();
        if (answer.equals("Work")||answer.equals("1")){
            work();
        }
        else if (answer.equals("Escape")||answer.equals("2")){
            escape();
        }
        else if (answer.equals("Enjoy Your Privileges")||answer.equals("3")){
            enjoy();
        }
        else if(answer.equals("Pray")||answer.equals("6")){
            int x=(int)(Math.random()*10+1);
            System.out.println("            .---.\n" +
                    "           /-====)\n" +
                    "           | / '(\n" +
                    "          / /  _/\n" +
                    "          | |-(    _\n" +
                    "          / |  \\  //|\n" +
                    "         /  \\   \\/\\/\n" +
                    "        |    |\\   /\n" +
                    "        `-;./ ;-'\n" +
                    "          |    \\\n" +
                    "          |     \\\n" +
                    "        _/       |\n" +
                    "jgs .--/         /\n" +
                    "    `''---`-----`");
            super.Pray(x);
        }
        else if (answer.equals("Attempt a Coup")||answer.equals("4")){
            coup();
        }
        else if (answer.equals("Die of Old Age")||answer.equals("7")){
            old();
        }
        else if (answer.equals("5")|| answer.equals("Go Shopping")){
            shopping();
        }
        else if (answer.equals("Nothing")||answer.equals("8")){
            System.out.println("You did nothing. You have the privilege to do that, you entitled elite.");
        }
        else if (answer.equals("cheat code")) coupSuccess=true;
        else if (answer.equals("orpheus")||answer.equals("Orpheus")) Game.secret();
        else {
            menu();
        }
    }
}
