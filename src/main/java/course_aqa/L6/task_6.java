package course_aqa.L6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class task_6 {
    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    //Метод для сохранения данных в CSV файл
    public void save(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
    //Запись header
            writer.write(String.join(";", header));
            writer.newLine();

    //Запись данных
            for (int[] row : data) {
                String[] rowData = new String[row.length];
                for (int i = 0; i < row.length; i++) {
                    rowData[i] = String.valueOf(row[i]);
                }
                writer.write(String.join(";", rowData));
                writer.newLine();
            }
        }
    }

    //Метод для загрузки данных из CSV файла
    public static task_6 load(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            task_6 task6 = new task_6();

    //Чтение header
            String headerLine = reader.readLine();
            task6.setHeader(headerLine.split(";"));

    //Чтение data
            List<int[]> dataList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] stringValues = line.split(";");
                int[] intValues = new int[stringValues.length];
                for (int i = 0; i < stringValues.length; i++) {
                    intValues[i] = Integer.parseInt(stringValues[i]);
                }
                dataList.add(intValues);
            }

    //Преобразование списка в массив
            int[][] dataArray = new int[dataList.size()][];
            for (int i = 0; i < dataList.size(); i++) {
                dataArray[i] = dataList.get(i);
            }
            task6.setData(dataArray);

            return task6;
        }
    }

    public static void main(String[] args) {
        try {
            task_6 task6 = new task_6();
            task6.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
            task6.setData(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

    //Сохранение в CSV
            task6.save("data.csv");

    //Загрузка изCSV
            task_6 loadedData = task_6.load("data.csv");

    //Вывод в консоль загруженных данных
            System.out.println("Header: " + String.join(", ", loadedData.getHeader()));
            for (int[] row : loadedData.getData()) {
                System.out.println("Row: " + java.util.Arrays.toString(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}