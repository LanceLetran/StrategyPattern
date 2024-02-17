public class MainApp {
    public static void main(String[] args) {
        Character knight = new Knight();
        Character wizard = new Wizard();
        Character archer = new Archer();

        knight.performAttack();
        knight.performDefend();

        wizard.performAttack();
        wizard.performDefend();

        archer.performAttack();
        archer.performDefend();
    }
}