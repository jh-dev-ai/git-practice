# Git Practice

Git과 GitHub를 연습하는 저장소입니다.

## Practice

- Branch
- Commit
- Push

## Java 계좌 관리 프로젝트

Java 객체지향 프로그래밍을 활용하여 여러 은행 계좌를 등록하고, 입금·출금·송금 및 잔액 조회 기능을 수행하는 프로그램입니다.

클래스별 역할

* BankAccount.java: 개별 계좌의 잔액을 관리하고 입금·출금·송금을 처리합니다.
* AccountManager.java: 여러 계좌를 HashMap으로 관리하며 계좌 등록·조회 및 거래 기능을 제공합니다.
* AccountPractice.java: main()에서 객체를 생성하고 계좌 관리 기능을 호출하여 정상·예외 상황을 테스트합니다.

### 실행 방법

세 Java 파일이 있는 폴더에서 터미널을 열고 다음 명령어를 실행합니다.

javac BankAccount.java AccountManager.java AccountPractice.java
java AccountPractice

Java JDK가 설치된 환경에서 실행할 수 있습니다.

### 테스트 결과

- 정상 송금: PASS (1001번 계좌에서 1002번 계좌로 10,000원 송금 성공)
- 잔액 부족 송금: PASS (잔액보다 큰 금액을 송금하면 거래 거부)
- 존재하지 않는 계좌: PASS (9999번 계좌로 송금 시 오류 메시지 출력)