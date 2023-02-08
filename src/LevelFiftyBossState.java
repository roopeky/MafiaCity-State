public class LevelFiftyBossState implements State {
    @Override
    public void steal(LevelState context) {
        System.out.println("Stealing as Level Fifty Boss");
        context.incrementStealCounter();
        context.upgradeLevel();
    }
}
