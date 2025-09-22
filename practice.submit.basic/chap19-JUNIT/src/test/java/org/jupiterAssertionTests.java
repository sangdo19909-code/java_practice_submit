package org;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class jupiterAssertionTests {
    void testAssertEquals() {


        Assertions.assertEquals(expected, rusult);
    }

    @Test
    @DisplayName("동시에 여러 값에 대한 검증 테스트")
    void testAssertall() {
        String firstName = "길동";
        String lastName = "홍";

        Persom persom = new Persom(firstName, lastName);
    }


     Assertions.assertAll();



}
