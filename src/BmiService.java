public class BmiService{

    public double calculate (int height, int weight) {

            double convertedHeight = Math.round(height*1.0)/100.0;
            double index = weight / (convertedHeight * convertedHeight);

            return index;

        }

    }
