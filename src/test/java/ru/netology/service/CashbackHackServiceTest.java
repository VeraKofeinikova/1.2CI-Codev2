package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CashbackHackServiceTest {

    @Displayname(value = "Should throw new IllegalArgumentException(\"amount must be greater than zero\")")
    @Test
    /*
    Проверяет, что сервис выдает предупреждение,
    при попытке покупки на 0 рублей.
    */
    void shouldReturnWarningIfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.remain(0));
    }

    @Displayname(value = "Should throw new IllegalArgumentException(\"amount must be greater than zero\")")
    @Test
    /*
    Проверяет, что сервис выдает предупреждение,
    при попытке покупки на отрицательное число рублей.
    */
    void shouldReturnWarningIfAmountIsLesserThen0() {
        CashbackHackService service = new CashbackHackService();
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.remain(-1));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/RemainData.csv", numLinesToSkip = 1)
    void shouldCalculateRemain(int amount, int expectedResult, String message) {
        CashbackHackService service = new CashbackHackService();
        int actualResult = service.remain(amount);
        Assertions.assertEquals(expectedResult, actualResult, message);
    }

//    @Test
//    /*
//    Проверяет, что сервис возвращает 100 рублей
//    при покупке на сумму 900 рублей.
//    */
//    void shouldReturn100IfAmountIs900() {
//        CashbackHackService service = new CashbackHackService();
//        int expectedResult = 100;
//        int actualResult = service.remain(900);
//        Assertions.assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    /*
//    Проверяет, что сервис возвращает 0 рублей
//    при покупке на сумму 1000 рублей.
//    */
//    void shouldReturn0IfAmountIs1000() {
//        CashbackHackService service = new CashbackHackService();
//        int expectedResult = 0;
//        int actualResult = service.remain(1000);
//        Assertions.assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    /*
//    Проверяет, что сервис возвращает 900 рублей
//    при покупке на сумму 1100 рублей.
//    */
//    void shouldReturn900IfAmountIs1100() {
//        CashbackHackService service = new CashbackHackService();
//        int expectedResult = 900;
//        int actualResult = service.remain(1100);
//        Assertions.assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    /*
//    Проверяет, что сервис возвращает 0 рублей
//    при покупке на сумму 2000 рублей.
//    */
//    void shouldReturn0IfAmountIs2000() {
//        CashbackHackService service = new CashbackHackService();
//        int expectedResult = 0;
//        int actualResult = service.remain(2000);
//        Assertions.assertEquals(expectedResult, actualResult);
//    }
}