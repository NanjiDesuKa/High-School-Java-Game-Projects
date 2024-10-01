import java.util.Scanner;

public class Peasant extends Elite{
    private int daysUntilFoodRunsOut;
    private boolean dead;
    private boolean approvedElite=false;
    private boolean shot=false;

    @Override
    public String toString() {
        return "Days Until Food Runs out: "+daysUntilFoodRunsOut;
    }
    public boolean equals(Peasant p){
        if (this.daysUntilFoodRunsOut==p.getDaysUntilFoodRunsOut()){
               return true;
        }
        return false;
    }
    public Peasant(){
        super();
        daysUntilFoodRunsOut=2;
        dead=false;
    }
    public Peasant(int food, boolean dead){
        super(dead);
        daysUntilFoodRunsOut=food;
    }
    public Peasant(int x){
        super();
        daysUntilFoodRunsOut=x;
    }
    public boolean getEscaped(){
        return super.getEscaped();
    }
    public boolean getApprove(){
        return approvedElite;
    }
    public void act(){
        if (dead==true){
            daysUntilFoodRunsOut=-1;
        }
        if (daysUntilFoodRunsOut<0&&Game.level==1&&shot==true){
            if (dead!=true) end();
            if (dead) {
                Game.x.stop();
                Game.x.setFile("src/gameover.wav");
                Game.x.play();
                System.out.println("You bled out from your wounds.");
                System.out.println("                           ______\n" +
                        "        |\\_______________ (_____\\\\______________\n" +
                        "HH======#H###############H#######################\n" +
                        "        ' ~\"\"\"\"\"\"\"\"\"\"\"\"\"\"`##(_))#H\\\"\"\"\"\"Y########\n" +
                        "                          ))    \\#H\\       `\"Y###\n" +
                        "pew                       \"      }#H)");
            Game.slowPrint(14000);
            }
        }
        if (daysUntilFoodRunsOut<0&&Game.level==1&&shot==false){
            System.out.println("You were blown up by a landmine while digging for food.");
        }
        if (daysUntilFoodRunsOut>=20){
            Game.level=2;
            daysUntilFoodRunsOut=-1;
            System.out.println("The Great Leader personally came to inspect your progress.\nYour abundance of crops is an extremely unusual turn of events.\nBelieving you to have incredible luck, the Great Leader has promoted you to an Elite.");
            approvedElite=true;
        }
else if (getEscaped()!=true&&daysUntilFoodRunsOut>=0) {
    Game.slowPrint(1000);
    menu();
}
    }
    public int getDaysUntilFoodRunsOut(){
        return daysUntilFoodRunsOut;
    }
    public boolean getDead(){
        return dead;
    }
    public void setDaysUntilFoodRunsOut(int x){
        daysUntilFoodRunsOut=x;
    }
    public void farm(){
        int x=(int)(Math.random()*10+1);
        if (x>7) {
            System.out.println("                            +&-\n" +
                    "                          _.-^-._    .--.\n" +
                    "                       .-'   _   '-. |__|\n" +
                    "                      /     |_|     \\|  |\n" +
                    "                     /               \\  |\n" +
                    "                    /|     _____     |\\ |\n" +
                    "                     |    |==|==|    |  |\n" +
                    " |---|---|---|---|---|    |--|--|    |  |\n" +
                    " |---|---|---|---|---|    |==|==|    |  |\n" +
                    "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println();
            System.out.println("You spent the day cultivating the little land you have.");
           daysUntilFoodRunsOut += 2;
        }
        if (x==7){
            System.out.println("                 .________________._____\n" +
                    "               /~~~~~~~//~~~~~~~~//~~~~~|\n" +
                    "              /       //        //      |\n" +
                    "             /_\\.___ //__ \\.___//_______|\n" +
                    "   O       [%%%%%%%%%] O=====] |[_______]\n" +
                    "  __\\__ ===========___/_ --------}==========================\n" +
                    " |**   |/|(@ ## (@|   **|        |     []|                  |)\n" +
                    " |     |/| ###### |     | _____  |       |         ___      |\n" +
                    " |_____|/|_######_|____ |/_  _  \\}_______|________/_  _\\    |.\n" +
                    "|________________________|     \\ \\_______________//     \\\\ /\n" +
                    "  |%{  @  }            |%{  @  }                |%{  @  }\n" +
                    "   \\%\\   /              \\%\\   /                  \\%\\   /\n" +
                    "     ~~~~                 ~~~~                     ~~~~"+"\n");
            System.out.println("You got lucky. You were farming when a military convoy passed through and accidentally dropped supplies.\nYou found lots of food. LOTS of food.");
            daysUntilFoodRunsOut+=10;
        }
        if (x<7){
            System.out.println("                            +&-\n" +
                    "                          _.-^-._    .--.\n" +
                    "                       .-'   _   '-. |__|\n" +
                    "                      /     |_|     \\|  |\n" +
                    "                     /               \\  |\n" +
                    "                    /|     _____     |\\ |\n" +
                    "                     |    |==|==|    |  |\n" +
                    " |---|---|---|---|---|    |--|--|    |  |\n" +
                    " |---|---|---|---|---|    |==|==|    |  |\n" +
                    "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("Shame. You weren't able to get anything off the land.");
            daysUntilFoodRunsOut-=1;
        }
        }
    public void end(){
        Game.x.stop();
        System.out.println("You were not able to survive off what you had. As the hunger panged, you stopped resisting. There was nothing you could have done.");
        dead=true;
        Game.x.setFile("src/gameover.wav");
        Game.x.play();
        Game.slowPrint(14000);
        System.exit(1);
    }
    public void peasantKilled(){
        shot=true;
        System.out.println("You were shot as you attempted to run past the border. You didn't make it very far.");
        dead=true;
    }
    public void escape(){
        int x=(int)(Math.random()*10+1);
        System.out.println("            _\n" +
                "           _( }\n" +
                "          //| \\\n" +
                "       _ _ /`/\\\\\n" +
                "      |- --'\\\\  \n" +
                "            //\n" +
                "            \\)\n");
        if (x==1){
            Game.x.stop();
            escaped=true;
            System.out.println("As you were running, you felt a strange sense of energy. \nYou began to dodge bullets as the border guards began shooting at you. Suddenly, your hands instinctively grabbed a bullet. \nYou threw it back at a guard at 500 miles per second. \nMomentarily distracting the guards with your impossible feat, you were able to steal a car and bust through the border.\n Basically, the only way you escaped was by impossible means.");
            Game.x.setFile("src/victory.wav");
            Game.x.play();
            Game.slowPrint(56000);
        System.exit(0);
        }
        else{
            peasantKilled();
        }
    }
    public void Pray(){
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
        System.out.println("You were caught praying in an atheist state.\nYou were thrown in a work camp.");
        Game.slowPrint(4000);
        System.out.println("================================\n||     ||<(.)>||<(.)>||     || \n||    _||     ||     ||_    ||\n||   (__D     ||     C__)   || \n||   (__D     ||     C__)   ||\n||   (__D     ||     C__)   ||\n||   (__D     ||     C__)   ||\n||     ||     ||     ||     ||\n================================\n");
        Game.slowPrint(4000);
        end();
    }
    public void dig(){
        int x=(int)(Math.random()*10+1);
        if (x>8){
            dead=true;
            System.out.println("     _.-^^---....,,--       \n" +
                    " _--                  --_  \n" +
                    "<                        >)\n" +
                    "|                         | \n" +
                    " \\._                   _./  \n" +
                    "    ```--. . , ; .--'''       \n" +
                    "          | |   |             \n" +
                    "       .-=||  | |=-.   \n" +
                    "       `-=#$%&%$#=-'   \n" +
                    "          | ;  :|     \n" +
                    " _____.,-#%&$@%#&#~,._____");
            System.out.println("While you were digging, you were blown up by a landmine.");
            Game.x.stop();
            Game.x.setFile("src/gameover.wav");
            Game.x.play();
            Game.slowPrint(14000);
        }
        else if (x==8){
            System.out.println("You found human and animal excrement.");
            daysUntilFoodRunsOut--;
        }
        else{
            System.out.println("        ,\n" +
                    "        }`-.   ,          ,\n" +
                    "        \\ \\ '-' \\      .-'{\n" +
                    "        _} .  | ,`\\   /  ' ;    .-;\\\n" +
                    "       {    \\ |    | / `/  '-.,/ ; |\n" +
                    "       { -- -.  '  '`-, .--._.' ;  \\__\n" +
                    "        \\     \\ | '  /  |`.    ;    _,`\\\n" +
                    "         '. '-     ' `_- '.`;  ; ,-`_.-'\n" +
                    "     ,--.  \\    `   /` '--'  `;.` (`  _\n" +
                    "  .--.\\  '._) '-. \\ \\ `-.    ;     `-';|\n" +
                    "  '. -. '         __ '.  ;  ;     _,-' /\n" +
                    "   { __'.\\  ' '-,/; `-'   ';`.- `   .-'\n" +
                    "    '-.  `-._'  | `;     ;`'   .-'`\n" +
                    "      <_ -'   ` .\\  `;  ;     (_.'`\\\n" +
                    "      _.;-\"``\"'-._'. `:;  ___, _.-' |\n" +
                    "  .-'\\'. '.` \\ \\_,_`\\ ;##`   `';  _.'\n" +
                    " /_'._\\ \\  \\__;#####./###.      \\`\n" +
                    " \\.' .'`/\"`/ (#######)###::.. _.'\n" +
                    "  '.' .'  ; , |:.  `|()##`\"\"\"` \n" +
                    "jgs `'-../__/_\\::   /O()()o\n" +
                    "             ()'._.'`()()'");
            System.out.println("You found carrots and other vegetables while digging in a neighboring village's garden.");
            daysUntilFoodRunsOut+=1;
        }
    }
    public void menu(){
        System.out.println("\nWhat will you do? Farm? Starve? Die? All of the above?");
        System.out.println("1. Farm\n2. Escape\n3. Chop Trees\n4. Pray\n5. Dig\n6. Search\n7. Hunt\n8. Give Up");
        System.out.println("Days Until Food Runs Out: " + getDaysUntilFoodRunsOut());
        Scanner t =new Scanner(System.in);
        String answer = t.nextLine();
        if (answer.equals("Farm")||answer.equals("1")){
            farm();
            Game.slowPrint(2000);
        }
        else if (answer.equals("Escape")||answer.equals("2")){
            escape();
            Game.slowPrint(2000);
        }
        else if (answer.equals("Give Up")||answer.equals("8")){
            end();
        }
        else if(answer.equals("Pray")||answer.equals("4")){
            Pray();
        }
        else if (answer.equals("Dig")||answer.equals("5")){
            dig();
            Game.slowPrint(4000);
        }
        else if (answer.equals("Search")||answer.equals("6")){
            int rng=(int)(Math.random()*10+1);
            if (rng>=9) {
                System.out.println("You found a food stash randomly.");
                Game.slowPrint(4000);
                daysUntilFoodRunsOut += 2;
            }
            else if (rng==8){
                System.out.println(".=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-.\n" +
                        "|                     ______                     |\n" +
                        "|                  .-\"      \"-.                  |\n" +
                        "|                 /            \\                 |\n" +
                        "|     _          |              |          _     |\n" +
                        "|    ( \\         |,  .-.  .-.  ,|         / )    |\n" +
                        "|     > \"=._     | )(__/  \\__)( |     _.=\" <     |\n" +
                        "|    (_/\"=._\"=._ |/     /\\     \\| _.=\"_.=\"\\_)    |\n" +
                        "|           \"=._\"(_     ^^     _)\"_.=\"           |\n" +
                        "|               \"=\\__|IIIIII|__/=\"               |\n" +
                        "|              _.=\"| \\IIIIII/ |\"=._              |\n" +
                        "|    _     _.=\"_.=\"\\          /\"=._\"=._     _    |\n" +
                        "|   ( \\_.=\"_.=\"     `--------`     \"=._\"=._/ )   |\n" +
                        "|    > _.=\"                            \"=._ <    |\n" +
                        "|   (_/                                    \\_)   |\n" +
                        "|                                                |\n" +
                        "'-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-='");
                System.out.println("You found the bones of your family.");
            }
            else {
                System.out.println(".=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-.\n" +
                        "|                     ______                     |\n" +
                        "|                  .-\"      \"-.                  |\n" +
                        "|                 /            \\                 |\n" +
                        "|     _          |              |          _     |\n" +
                        "|    ( \\         |,  .-.  .-.  ,|         / )    |\n" +
                        "|     > \"=._     | )(__/  \\__)( |     _.=\" <     |\n" +
                        "|    (_/\"=._\"=._ |/     /\\     \\| _.=\"_.=\"\\_)    |\n" +
                        "|           \"=._\"(_     ^^     _)\"_.=\"           |\n" +
                        "|               \"=\\__|IIIIII|__/=\"               |\n" +
                        "|              _.=\"| \\IIIIII/ |\"=._              |\n" +
                        "|    _     _.=\"_.=\"\\          /\"=._\"=._     _    |\n" +
                        "|   ( \\_.=\"_.=\"     `--------`     \"=._\"=._/ )   |\n" +
                        "|    > _.=\"                            \"=._ <    |\n" +
                        "|   (_/   jgs                              \\_)   |\n" +
                        "|                                                |\n" +
                        "'-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-='");
                System.out.println("You found nothing except the bones of perished villagers.");
                Game.slowPrint(4000);
            }
        }
        else if (answer.equals("Hunt")||answer.equals("7")){
            System.out.println("               ((`\\\n" +
                    "            ___ \\\\ '--._\n" +
                    "         .'`   `'    o  )\n" +
                    "        /    \\   '. __.'\n" +
                    "       _|    /_  \\ \\_\\_\n" +
                    "jgs   {_\\______\\-'\\__\\_\\");
            System.out.println("If there was food running around, don't you think you would have found it by now?\nYour village is literally dying, there are no animals.\nThink, "+Game.getName()+", think!");
            Game.slowPrint(4000);
        }
        else if (answer.equals("Chop Trees")||answer.equals("3")){
            System.out.println("                                               .\n" +
                    "                                   .         ;  \n" +
                    "      .              .              ;%     ;;   \n" +
                    "        ,           ,                :;%  %;   \n" +
                    "         :         ;                   :;%;'     .,   \n" +
                    ",.        %;     %;            ;        %;'    ,;\n" +
                    "  ;       ;%;  %%;        ,     %;    ;%;    ,%'\n" +
                    "   %;       %;%;      ,  ;       %;  ;%;   ,%;' \n" +
                    "    ;%;      %;        ;%;        % ;%;  ,%;'\n" +
                    "     `%;.     ;%;     %;'         `;%%;.%;'\n" +
                    "      `:;%.    ;%%. %@;        %; ;@%;%'\n" +
                    "         `:%;.  :;bd%;          %;@%;'\n" +
                    "           `@%:.  :;%.         ;@@%;'   \n" +
                    "             `@%.  `;@%.      ;@@%;         \n" +
                    "               `@%%. `@%%    ;@@%;        \n" +
                    "                 ;@%. :@%%  %@@%;       \n" +
                    "                   %@bd%%%bd%%:;     \n" +
                    "                     #@%%%%%:;;\n" +
                    "                     %@@%%%::;\n" +
                    "                     %@@@%(o);  . '         \n" +
                    "                     %@@@o%;:(.,'         \n" +
                    "                 `.. %@@@o%::;         \n" +
                    "                    `)@@@o%::;         \n" +
                    "                     %@@(o)::;        \n" +
                    "                    .%@@@@%::;         \n" +
                    "                    ;%@@@@%::;.          \n" +
                    "                   ;%@@@@%%:;;;. \n" +
                    "               ...;%@@@@@%%:;;;;,..  "+"\n");
            System.out.println("Because of North Korea's lumber trade with China, there are no trees.\nYou tried to go lumberjacking but then you forgot trees don't exist.\nYou lose a day of food.");
            Game.slowPrint(6000);
            daysUntilFoodRunsOut--;
        }
        else if (answer.equals("cheat code")){
            daysUntilFoodRunsOut=25;
        }
        else if (answer.equals("orpheus")||answer.equals("Orpheus")){
            Game.secret();
        }
        else {
            menu();
        }
    }
}
