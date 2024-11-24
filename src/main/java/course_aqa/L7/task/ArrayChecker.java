package course_aqa.L7.task;

import course_aqa.L7.exception.MyArrayDataException;
import course_aqa.L7.exception.MyArraySizeException;

public class ArrayChecker {
    //Метод проверки размера массивва
    public static int checkSumAndSizeArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        //Проверка массива на 4 строки
        if (array.length != 4) {
            throw new MyArraySizeException("Ошибка! Массив должен быть размером 4х4");
        }

        //Проверка что каждая строка имеет 4 столбца
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Ошибка! Массив должен быть размером 4х4");
            }
        }

        //Переменная для хранения суммы элементов массива
        int sum = 0;

        //Проход по всем элементам массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    //Преобразование элемента массива в int и добавление к сумме
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArraySizeException("Неверные данные в ячейке [" + i + "][" + j + "] : " + array[i][j]);
                }
            }
        }

        //Сообщение если размероность верная, 4х4
        System.out.println("Массив имеет правильный размер 4х4");

        return sum;
    }

    public static void main(String[] args) {
        //Правильный массив
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        //Неправильный массив по размерности
        String[][] invalidArraySize = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","10","11","12"}
        };

        //Неправильный массив по данным
        String[][] invalidArrayData = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "ошибка", "12"},
                {"13", "14", "15", "16"}
        };


        //Проверка правильного массива
        try {
            System.out.println("Сумма элементов validArray: " + checkSumAndSizeArray(validArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        //Проверка не правильного массива (вызов исключения по размеру)
        try {
            System.out.println("Сумма элементов invalidArray: " + checkSumAndSizeArray(invalidArraySize));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

        //Проверка не правильного массива (вызов исключения по данным)
        try {
            System.out.println("Сумма элементов invalidArray: " + checkSumAndSizeArray(invalidArrayData));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}
