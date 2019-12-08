package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CashbackHackServiceTest {

    @Test
    /*
    Проверяет, что сервис возвращает 1000 рублей
    при покупке на сумму 0 рублей.
    */
    void shouldReturn1000IfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int expectedResult = 1000;
        int actualResult = service.remain(0);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    /*
    Проверяет, что сервис возвращает 100 рублей
    при покупке на сумму 900 рублей.
    */
    void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int expectedResult = 100;
        int actualResult = service.remain(900);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    /*
    Проверяет, что сервис возвращает 0 рублей
    при покупке на сумму 1000 рублей.
    */
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int expectedResult = 0;
        int actualResult = service.remain(1000);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    /*
    Проверяет, что сервис возвращает 900 рублей
    при покупке на сумму 1100 рублей.
    */
    void shouldReturn900IfAmountIs1100() {
        CashbackHackService service = new CashbackHackService();
        int expectedResult = 900;
        int actualResult = service.remain(1100);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    /*
    Проверяет, что сервис возвращает 0 рублей
    при покупке на сумму 2000 рублей.
    */
    void shouldReturn0IfAmountIs2000() {
        CashbackHackService service = new CashbackHackService();
        int expectedResult = 0;
        int actualResult = service.remain(2000);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}