public interface Priest extends RPGCharacter {
    void friendBuff();

    // คำสั่งเพิ่ม AllStat(ATK,DEF,HP,RunSpeedและ SPDATK) ให้เพื่อนชั่วคราว
    void ward();
    // คำสั่่งเอาไว้ช่วยมองที่ที่มองไม่เห็น หรือศัตรูที่หายตัว
}

