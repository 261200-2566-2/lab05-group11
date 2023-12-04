public interface Tank extends RPGCharacter {
    void barrier();

    // คำสั่งเสร้างบาเรียป้องกันช่วงเวลาหนึ่งหรือ บาเรียป้องกันได้1,000ดาเมจ
    int FriendDef();
    // คำสั่งเเพิ่มเกาะให้ตัวเองและเพื่อนที่อยู่รอบๆ
    // output คือจำนวนเกราะที่เพิ่มขึ้น
}

