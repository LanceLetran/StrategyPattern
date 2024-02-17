public class Wizard implements Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Wizard() {
        this.attackStrategy = new CastSpell();
        this.defenseStrategy = new CreateMagicBarrier();
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefend() {
        defenseStrategy.defend();
    }
}

