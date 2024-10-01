import java.util.*;
public class Main {
    public static void main(String[] args){

        ArrayList<Integer> arraylist= new ArrayList<Integer>();
        arraylist.add(23);
        arraylist.add(90);
        arraylist.add(2);
        arraylist.add(54);
        arraylist.add(4);
        arraylist.add(45);
        arraylist.add(54);
        arraylist.add(34);
        arraylist.add(12);
        arraylist.add(13);
        Game.mergeArrListSort(arraylist,0,9);
        System.out.println(arraylist);
        System.out.println();
        ArrayList<Integer> car = new ArrayList<Integer>(10);
     for (int x=0; x<10;x++){
         car.add(0);
     }
        int[] test = new int[10];
        for (int x=0; x<10; x++){
            test[x]=x+12;
            System.out.println(test[x]);
        }
        int[] ahh= new int[8];
        ahh[0]=23;
        ahh[1]=2;
        ahh[2]=24;
        ahh[3]=56;
        ahh[4]=12;
        ahh[5]=27;
        ahh[6]=4;
        ahh[7]=24;
        System.out.println("\n");
        System.out.println(Game.recBinarySearch(test,0,10, 15));
        System.out.println();
        Game.mergeSort( ahh,8);
        for (int i=0; i<8; i++){
            System.out.println(ahh[i]);
        }
        System.out.println();
        Elite requirementObject = new Peasant(5,true);
        String[] array = new String[9];
        NorthKorean player = new Peasant();
        Peasant required = new Peasant();
        Elite requiredTwo = new Elite();
        Heir requiredThree = new Heir();
        ArrayList<NorthKorean> arraylistRequirement=new ArrayList<NorthKorean>();
        arraylistRequirement.add(required);
        arraylistRequirement.add(requiredTwo);
        arraylistRequirement.add(requiredThree);
        required.method1(required);
        player.classGamble();
        NorthKorean[] requirement = new NorthKorean[3];
        requirement[0]=required;
        requirement[1]=requiredTwo;
        requirement[2]=requiredThree;
        //array of superclass populated with subclass objects
        System.out.println(Game.stringArraySegmentLength(array,8));
        for (int x=0; x<8;x++){
            System.out.println(array[x]);
        }
        System.out.println(Game.arraylistRecursion(car, 8));
        System.out.println(car);

        System.out.println("Printing stats for no reason...");
        for (int x=0; x<2; x++){
            System.out.println(requirement[x]);
        }
        System.out.println("\nPrinting the same thing but as an arraylist to fulfill that sweet sweet requirement list...");
        for (int x=0; x<2; x++){
            System.out.println(arraylistRequirement.get(x));
        }
        System.out.println("\n");
        Game.congruence();

        Game.checkStatus(player);
        Game.initializeGame(player);

        if (Game.level==1){
            Game.x.setFile("src/Secunda.wav");
            Game.x.play();
            for (int x=player.getDaysUntilFoodRunsOut(); x>-1; x--){
                if (player.getDead()) player.setDaysUntilFoodRunsOut(-1);
                x=player.getDaysUntilFoodRunsOut();
                player.act();
                if(player.getApprove()==true){
                    player=(Elite)player;
                    break;
                }
                if (player.getDaysUntilFoodRunsOut()==0) {

                    player.end();

                }
                if (player.getDead()!=true&&player.getDaysUntilFoodRunsOut()<=-1) {

                    player.end();
                }
                //System.out.println(x);
                Game.checkStatus(player);
            }
            Game.x.stop();
        }

        if (Game.level==2){

            Game.x.setFile("src/Where Are You, Dear General.wav");
            Game.x.play();
            System.out.println("\n");
            System.out.println("        /\\ \\ \\ \\/_______/     ______/\\      \\  /\\ \\/ /\\ \\/ /\\  \\_____________\n" +
                    "        /\\ \\ \\ \\/______ /     /\\    /:\\\\      \\ ::\\  /::\\  /::\\ /____  ____ __\n" +
                    "       /\\ \\ \\ \\/_______/     /:\\\\  /:\\:\\\\______\\::/  \\::/  \\::///   / /   //\n" +
                    "      /\\ \\ \\ \\/_______/    _/____\\/:\\:\\:/_____ / / /\\ \\/ /\\ \\///___/ /___//___\n" +
                    "_____/___ \\ \\/_______/    /\\::::::\\\\:\\:/_____ / \\ /::\\  /::\\ /____  ____  ____\n" +
                    "         \\ \\/_______/    /:\\\\::::::\\\\:/_____ /   \\\\::/  \\::///   / /   / /   /\n" +
                    "          \\/_______/    /:\\:\\\\______\\/______/_____\\\\/ /\\ \\///___/ /___/ /_____\n" +
                    "\\          \\______/    /:\\:\\:/_____:/\\      \\ ___ /  /::\\ /____  ____  _/\\::::\n" +
                    "\\\\__________\\____/    /:\\:\\:/_____:/:\\\\      \\__ /_______/____/_/___/_ /  \\:::\n" +
                    "//__________/___/   _/____:/_____:/:\\:\\\\______\\ /                     /\\  /\\::\n" +
                    "///\\          \\/   /\\ .----.\\___:/:\\:\\:/_____ // \\                   /  \\/  \\:\n" +
                    "///\\\\          \\  /::\\\\ \\_\\ \\\\_:/:\\:\\:/_____ //:\\ \\                 /\\  /\\  /\\\n" +
                    "//:/\\\\          \\//\\::\\\\ \\ \\ \\\\/:\\:\\:/_____ //:::\\ \\               /  \\/  \\/+/\n" +
                    "/:/:/\\\\_________/:\\/:::\\`----' \\\\:\\:/_____ //o:/\\:\\ \\_____________/\\  /\\  / /\n" +
                    ":/:/://________//\\::/\\::\\_______\\\\:/_____ ///\\_\\ \\:\\/____________/  \\/  \\/+/\\\n" +
                    "/:/:///_/_/_/_/:\\/::\\ \\:/__  __ /:/_____ ///\\//\\\\/:/ _____  ____/\\  /\\  / /  \\\n" +
                    ":/:///_/_/_/_//\\::/\\:\\///_/ /_//:/______/_/ :~\\/::/ /____/ /___/  \\/  \\/+/\\  /\n" +
                    "/:///_/_/_/_/:\\/::\\ \\:/__  __ /:/____/\\  / \\\\:\\/:/ _____  ____/\\  /\\  / /  \\/\n" +
                    ":///_/_/_/_//\\::/\\:\\///_/ /_//:/____/\\:\\____\\\\::/ /____/ /___/  \\/  \\/+/\\  /\\\n" +
                    "///_/_/_/_/:\\/::\\ \\:/__  __ /:/____/\\:\\/____/\\\\/____________/\\  /\\  / /  \\/  \\\n" +
                    "//_/_/_/_//\\::/\\:\\///_/ /_//::::::/\\:\\/____/  /----/----/--/  \\/  \\/+/\\  /\\  /\n" +
                    "/_/_/_/_/:\\/::\\ \\:/__  __ /\\:::::/\\:\\/____/ \\/____/____/__/\\  /\\  / /  \\/  \\/_\n" +
                    "_/_/_/_//\\::/\\:\\///_/ /_//\\:\\::::\\:\\/____/ \\_____________/  \\/  \\/+/\\  /\\  /\n" +
                    "/_/_/_/:\\/::\\ \\:/__  __ /\\:\\:\\::::\\/____/   \\ _ _ _ _ _ /\\  /\\  / /  \\/  \\/___\n" +
                    "_/_/_//\\::/\\:\\///_/ /_//\\:\\:\\:\\              \\_________/  \\/  \\/+/\\  /\\  /   /\n" +
                    "/_/_/:\\/::\\ \\:/__  __ /\\:\\:\\:\\:\\______________\\       /\\  /\\  / /  \\/  \\/___/_\n" +
                    "_/_//\\::/\\:\\///_/ /_//::\\:\\:\\:\\/______________/      /  \\/  \\/+/\\  /\\  /   /\n" +
                    "/_/:\\/::\\ \\:/__  __ /::::\\:\\:\\/______________/\\     /\\  /\\  / /  \\/  \\/___/___\n" +
                    "_//\\::/\\:\\///_/ /_//:\\::::\\:\\/______________/  \\   /  \\/  \\/+/\\  /\\  /   /   /\n" +
                    "/:\\/::\\ \\:/__  __ /:\\:\\::::\\/______________/    \\ /\\  /\\  / /  \\/  \\/___/___/\n" +
                    "/\\::/\\:\\///_/ /_//:\\:\\:\\                         \\  \\/\\\\\\/+/\\  /\\  /   /   /+/\n" +
                    "\\/::\\ \\:/__  __ /:\\:\\:\\:\\_________________________\\ ///\\\\\\/  \\/  \\/___/___/ /_\n" +
                    "::/\\:\\///_/ /_//:\\:\\:\\:\\/_________________________////::\\\\\\  /\\  /   /   /+/\n" +
                    "::\\ \\:/__  __ /:\\:\\:\\:\\/_________________________/:\\/____\\\\\\/  \\/___/___/ /___\n" +
                    "/\\:\\///_/ /_//:\\:\\:\\:\\/_________________________/:::\\    /\\/\\  /   /   /+/   /\n" +
                    "\\ \\:/__  __ /:\\:\\:\\:\\/_________________________/:::::\\  ///  \\/___/___/ /___/_\n" +
                    ":\\///_/ /_//:\\:\\:\\:\\/_________________________/:\\:::::\\///\\  /   /  __________\n" +
                    "\\:/__  __ /:\\:\\:\\:\\/_________________________/:::\\:::::\\/  \\/___/__/\\\n" +
                    "///_/ /_//:\\:\\:\\:\\/_________________________/:\\:::\\:::::\\  /   /  /::\\\n" +
                    "/__  __ /\\::\\:\\:\\/_________________________/_____::\\:::::\\/___/__/:/\\:\\\n" +
                    "/_/ /_//::\\::\\:\\/_____________________/\\/_/_/_/_/\\  \\           /::\\ \\:\\\n" +
                    "_  __ /:\\::\\:8\\/_____________________/\\/\\   /\\_\\\\/\\  \\ 8       /:/\\:\\ \\:\\\n" +
                    "/ /_//\\     \\|______________________//\\\\/\\::\\/__\\\\/\\  \\|______/::\\ \\:\\ \\:\\\n" +
                    " __ /  \\  \\                        /:\\/:\\/\\_______\\/\\        /:/\\:\\ \\:\\/::\\\n" +
                    "/_//    8      -8  --  --  --  -- //\\::/\\\\/_/_/_/_/_/ --  --/::\\ \\:\\ \\::/\\:\\\n" +
                    "_ /     |\\  \\   |________________/:\\/::\\///__/ /__//_______/:/\\:\\ \\:\\/::\\ \\:\\\n" +
                    "__________\\     \\               //\\::/\\:/___  ___ /       /::\\ \\:\\ \\::/\\:\\ \\:\\\n" +
                    "::::::::::\\\\  \\  \\             /:\\/::\\///__/ /__//       /:/\\:\\ \\:\\/::\\ \\:\\ \\:\n");
            System.out.println();
            Game.slowPrint(5000);
            System.out.println("\nWelcome to the world of elites! There's not much you can do wrong here, just don't do anything stupid.\nOr you can just ignore what I said and take unnecessary risks...\nDON'T. Start. A coup.");
            Game.slowPrint(4000);
            NorthKorean player2=new Elite();


           while (player2.getRich()&&player2.getFavored()&&player2.getOld()==false&&player2.getCoupSuccess()==false&&player2.getGood()==false){
               player2.act();
           }
           if (player2.getCoupSuccess()==true){
               Game.x.stop();
               Game.level=3;
           }
           else if (player2.getGood()){
               Game.x.stop();
               Game.x.setFile("src/victory.wav");
               Game.x.play();
               System.out.println("You would never return to your homeland.\nYou live happily elsewhere.\nIf I knew, I would have to report you and drag you back, so it's best I don't.");
               Game.slowPrint(57000);
           }
           else {
               Game.x.stop();
               Game.x.setFile("src/gameover.wav");
               Game.x.play();
               System.out.println("You died.");
               Game.slowPrint(27000);
           }
            Game.x.stop();
        }
        if (Game.level==3){
            Game.x.setFile("src/russian kirby.wav");
            Game.x.play();
            NorthKorean player3=new Heir();
            System.out.println("               )\\         O_._._._A_._._._O         /(\n" +
                    "                \\`--.___,'=================`.___,--'/\n" +
                    "                 \\`--._.__                 __._,--'/\n" +
                    "                   \\  ,. l`~~~~~~~~~~~~~~~'l ,.  /\n" +
                    "       __            \\||(_)!_!_!_.-._!_!_!(_)||/            __\n" +
                    "       \\\\`-.__        ||_|____!!_|;|_!!____|_||        __,-'//\n" +
                    "        \\\\    `==---='-----------'='-----------`=---=='    //\n" +
                    "        | `--.                                         ,--' |\n" +
                    "         \\  ,.`~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~',.  /\n" +
                    "           \\||  ____,-------._,-------._,-------.____  ||/\n" +
                    "            ||\\|___!`=======\"!`=======\"!`=======\"!___|/||\n" +
                    "            || |---||--------||-| | |-!!--------||---| ||\n" +
                    "  __O_____O_ll_lO_____O_____O|| |'|'| ||O_____O_____Ol_ll_O_____O__\n" +
                    "  o H o o H o o H o o H o o |-----------| o o H o o H o o H o o H o\n" +
                    " ___H_____H_____H_____H____O =========== O____H_____H_____H_____H___\n" +
                    "                          /|=============|\\\n" +
                    "()______()______()______() '==== +-+ ====' ()______()______()______()\n" +
                    "||{_}{_}||{_}{_}||{_}{_}/| ===== |_| ===== |\\{_}{_}||{_}{_}||{_}{_}||\n" +
                    "||      ||      ||     / |==== s(   )s ====| \\     ||      ||      ||\n" +
                    "======================()  =================  ()======================\n" +
                    "----------------------/| ------------------- |\\----------------------\n" +
                    "                     / |---------------------| \\\n" +
                    "-'--'--'           ()  '---------------------'  ()\n" +
                    "                   /| ------------------------- |\\    --'--'--'\n" +
                    "       --'--'     / |---------------------------| \\    '--'\n" +
                    "                ()  |___________________________|  ()           '--'-\n" +
                    "  --'-          /| _______________________________  |\\\n" +
                    " --'           / |__________________________________| \\"+"\n");
            Game.slowPrint(5000);
            while (player3.getResigned()==false&&player3.getDeposed()==false&&player3.getEscaped()==false) {
                player3.act();
            }
            if (player3.getEscaped()) {System.out.println("North Korean leader "+ Game.getName()+ " has gone missing! State is in turmoil and distress.\nNow back to the Saturday night news...");
            System.out.println("   o                   o\n" +
                    "    \\               __/\n" +
                    "     \\___          /\n" +
                    "         \\__    __/\n" +
                    "            \\  /\n" +
                    " ____________\\/____________\n" +
                    "/   ____________________   \\\n" +
                    "|  /__/  \\__   \\__/  \\__\\  |\n" +
                    "| |    __   \\__    __   \\| |\n" +
                    "| |\\__/  \\__   \\__/  \\__ | |\n" +
                    "| |    __   \\__    __   \\| |\n" +
                    "| |\\__/  \\__   \\__/  \\__ | |\n" +
                    "| |    __   \\__    __   \\| |\n" +
                    "| |\\__/  \\__   \\__/  \\__ | |\n" +
                    "| |    __   \\__    __   \\| |\n" +
                    "| |\\__/  \\__   \\__/  \\__ | |\n" +
                    "|  \\________\\___________/  |\n" +
                    "|                 _   _    |\n" +
                    "|  prs           (|) (/)   |\n" +
                    "\\_________________________/\n" +
                    "    \"--\"           \"--\"");
            }
            if (player3.getDeposed()) player3.end();
            if (player3.getResigned()) {
                System.out.println("   o                   o\n" +
                        "    \\               __/\n" +
                        "     \\___          /\n" +
                        "         \\__    __/\n" +
                        "            \\  /\n" +
                        " ____________\\/____________\n" +
                        "/   ____________________   \\\n" +
                        "|  /__/  \\__   \\__/  \\__\\  |\n" +
                        "| |    __   \\__    __   \\| |\n" +
                        "| |\\__/  \\__   \\__/  \\__ | |\n" +
                        "| |    __   \\__    __   \\| |\n" +
                        "| |\\__/  \\__   \\__/  \\__ | |\n" +
                        "| |    __   \\__    __   \\| |\n" +
                        "| |\\__/  \\__   \\__/  \\__ | |\n" +
                        "| |    __   \\__    __   \\| |\n" +
                        "| |\\__/  \\__   \\__/  \\__ | |\n" +
                        "|  \\________\\___________/  |\n" +
                        "|                 _   _    |\n" +
                        "|  prs           (|) (/)   |\n" +
                        "\\_________________________/\n" +
                        "    \"--\"           \"--\"");
                System.out.println();
                System.out.println("BREAKING NEWS: North Korean leader "+Game.getName()+" has resigned!\nElection results announced after civil war!");}
            Game.x.stop();
            Game.x.setFile("src/duel of fates.wav");
            Game.x.play();
            Game.slowPrint(16000);
        }
    }
}
