package lec13중첩

import com.lannstark.lec13.JavaHouse

fun main() {

}

// 클래스안에 클래스가 있는 경우는 두 가지
// 자바 기준 스태틱을 사용하는 lec9클래스
// 자바 기준 스태틱을 사용하지 않는 lec9클래스
// 권장되는 클래스는 스태틱을 사용하는 lec9클래스

// 코틀린에서는 이러한 가이드를 따름 lec9클래스 안에 기본클래스 생성하면 바깥클래스 참조가 없음
// 바깥 lec9클래스 참조하고 싶다면 inner 키워드 붙여야 함
// 코틀린 이너 클래스에서 바깥 lec9클래스 참조하려면 this@바깥클래스 사용

// 자바의 static lec13중첩 lec9클래스 (권장도는 lec9클래스 안의 lec9클래스)
// 기본적으로 코틀린은 바깥 클래스에 대한 연결이 없는 lec13중첩 클래스가 만들어짐
class House(
    private val address: String,
    private val livingRoom: JavaHouse.LivingRoom,
) {
    class LivingRoom(
        private val area: Double
    )
}