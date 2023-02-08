public class LevelState {
    private State currentState;
    private int stealCounter;

    public LevelState() {
        currentState = new LevelOneCrookState();
        stealCounter = 0;
    }

    public void steal() {
        currentState.steal(this);
    }

    public void upgradeLevel() {
        if (stealCounter >= 3) {
            if (currentState instanceof LevelOneCrookState) {
                currentState = new LevelFiftyBossState();
                stealCounter = 0;
                System.out.println("Crook upgraded to LevelFiftyBoss");
            } else if (currentState instanceof LevelFiftyBossState) {
                currentState = new LevelHundredKingpinState();
                stealCounter = 0;
                System.out.println("Crook upgraded to LevelHundredKingpin");
            }
        }
    }
    public void incrementStealCounter() {
        stealCounter++;
    }

    public int getStealCounter() {
        return stealCounter;
    }
}
