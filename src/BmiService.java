public class BmiService {
    public double calculate(double height, double weight) {
        double total = weight / (height * height);
        return total;
    }
}

