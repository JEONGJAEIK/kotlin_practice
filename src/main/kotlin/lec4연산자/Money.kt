package lec4연산자

data class Money (val amount : Long) {

    operator fun plus(money : Money) : Money {
        return Money(this.amount + money.amount)
    }
}