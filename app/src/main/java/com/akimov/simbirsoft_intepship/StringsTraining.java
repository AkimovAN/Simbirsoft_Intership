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
        if(text.isEmpty()){
            return text;
        }
        else {
            StringBuilder result = new StringBuilder();
            for(int i=0; i<=text.length()-1;i++){
                if(i%2>0){
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
//        int count = text.
        //TODO: implement it
        return new int[]{};
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
        for(char c : text.toCharArray()){
            if(Character.isDigit(c)){
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
        //TODO: implement it
        return text;
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

        for(int i = 0; i<=array.length-1;i++){
            if(Character.isUpperCase(array[i])){
                array[i] = Character.toLowerCase(array[i]);
            }
            else {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return String.valueOf(array);
    }
}
