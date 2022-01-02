public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.88;
        double weight = 85;
        double index = service.calculate(weight / (height * height));
        System.out.println("Индекс состовляет:" + index);
    }
}
