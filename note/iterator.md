### Collection 요소를 순회하는 Iterator

* 컬렉션 프레임워크에 저장된 element 를 하나씩 차례로 참조하는 것
* 순서가 있는 List 인터페이스의 경우 Iterator 을 사용하지 않고 get(i) 메서드를 활용할 수 있음
* Set 인터페이스의 경우 get 함수가 없기 때문에 iterator 을 사용
* hasNext() : 이후에 요소가 있는지 체크하는 메서드로 요소가 있으면 true 를 반환
* E next() : 다음에 있는 요소를 반환

```
// 모든 컬렉션은 iterator 함수를 가지고 있고 호출하면 Iterator을 리턴
Iterator<Member> ir = arrayList.iterator(); 
while(ir.hasNext()) {
    Member mem = ir.next();
    int id = mem.getMemberId();
    ...
}
```

