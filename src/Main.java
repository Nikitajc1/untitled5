public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 77f;
        float height = 1.7f;
        float index = service.calculate(weight, height);
        System.out.println(index);
    }
}