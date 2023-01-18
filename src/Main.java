// Создать приложение, рассчитывающее количество начисленных миль за купленный билет.
// Формула расчёта следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля. Дробные мили не начисляются.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int ticket = 190; // стоимость билета
        int miles = ticket / 20;

        System.out.println(miles);

    }
}




