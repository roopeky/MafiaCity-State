public class LevelOneCrookState implements State{
    @Override
    public void steal(LevelState context) {
        System.out.println("Stealing as Level One Crook");
        context.incrementStealCounter();
        context.upgradeLevel();
    }
}
