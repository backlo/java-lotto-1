# 우아한 테크코스 레벨1

## 4주차 미션 - 로또(1단계)

### 구현 기능 목록
1. [입력] 구입금액 입력
	* [예외처리] 0원 이상 입력
	* [예외처리] 1000원 단위로 입력
	* [예외처리] 양의 정수 외의 숫자 오는지 검증

2. [실행] 로또 구입 개수 및 해당 개수에 맞게 번호 등록
	* 로또 번호 1~45까지의 난수 생성
	* 구입 하나당 6개 로또 번호 등록

3. [입력] 당첨 번호 입력
	* [예외처리] 번호 개수가 6개인지 검증
	* [예외처리] 1부터 45까지의 번호인지 검증

4. [실행] 당첨번호와 구매 로또 번호와 비교	
	* 맞춘 번호 개수를 통해 금액 책정
	* 수익률 계산
		* 수익률 = (로또 당첨 금액)/(로또 구매 금액) * 100

5. [출력] 당첨 개수 리스트와 수익률 출력

## 4주차 미션 - 로또(2단계)

### 추가 구현 기능 목록
1. [입력] 보너스 볼 입력
	* [예외처리] 1부터 45까지의 번호 입력한지 검증
	* [예외처리] 문자가 입력되었는지 검증
	* [예외처리] 기존 로또 번호에 번호가 중복되었는지 확인

2. [결과] Rank에 보너스볼 일치 값을 추가
	* 5개일치, 보너스볼일치 - 30000000원 추가

## 4주차 미션 - 로또(3단계)

### 추가 구현 기능 목록
1. [입력] 수동구매 개수 입력
	* [예외처리] 0이하의 수 입력하는지 검증
	* [예외처리] 정수외의 다른 문자를 입력하는지 검증

2. [입력] 수동구매 번호 입력
	* [예외처리] 1부터 45까지의 수 입력하는지 검증
	* [예외처리] 번호 6개 입력하는지 검증
	* [예외처리] 정수 외의 다른 문자를 입력하는지 검증

3. [실행] 수동구매 개수를 뺀 만큼의 수를 자동 구매 실행

## 5주차 미션 - 로또(4단계)

### 추가 구현 기능 목록
1. [입력] 로또번호를 입력 할 수 있는 로또 페이지 구현(html)

## 5주차 미션 - 로또(5단계)

### 추가 구현 기능 목록
1. [기능] 로또번호들을 저장할 수 있는 데이터베이스 구현
3. [실행] 수동구매 개수를 뺀 만큼의 수를 자동 구매 실행

