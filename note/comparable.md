### 정렬을 위해 Comparable 과 Comparator 인터페이스 구현

#### TreeSet 클래스 활용
* 객체의 정렬에 사용
* TreeSet 은 내부적으로 이진검색트리로 구현
* Set 인터페이스를 구현하기 때문에 중복을 허용하지 않고 오름차순, 내림차순 정렬 가능
* 이진검색트리 저장을 위해 객체 비교 필요


#### Comparable
* 비교 대상 매개변수가 하나
* 자기 자신과 비교

#### Comparator
* 매개변수 두개
* 하나는 자기자신, 하나는 비교 대상
* Comparable 이 구현된 경우 Comparator 로 비교하는 방식을 다시 구현할 수 있다