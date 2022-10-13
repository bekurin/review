### 코틀린  기초

#### 함수
함수를 최상위 수준에 정의할  수 있다. 
- 클래스 안에 함수를 넣을 필요가 없다.
- 하나의 파일에 함수만 여러 개 정의하는 것도 가능하다.

max 함수 선언 (블록이 본문인 함수)
```kotlin
fun max(a: Int, b: Int): Int {
	return if (a > b) a else b
}
```

여기서 자바와 다른 점이라면 if문의 결과가 바로 함수의 결과로 반환되는 것이다. kotlin in action에서는 이런 방식이 가능한 이유를 if문 statement가 아니라 expression으로 구현됐기 때문이라고 한다.

> - statement: 자신을 둘러싸고 있는 가장 안쪽 블럭의 최상위 요소로 존재하면 아무런 값을 만들어내지 않는다는 차이가 있다.
> - expression: 값을 만들어 내며 다른  식의 하위 요소로 계산에 참여할 수 있다. 
> 
> kotlin in action p.62

max 함수 선언 (식이 본문인 함수)
```kotlin
fun max(a: Int, b: Int): Int = 
	if (a > b) a else b
```

식이 본문이 함수를 사용하면 조금 더 간결하고 함수를 구성할 수 있다.

타입 추론은 컴파일러가 타입을 분석해 프로그래머 대신 프로그램 구성 요소의 타입을 정해주는 기능이다. 코틀린 타입추론을 사용하면 식이 본문이 함수의 반환값을 제거할 수 있다.

max 함수 선언 (식이 본문인 함수 with 타입 추론)
```kotlin
fun max(a: Int, b: Int) = 
	if (a > b) a else b
```

이때 유의해야할 점은 식이 본문인 함수에 한해서만 컴파일러가 타입 추론을 진행한다는 것이다. 블록이 본문인 함수에서 반환 타입을 지정하지 않으면 컴파일 에러가 발생한다.

🥕 협업의 관점에서 보았을 때 타입 추론은 개발자가 코드를 해석하는 시간을 많이 사용하게 만들 수 있다고 생각한다. 따라서 식이 본문인 함수에도 타입을 명시하는 것이 좋을 것 같다.

#### 변수
변수 선언 시 사용하는 키워드는 다음과 같다.

> - val(값을 뜻하는 Value에서 따옴) - 변경 불가능한 참조를 저장하는 변수다.
> - var(변수를 뜻하는 Variable에서 따옴) - 변경 가능한 참조다.
> 
> kotlin in action p.65

var는 변경이 가능하기 때문에 상태 값 관리를 할 때에 이점이 많아 보인다. 하지만 var는 사용하면 사용할 수록 프로젝트가 관리하기 어려워진다. 프로그래머의 실수로 변경되면 안되는 값이 변경될 수도 있고, 비동기 처리 간에 순서가 잘못되어 예상하지 못한 값이 반환될 수도 있다.

따라서 기본적으로 모든 변수를 val로 선언하여 사용하다가 변경이 필요한 부분이 있다면 충분한 검토 후에 var로 변경하는 것이 좋다고 생각된다.

변수 선언(일반, 타입추론)
```kotlin
val age = 25
val age: Int = 25
```

변수 또한 타입 추론을 지원한다. 하지만 가독성과 다른 프로그래머와 협업을 생각하면 타입은 항상 명시하는 것이 좋다고 생각된다.

코틀린은 또한 문자열 템플릿 기능을 제공한다.
helloName(문자열 템플릿)
```kotlin
fun helloName(name: String) {
	println("Hello, $name!")
}

>> helloName("hangman")
>> Hello, hangman!
```

코드에서 확인할 수 있지만 문자열 템플릿은 문자열 생성에 있어 엄청난 편의를 제공해준다. 기존에 자바로 해당 함수를 구현하려면 "Hello, " + name + "!" 과 같이 +와 ""를 많이 사용해야했다.

java
```java
void helloName(String name) {
	System.out.println("Hello, " + name + "!");
}

>> helloName("hangman")
>> Hello, hangman!
```

🥕 문자열 템플릿을 사용하게 되면 shift를 더 오랫동안 쓸 수 있을 것이다. 

#### 클래스
같은 기능을 하는 클래스를 자바와 코틀린을 사용하여 구현해보겠다.

```java
public class Person {
	private final String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
```

Person 클래스에 생성자와 변수 name에 대한 getter 함수가 구현되어 있다. 헤당 클래스를 코틀린으로 변경하면 다음과 같다.

```kotlin
class Person(
	val name: String
)
```

1줄로 표현할 수 있지만 변수 목록을 빠르게 식별하기 위해 줄바꿈을 해서 3줄로 늘었다. 완벽하게 같은 기능을 하는 클래스라면 생성자와 getter는 어디에 정의되어 있을까?

코틀린에서 클래스 선언 시 () 안에 들어있는 값들에 대해서 기본 생성자를 제공해준다. 또한 변수 키워드 val, var에 따라서 val는 getter, var는 getter와 setter를 만들어 준다.

🥕 참조에 따라 getter 또는 setter를 만들어주는 기능은 변수의 목적을 휠씬 잘 표현하는 것 같다.

#### 프로퍼티
프로퍼티는 필드와 접근자를 한데 묶는 개념을 말한다.

-- p.72 많구만