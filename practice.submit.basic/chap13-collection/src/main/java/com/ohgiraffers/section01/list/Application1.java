package com.ohgiraffers.section01.list;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* ArrayList
         *  : 기존 배열은 크기 변경이 불가하고 요소의 추가/삭제/정렬이 복잡하다.
         * 이러한 기능을 메소드로 구현해서 제공하고 있으며 단 , 속도가 빨라지는 것은 아니다.
         * */

        /*다형성을 이용하여 상위 래퍼런스로 ArrayList 객체를 참조할 수 있다.
         * List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하므로 보다 유연한 코드를 작성할 수 있다.*/
        ArrayList alsit = new ArrayList();
        List list = new ArrayList();
        Collection clist = new ArrayList();

        Name alist;
        /*모든 타입을 저장할 수 있기 때문에
        alist.add(10);
        alist.add("hello");
        alist.add(new Date());

        /* String 타입의 Element만 저장하는 ArrayList 생성*/
        List<String> slist = new ArrayList<>();
        slist.add("apple");
        slist.add("banana");
        slist.add("orange");
        //slist.add(10); > String 타입이 아닌 경우 컴파일 에러 발생
        slist.add("banana");

        System.out.print("slist : " + slist);

        /* 배열의 길이가 아닌 저장한 요소의 개수를 반환한다.
         * 반복문 등에서 활용하면 NullPointException 등의 문제가 없다. (기존 배열의 문제)
         * */
        System.out.println("slist.size() : " + slist.size());

        for (int i = 0; i < slist.size(); i++) {
            System.out.println("slist.get(i) : " + slist.get(i));
        }

        /* 향상 된 for문으로 순회 가능*/
        for(String s : slist) {
            System.out.println("s : " + s);
        }

        /* add 메소드의 사용법은 맨 끝에 추가하는 것이지만
        원하는 위치 인덱스를 전달해서 추가할 수도 있다. */
        slist.add(1, "mango");
        System.out.println("slist : " + slist);

        /* set 메소드를 통해 해당 인덱스 요소 수정 */
        slist.set(2, "grade");
        System.out.println("slist : " + slist);

        /* remove 메솓를 통해 해당 인덱스 요소 삭제*/
        slist.remove(1);
        System.out.println("slist : " + slist);

        /* 요소 정렬*/
        Collection.sort(slist);
        System.out.println("slist : " + slist);

    }
}
