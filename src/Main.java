public class Main {
//    String[] nameHero = ["nameHero", "baseHP", "baseMana", "baseRunSpeed"];
    static String[] unjiMan = {"UnjiMan", "100", "60", "10"};
    static String[] spermMan = {"SpermMan", "110", "50", "10"};
    static String[] pennisMan = {"PennisMan", "90", "70", "12"};

//    String[] nameSword = {"NameEquip", "Damage", "RunSpeedDecrease"};
    static String[] sword = {"sword", "25", "-1"};
    static String[] dagger = {"dagger", "20", "-0.6"};
    static String[] knife = {"knife", "15", "-0.3"};

//    String[] nameShield = {"NameEquip", "Def", "RunSpeedDecrease"};
    static String[] shield = {"shield", "10", "-2"};
    static String[] pan = {"pan", "5", "-1"};

    public static void main(String[] args) {
        Equipment hero = new Equipment(unjiMan, sword, shield);

        Equipment enemy = new Equipment(spermMan, dagger, pan);

        enemy.status();
        enemy.emoteHulk();
        enemy.status();

    }
}