package `lec11접근 제어`

class StringUtils {

    // Java public = 코틀린 동일
    // Java protected 같은 패키지 또는 하위 클래스에서 접근 가능 vs 코틀린 protected 선언된 lec9클래스 또는 하위 lec9클래스 에서 접근 가능
    // Java default 같은 패키지에서 접근 가능 vs 코틀린 internal 같은 모듈에서 접근 가능
    // Java Private 선언된 lec9클래스 내에서 접근 가능 = 코틀린 동일
    // 코틀린은 패키지라는 것을 접근 제어에 사용하지 않음
    // Java 기본 접근 지시어 디폴트 vs 코틀린 기본 접근 지시어 퍼블릭

    // 코틀린 파일
    // public 기본값 어디서든 접근 가능
    // protected 파일에는 사용 불가
    // internal 같은 모듈에서 접근 가능
    // private 같은 파일 내에서 접근 가능

    // 코틀린 생성자에 접근 지시어 붙이려면 constructor 꼭 써줘야 함

    // 자바와 코틀린 같이 쓸 때 주의할 점
    // Internal은 바이트 코드 상 퍼블릭이 됨 때문에 자바에서는 코틀린 모듈의 인터널 코드를 가져올 수 있음
    // 자바와 코틀린의 protected는 다르기 때문에 자바는 같은 패키지의 코틀린 프로텍티드 멤버에 접근 가능
}