package com.akimov.simbirsoft_intepship;

/**
 * Created by Toxo on 06.11.2019
 */
public class ArraysTraining {
    /**
     * Метод должен сортировать входящий массив
     * по возрастранию пузырьковым методом
     *
     * @param valuesArray массив для сортировки
     * @return отсортированный массив
     */
    public int[] sort(int[] valuesArray) {
        for(int i = valuesArray.length-1; i>=0; i--){
            for(int j = 0; j<i; j++){
                if(valuesArray[j]>valuesArray[j+1]){
                    int temp = valuesArray[j];
                    valuesArray[j] = valuesArray[j+1];
                    valuesArray[j+1] = temp;
                }
            }
        }
        return valuesArray;
    }

    /**
     * Метод должен возвращать максимальное
     * значение из введенных. Если входящие числа
     * отсутствуют - вернуть 0
     *
     * @param values входящие числа
     * @return максимальное число или 0
     */
    public int maxValue(int... values) {
        if(values.length==0){
            return 0;
        }
        else{
            return sort(values)[values.length-1];
        }
    }

    /**
     * Переставить элементы массива
     * в обратном порядке
     *
     * @param array массив для преобразования
     * @return входящий массив в обратном порядке
     */
    public int[] reverse(int[] array) {
        for(int i = 0;i<array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }

    /**
     * Метод должен вернуть массив,
     * состоящий из чисел Фибоначчи
     *
     * @param numbersCount количество чисел Фибоначчи,
     *                     требуемое в исходящем массиве.
     *                     Если numbersCount < 1, исходный
     *                     массив должен быть пуст.
     * @return массив из чисел Фибоначчи
     */
    public int[] fibonacciNumbers(int numbersCount) {
        if(numbersCount<1){
            return new int[]{};
        }
        if(numbersCount<2){
            return new int[]{1};
        }
        else {
            int[] array = new int[numbersCount];
            array[0] = 1;
            array[1] = 1;
            for(int i = 2; i<=array.length-1;i++){
                array[i] = array[i-2]+array[i-1];
            }
            return array;
        }
    }

    /**
     * В данном массиве найти максимальное
     * количество одинаковых элементов.
     *
     * @param array массив для выборки
     * @return количество максимально встречающихся
     * элементов
     */
    public int maxCountSymbol(int[] array) {
        int number = 0;
        int count = 0;

        for(int i = 0; i<=array.length-1; i++){
            int temp_number = array[i];
            int temp_count = 0;
            for(int j = 0; j<=array.length-1;j++){
                if(temp_number==array[j]){
                    temp_count++;
                }
            }
            if(temp_count>count){
                count = temp_count;
                number = temp_number;
            }
        }
        //TODO: implement it
        return number;
    }
}
