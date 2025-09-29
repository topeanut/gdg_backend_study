url
host와 port로 나누어진다.
host는 ip주소이나, 도메인으로 사용.

http, https : scheme = protocol
http 프로토콜
무상태성: 이전 요청을 저장하지 않고, 매 요청을 독립적 처리
비연결성: 응답을 받은 후 서버와 연결을 유지하지 않음.

http request
start link: 요청 메서드
get post put(덮어쓰기, 없으면 생성. 전체 수정) patch(일부 수정)) delete
header: 요청에 대한 부가 정보
body: 실제로 전송한 데이터

http response
status line: 상태 코드, 상태 메세지
header
body

rest api
resource: 고유한 아이디를 가진다.
행위 verb: http 메서드를 사용
persentation: json형식

Path parameter = Path variable = Route parameter

API 명세서

회원 기능

1. 회원 등록
   POST
   /members

2. 회원 목록 조회
   GET
   /members

3. 회원 상세 조회
   GET
   /members/{memberId}

4. 회원 정보 수정
   PATCH
   /members/{memberId}

5. 회원 삭제
   DELETE
   /members/{memberId}

상품 기능

1. 상품 정보 등록
   POST
   /products

2. 상품 목록 조회
   GET
   /products

3. 상품 상세 조회
   GET
   /products/{productId}

4. 상품 정보 수정
   PATCH
   /products/{productId}

5. 상품 삭제
   DELETE
   /products/{productId}

주문 기능

1. 주문 정보 생성
   POST
   /orders

2. 주문 목록 조회
   GET
   /orders

3. 주문 상세 조회
   GET
   /orders/{orderId}

4. 주문 취소
   PATCH
   /orders/{orderId}/cancel

![Whitelabel Error Page](Screenshot%202025-09-29%20at%2021.58.56.png)
