계층형 아키텍쳐와 컨트롤러

스프링 계층형 아키텍쳐(layered architecture)
브라우저가 api 요청을 보냄
컨트롤러가 받음(비즈니스 로직이 x)
service(비즈니스 로직)에게 요청
Dao(data access object)에게 데이터 요청
DB에서 데이터를 꺼내옴

DTO(Data Transfer Object)
데이터 전송 객체

Entity
모든 정보 포함
DB테이블과 매핑이 됨.

컨트롤러 계층. http요청/응답
특정 엔드포인트 요청을 가장 먼저 처리
서비스 계층과 데이터를 주고받음

패키지 계층형 vs 도메인형
계층형은 기능별로
도메인형은 도메인과 관련된 모든 것을 모아둔다.

ResponseEntity의 메서드

- ok().build(): 200 OK, Body 없음, 성공/데이터 불필요
- ok(data): 200 OK, Body에 data, 성공/데이터 반환
- ok().body(data): 200 OK, Body에 data, 위와 동일(명시적)
- created(uri).build(): 201 Created, Body 없음, 생성 성공
- noContent().build(): 204 No Content, Body 없음, 삭제 성공

서비스 계층: 비즈니스 로직
원자성 보장을 위해 트랜잭션 단위로 처리한다.
@transactional으로 처리

jpa: 디비(자바의 orm을 쉽게 사용하기 위한 api)

---

스프링 빈

스프링 어플리케이션 구조
스프링 컨테이너: 스프링 빈 저장소
스프링 빈: 어플리케이션 전역에서 사용할 공용 객체
스프링 컨테이너에 빈을 저장, 필요한 빈을 컨테이너에서 받아 사용한다
빈 등록방법: 설정파일 작성 혹은 컴포넌트 스캔 @component를 붙이면 된다.

---

의존성 주입
내가 의존하는 객체를 직접 생성하지 않고 밖으로부터 주입하는 것
why: 매번 필요한 객체를 생성하는 대신, 생성해 둔 객체를 사용하므로 메모리를 효율적으로 사용
생성자 주입으로 구현한다.
s1)final로 선언 > @autowired
s2)fianl로 추가>@RequiredArgsConstructor로 생성자 추가
