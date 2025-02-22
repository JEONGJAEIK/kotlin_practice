package lec14다양한클래스

// sealed lec9클래스 when과 주로 사용됨 하위 클래스를 제한하지만 enum 클래스보다 유연함
// 상속이 가능하도록 추상클래스 만들고 싶은데 외부에서는 이 lec9클래스 lec10상속 안 받을때 쓰는거
// 컴파일 때 하위 lec9클래스 lec3타입 기억 런타임 때 lec9클래스 lec3타입 추가 불가
// 하위 클래스는 같은 패키지에 있어야함

// Enum과 다른 점
// 클래스를 상속받을 수 있음 하위 클래스는 멀티 인스턴스가 가능

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grandeur : HyundaiCar("그렌저", 3_000L)