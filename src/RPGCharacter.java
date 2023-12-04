public interface RPGCharacter {
    void status();

    int attack(RPGCharacter enemy);

    void def();

    void decreaseHP(double i);

    void decreaseMana(double i);

    double getCurrentHP();

    String getName();

    double getCurrentMana();

    void friendBuff();

    void ward();

    int friendHealing();

    int resurrect(String nameFriend);
}

