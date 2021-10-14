public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight = 57;
        int height = 163;
        int index = service.calculate();

        System.out.println(index);

            }

        }
