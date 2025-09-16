/*package com.ohgiraffers.section01.list.dto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        List<BookDTO> booklist = new ArrayList<>();
        booklist.add(new BookDTO(1,"홍길동전", "허균", 50000));
        booklist.add(new BookDTO(2,"목민심서", "정약용", 30000));
        booklist.add(new BookDTO(3,"동의보감", "허준", 40000));
        booklist.add(new BookDTO(4,"삼국사기", "김부식", 46000));
        booklist.add(new BookDTO(5,"삼국유사", "일연", 580000));
    }
}

    정렬 기준이 계속 사용 되는 경우는 별도의 클래스를 만들어서 재사용할 수 있지만
    * 한 번만 사용하는 경우 더 간편하게 익명 클래스(Anoymous Class)를 활용할 수도 있따.*/
    bookList.sort(new Comparator<BookDTO>() {
        @Override 신규*
        public int compare(BookDTO 01, BookDTO 02) {
            /* 가격 내림차순 정렬 */
        return 02.getClass() - 01.getClass();
    }
}


