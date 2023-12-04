public class Equipment extends RPGCharacters {
    private String nameSword;
    private double swordBaseDamage;
    private double runSpeedDecreaseSword;
    private double swordDamage;
    private int levelSword;

    private String nameShield;
    private double shieldBaseDef;
    private double runSpeedDecreaseShield;
    private double shieldDef;
    private int levelShield;

    private double runSpeed;

    public Equipment(String[] hero, String[] sword, String[] shield) {
        super(hero);

        this.nameSword = sword[0];
        this.swordBaseDamage = Double.parseDouble(sword[1]);
        this.runSpeedDecreaseSword = Double.parseDouble(sword[2]);
        this.levelSword = 1;

        this.nameShield = shield[0];
        this.shieldBaseDef = Double.parseDouble(shield[1]);
        this.runSpeedDecreaseShield = Double.parseDouble(shield[2]);
        this.levelShield = 1;
    }

    @Override
    public void status() {
        update();
        super.status();
        System.out.println("Your HP is: " + currentHP);
        System.out.println("Your Mana is: " + currentMana);
        System.out.println("Your Move Speed is: " + runSpeed);
        System.out.println("Your Damage: " + swordDamage);
        System.out.println("Your Defense: " + shieldDef);
        System.out.println("///////////////////////////////////////////");
    }

    private void update() {
        swordDamage = swordBaseDamage * (1 * (0.1 + levelSword));
        shieldDef = shieldBaseDef*(0.8+ 0.05*levelShield);
        runSpeed = baseRunSpeed + runSpeedDecreaseSword + runSpeedDecreaseShield;
    }

    public void statusEquipment() {
        System.out.println("///////////// " + name + " /////////////////");
        System.out.println("Equipped Sword: " + nameSword);
        System.out.println("Sword Level: " + levelSword);
        System.out.println("Sword Damage: " + swordBaseDamage);
        System.out.println("Sword Run Speed Decrease: " + runSpeedDecreaseSword);

        System.out.println("Equipped Shield: " + nameShield);
        System.out.println("Shield Level: " + levelShield);
        System.out.println("Shield Defense: " + shieldBaseDef);
        System.out.println("Shield Run Speed Decrease: " + runSpeedDecreaseShield);
        System.out.println("///////////////////////////////////////////");
    }

    @Override
    public int attack(RPGCharacter enemy) {
        decreaseMana(3);
        enemy.decreaseHP(swordDamage);
        System.out.println(name + " attacks " + enemy.getName());
        System.out.println("This reduces " + enemy.getName() + "'s HP to: " + enemy.getCurrentHP());
        return 0;
    }

    public void def() {
        decreaseMana(3);
        decreaseHP(-shieldDef);
        System.out.println(name + " defends, reducing HP to: " + getCurrentHP());
    }
}
