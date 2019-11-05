package com.akimov.simbirsoft_intepship;

/**
 * Created by Toxo on 04.11.2019
 */

public class ElementaryTraining {
    /**
     * Метод должен возвращать среднее значение
     * для введенных параметров
     *
     * @param firstValue  первый элемент
     * @param secondValue второй элемент
     * @return среднее значение для введенных чисел
     */
    public double averageValue(int firstValue, int secondValue) {
        return (firstValue + secondValue) / 2d;
    }

    /**
     * Пользователь вводит три числа.
     * Произвести манипуляции и вернуть сумму новых чисел
     *
     * @param firstValue  увеличить в два раза
     * @param secondValue уменьшить на три
     * @param thirdValue  возвести в квадрат
     * @return сумма новых трех чисел
     */
    public double complicatedAmount(int firstValue, int secondValue, int thirdValue) {
        firstValue *= 2;
        secondValue -= 3;
        thirdValue *= thirdValue;
        return firstValue + secondValue + thirdValue;
    }

    /**
     * Метод должен поменять значение в соответствии с условием.
     * Если значение больше 3, то увеличить
     * на 10, иначе уменьшить на 10.
     *
     * @param value число для изменения
     * @return новое значение
     */
    public int changeValue(int value) {
        if (value > 3) {
            value += 10;
        } else {
            value -= 10;
        }
        return value;
    }

    /**
     * Метод должен менять местами первую
     * и последнюю цифру числа.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10, вернуть
     * то же число
     *
     * @param value число для перестановки
     * @return новое число
     */
    public int swapNumbers(int value) {
        if (value < 10) {
            return value;
        }
        if (value < 100000) {
            int last_digit = value % 10;
            int number_exponent = 1;

            while (value / number_exponent > 10) {
                number_exponent *= 10;
            }

            int first_digit = value / number_exponent;

            return (last_digit * 100) + (value - (first_digit * number_exponent) - last_digit) + first_digit;
        } else {
            return 0;
        }
    }

    /**
     * Изменить значение четных цифр числа на ноль.
     * Счет начинать с единицы.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10 вернуть
     * то же число.
     *
     * @param value число для изменения
     * @return новое число
     */
    public int zeroEvenNumber(int value) {
        if (value < 10) {
            return value;
        }
        if (value < 100000) {
            String integer = String.valueOf(value);
            char[] array = integer.toCharArray();
            for (int i = 0; i <= array.length - 1; i++) {
                if (i % 2 > 0) {
                    array[i] = '0';
                }
            }
            return Integer.decode(String.valueOf(array));
        } else {
            return 0;
        }
    }
}
