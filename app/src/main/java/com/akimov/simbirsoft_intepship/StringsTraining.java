package com.akimov.simbirsoft_intepship;

/**
 * Created by Toxo on 04.11.2019
 */
public class StringsTraining {
    /**
     * Метод по созданию строки,
     * состоящей из нечетных символов
     * входной строки в том же порядке
     *
     * @param text строка для выборки
     * @return новая строка из нечетных
     * элементов строки text
     */
    public String getOddCharacterString(String text) {
        if (text.isEmpty()) {
            return text;
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i <= text.length() - 1; i++) {
                if (i % 2 > 0) {
                    result.append(text.charAt(i));
                }
            }
            return result.toString();
        }
    }

    /**
     * Метод для определения количества
     * символов, идентичных последнему
     * в данной строке
     *
     * @param text строка для выборки
     * @return массив с номерами символов,
     * идентичных последнему. Если таких нет,
     * вернуть пустой массив
     */
    public int[] getArrayLastSymbol(String text) {
        if (text.isEmpty()) {
            return new int[]{};
        }
        char last_char = text.charAt(text.length() - 1);
        char[] char_array = text.toCharArray();
        int count = 0;
        for (char s : char_array) {
            if (s == last_char) {
                count++;
            }
        }
        if (count == 1) {
            return new int[]{};
        } else {
            int[] array = new int[count];
            int temp = 0;
            for (int i = 0; i <= char_array.length - 1; i++) {
                if (char_array[i] == last_char) {
                    array[temp] = i;
                    temp++;
                }
            }
            return array;
        }
    }

    /**
     * Метод по получению количества
     * цифр в строке
     *
     * @param text строка для выборки
     * @return количество цифр в строке
     */
    public int getNumbersCount(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Дан текст. Заменить все цифры
     * соответствующими словами.
     *
     * @param text текст для поиска и замены
     * @return текст, где цыфры заменены словами
     */
    public String replaceAllNumbers(String text) {
        return text.replace("1", "one")
                .replace("2", "two")
                .replace("3", "three")
                .replace("4", "four")
                .replace("5", "five")
                .replace("6", "six")
                .replace("7", "seven")
                .replace("8", "eight")
                .replace("9", "nine")
                .replace("0", "zero");
    }

    /**
     * Метод должен заменить заглавные буквы
     * на прописные, а прописные на заглавные
     *
     * @param text строка для изменения
     * @return измененная строка
     */
    public String capitalReverse(String text) {
        char[] array = text.toCharArray();

        for (int i = 0; i <= array.length - 1; i++) {
            if (Character.isUpperCase(array[i])) {
                array[i] = Character.toLowerCase(array[i]);
            } else {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return String.valueOf(array);
    }
}
