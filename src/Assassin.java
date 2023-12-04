public interface Assassin extends RPGCharacter {
    int lostWeight();

    // คำสั่งทำที่ทำให้ตัวเบา 10 วินาที
    // output คือน้ำหนักตัวที่ลดลง
    int fastAttack();
    // คำสั่งโจมตีรัวและเร็ว
    // output คือดาเมจที่โจมตี*3
}
