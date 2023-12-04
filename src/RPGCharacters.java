public class RPGCharacters implements RPGCharacter {
    protected String name;
    protected double maxHP;
    protected double maxMana;
    protected double baseRunSpeed;
    protected int level;
    protected double currentHP;
    protected double currentMana;

    RPGCharacters (String[] Hero){
        this.name = Hero[0];
        this.maxHP = Double.parseDouble(Hero[1]);
        this.maxMana = Double.parseDouble(Hero[2]);
        this.baseRunSpeed = Double.parseDouble(Hero[3]);
        this.level = 1;
        this.currentHP = maxHP;
        this.currentMana = maxMana;
    }

    public void status() {
        System.out.println("///////////// " + name + " /////////////////");
        System.out.println("Your Level is: " + level);
    }

    @Override
    public int attack(RPGCharacter enemy) {
        return 0;
    }

    public void decreaseHP(double amount) {
        currentHP -= amount;
    }

    @Override
    public void def(){
        System.out.println(name + " ทำการป้องกัน ทำให้ HP " + name + " เหลือ: " + getCurrentHP());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCurrentHP() {
        return currentHP;
    }

    @Override
    public double getCurrentMana() {
        return currentMana;
    }

    @Override
    public void friendBuff() {
        currentHP += 5;
        currentMana += 5;
    }

    @Override
    public void ward() {
        // Implement ward logic here
    }

    @Override
    public int friendHealing() {
        // Implement friendHealing logic here
        return 0;
    }

    @Override
    public int resurrect(String nameFriend) {
        // Implement resurrect logic here
        return 0;
    }

    public void decreaseMana(double amount) {
        currentMana -= amount;
        if (currentMana < 0) {
            currentMana = 0;  // Ensure Mana doesn't go below 0
        }
    }
}
