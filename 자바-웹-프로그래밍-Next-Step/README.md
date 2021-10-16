## 자바 웹 프로그래밍 Next Step

<img src="https://github.com/piaochung/review/blob/main/%EC%9E%90%EB%B0%94-%EC%9B%B9-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-Next-Step/images/%EC%9E%90%EB%B0%94-%EC%9B%B9-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-Next-Step.jpg" width="300">

Spring mvc을 공부하면서 그 구조를 자세하게 이해하는 것이 중요하다고 생각하여 책을 읽기 시작했다.

### 공부하는 방법
- 3단계 공부법

---

### httpServlet의 구조
- Http Header
- Http Body
- GET, POST
- Refactoring

---

### MVC 프레임워크 구현
#### 세션과 쿠키
 세션과 쿠키에 대한 오해를 가지고 있었다. 바로 세션과 쿠키가 완전히 독립적인 기능으로 생각했던 것이다. 다음은 세션과 쿠키의 공통점과 차이점이다.
- 공통점: http의 cookie를 사용하여 구현한다.
- 차이점: 쿠키는 클라이언트에 데이터를 저장한다. 세션은 웹 서버에 데이터를 저장한다.

차이점에 대해서 조금 더 자세하게 보면 쿠키의 경우 클라이언트에게 데이터를 직접 전송해주어 F12 개발자 모드를 통해서도 값을 확인할 수 있다. 하지만 세션의 경우 값을 서버에 저장해놓고 토큰을 만들어주어 토큰을 바탕으로 값을 확인한다. 따라서 세션은 보안이 취약한 쿠키의 단점을 보안한 것이다.

---

- FrontController Pattern
- DB 사용하여 데이터 영구 저장
- AJAX를 사용하여 데이터 갱신
- 프레임워크 점진적 개선
- DI 의존성 주입을 통한 테스트 코드 작성

---

### 프로젝트: summer: webframework

많은 기능을 제공해주어 개발자의 봄이 찾아았다고 이름이 지어진 spring과는 다르게 조금 서툰 spring을 구현하기 위한 프로젝트이다. summer는 덥고 힘들기 때문에 spring 모든 기능보다는 핵심적인 구조와 기능을 선택하여 개발할 것 이다.
