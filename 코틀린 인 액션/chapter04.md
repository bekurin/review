## 4장 클래스, 객체, 인터페이스

### 인터페이스
---
코틀린은 자바와 마찬가지로 인터페이스에 추상 함수 뿐 아니라 기본 함수를 만들 수 있지만 상태를 관리할 수는 없다. 다음은 Clickable과 Focusable 인터페이스를 만들고, Button 클래스를 통해 구현하는 코드이다.

```kotlin
interface Clickable {
	fun click()
	fun showOff() = println("I'm clickable!")
}

interface Focusable {
	fun showOff() = println("I'm focusable!")
}

class Button: Clickable, Focusable {
	override fun click() = println("I was clicked!")
	override fun showOff() {
		super<Clickable>.showOff()
		super<Focusable>.showOff()
	}
}

>> val button: Button = Button()
>> button.click()
>> I was clicked!
>> button.showOff()
>> I'm clickable!
>> I'm focusable!
```

Clickable은 추상 함수 click과 기본 함수 showOff를 제공한다. 여기서 기본 함수는 인터페이스에서 기능이 정의된 함수로 구현 클래스에서 구현을 하지 않아도 된다.

자바에서 인터페이스를 확장하기 위해서는 implements 키워드를 사용하지만 코틀린에서는 클래스 이름 뒤에 :을 붙이고 인터페이스 이름을 적으면 된다.

Clickable과 Focusable은 모두 showOff 라는 기본 함수를 제공한다. 이처럼 인터페이스 같은 이름의 함수를 기본 함수로 제공화면 어떤 함수도 실행되지 않고, 컴파일 에러가 발생한다. 기본 함수로 작성한다고 해서 구현을 무조건 하지 않아도 되는 것은 아니다.

### 변경자
---
> 자바의 클래스와 메서드는 기본적으로 상속에 대해 열려있지만 코틀린의 클래스와 메서드는 기본적으로 final이다.
> kotlin in action p.147

|변경자|설명|
|-|-|
|open|어떤 클래스에서 상속을 허용하고 싶다면 open class *** 처럼 클래스 앞에 open을 붙여야한다.|
|final|코틀린 클래스와 메서드의 기본적 변경자이다.|
|abstract|추상 클래스를 사용하고 싶다면 abstract class *** 처럼 클래스 앞에 abstract를 붙인다. 이때 추상 클래스는 사용성으로 보았을 때 기본적으로 상속을 허용하므로 open 변경자를 붙여주지 않아도 된다. |

자세한 사항은 kotlin in action p.149의 표 4.1 클래스 내에서 상속 제어 변경자의 의미를 참고하자.



### sealed 클래스
---

### 생성자
---

### 클래스 위임 by
---

### object 키워드


