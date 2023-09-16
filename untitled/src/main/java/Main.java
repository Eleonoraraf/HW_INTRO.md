public class Main {
    public class BonusServiceTest {

        @Test
        void shouldCalculateForRegisteredAndUnderLimit() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1000;
            boolean registered = true;
            longexpected = 30;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }


        @TestvoidshouldCalculateForRegisteredAndOverLimit() {
            BonusServiceservice = new BonusService();

            // подготавливаем данные:
            long amount = 1_000_000;
            booleanregistered = true;
            longexpected = 500;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }
    }
