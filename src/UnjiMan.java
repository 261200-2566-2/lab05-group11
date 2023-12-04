public interface UnjiMan extends Heal {
    int resurrect(String nameFriend);
    // คำสั่งชุบชีวิตเพื่อนที่ตายไปแล้ว
    // input คือที่เพื่อนที่จะทำการชุบชีวิต
    // output คือ เลือดเพื่อนที่จะเพิ่มขึ้นมา0.4เท่าของmaxHPของเพื่อน
}