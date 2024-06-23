package course_aqa.L4;

public class Park {

    private String name;
    private Attraction[] attractions;
    private int attractionCount;

    public Park(String name, int maxAttractions) {
        this.name = name;
        this.attractions = new Attraction[maxAttractions];
        this.attractionCount = 0;
    }

    public void addAttraction(String name, String workingHours, double price) {
        if (attractionCount < attractions.length) {
            attractions[attractionCount++] = new Attraction(name, workingHours, price);
        }
    }

    public void displayAttractions() {
        System.out.println("Название парка: " + name);
        for (int i = 0; i < attractionCount; i++) {
            System.out.println("Аттракцион " + (i + 1) + ": " + attractions[i].getName() +
                    ", Время работы: " + attractions[i].getWorkingHours() +
                    ", Цена: " + attractions[i].getPrice());
        }
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Park mskPark = new Park("MSK Park", 4);
        mskPark.addAttraction("Волшебная карусель", "с 10:00 до 20:00", 299.99);
        mskPark.addAttraction("Эмоциональные горки", "с 11:00 до 22:00", 399.99);
        mskPark.addAttraction("Лабиринт скрытых желаний", "с 10:00 до 23:00", 899.99);
        mskPark.addAttraction("Колесо всевидения", "с 05:00 до 23:00", 499.99);
        mskPark.displayAttractions();
    }
}
