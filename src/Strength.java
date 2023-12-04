public interface Strength extends Assassin, Tank {
    int getAtk(int baseDamage);
    // คำสั่งที่ทำตีแรงขึ้นเป็น 1.75 เท่าของความแรงเดิมช่วงเวลาหนึ่ง
    // output คือ 1.75*baseDamage
}

