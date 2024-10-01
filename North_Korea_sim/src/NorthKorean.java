public class NorthKorean {
    int money;
    private String status;
    boolean dangerOfExile;
    public boolean escaped;
    private int daysUntilFoodRunsOut;
    private boolean dead;
    private boolean rich;
    private boolean approvedElite=false;
    private boolean favoredByGreatLeader;
    private boolean old=false;
    private boolean goodEscape=false;
    public boolean getOld(){
        return old;
    }
    public boolean getFavored(){
        return favoredByGreatLeader;
    }
    public NorthKorean() {
        money = 0;
        dangerOfExile = false;
        status = "Peasant";
        escaped = false;
    }
    public boolean getResigned(){
        return false;
    }
    public boolean getDeposed(){
        return false;
    }
    public void method1(NorthKorean n){
        favoredByGreatLeader=true;
        dangerOfExile= (!n.getRich()&&!n.getFavored());
    }
    public boolean getCoupSuccess(){
        System.out.println("Why would you hurt our dear leader?");
        return false;
    }
    public NorthKorean(boolean dead){
        this.dead=dead;
    }
    public boolean getEscaped(){
        return escaped;
    }
    public void dig(){
        System.out.println("You found nothing.");
    }
    public void escape(){
        System.out.println("There is no escape.");
    }
    public void coup(){
        System.out.println("You will never overthrow the Great Leader!");
    }
    public boolean getApprove(){
        return approvedElite;
    }
    public boolean getDead(){
        return dead;
    }

    public NorthKorean( int x, boolean y, String z){
            money = x;
            status = z;
            dangerOfExile = y;
        }
        public String getStatus () {
            return status;
        }
        public void Pray(int seconds){
        System.out.println("If there was a God, you wouldn't be in North Korea.\nYou prayed for " + seconds + " seconds and then quickly hid your sacrilege.");
    }

        public void classGamble () {
            int variable = (int) (Math.random() * 10 + 1);
            if (variable <= 2) status = "Pyongyang Elite";
            else if (variable <= 8 && variable > 2) status = "Peasant";
            else if (variable >= 9) status = "Heir to the Great Leader";
        }
        public void act () {
//
        }
        public boolean getGood(){
        System.out.println("There is no good escape.");
            return goodEscape;
        }
        public boolean getRich(){
            return rich;
        }
    public void setDaysUntilFoodRunsOut(int x){
        daysUntilFoodRunsOut=x;
    }
    public void end(){
        System.out.println("It's all ogre.");
    }
        public String toString () {
            return "Money: " + money + "\nDanger of Exile: " + dangerOfExile + "\nStatus: " + status;
        }
        public void menu () {
            System.out.println("what would you like to do?");
        }
    public int getDaysUntilFoodRunsOut(){
        return daysUntilFoodRunsOut;
    }
    }

