public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight = 65;
        int height = 170;
        double index = service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела " + index);

        if (index <= 25.00) {
            System.out.println("Нормальный вес");
        } else {
            System.out.println("Выраженный избыточный вес");
        }
        }

    }
