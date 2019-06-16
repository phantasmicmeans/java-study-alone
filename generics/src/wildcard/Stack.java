package src.wildcard;


import src.BasicStack;

import java.util.*;

/**
 * 메시지 : 유연성을 극대화 하려면 원소의 생산자나 소비자용 입력 매개변수에 와일드카드 타입을 사용하라.
 * 공식 : PECS (producer - extends , consumer - super
 * 즉, 매개변수화 타입 T 가 생산자면 <? extends T>를 사용하고,
 * 타입 T 가 소비자라면 <? super T>를 사용하라.
 */
public class Stack <E> extends BasicStack <E> {

    public void pushAll(Iterable<E> src) {
        for (E e : src) {
            push(e);
        }
    }

    //stack이 사용할 E 인스턴스를 생산하므로 ? extends E
    public void pushAllWildCard(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public void popAll(Collection<E> dst) {
        while(!isEmpty()) {
            dst.add(pop());
        }
    }

    //stack으로부터 E 인스턴스를 소비하므로 <? super E>
    public void popAllWildCard(Collection<? super E> dst) { //E의 상위타입 collection 이여야함.
        while(!isEmpty()) {
            dst.add(pop());
        }
    }

    class StackTest  {

        private Stack<Number> stack = new Stack<>();
        private List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        public void StackTestPush() {
            Iterable<Integer> integers = () -> intList.iterator();
            stack.pushAll(integers); // compile Type 오류 : Number에 Integer 넣으려함.
        }

        public void StackTestPushWildCard() {
            Iterable<Integer> integers = () -> intList.iterator();
            stack.pushAllWildCard(integers); //오류 X
        }

        public void StackTestPop() {
            Collection<Object> collection = new ArrayList<>();
            stack.popAll(collection); //Type Error
        }

        public void StackTestPopWildCard() {
            Collection<Object> collection = new ArrayList<>(); //Number의 상위타입 Object 컬렉션
            stack.popAllWildCard(collection);
        }

        public void SetUnionWildCard() {
            Set<Integer> integers = new HashSet<>(Arrays.asList(1,2,3));
            Set<Double> doubles = new HashSet<>(Arrays.asList(1.0,2.0,3.0));
            Set<Number> numbers = unionWildCard(integers,doubles);
        }
    }
}
