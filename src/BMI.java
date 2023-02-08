public class BMI {
    public static void main(String[] args) {
        double weight;
        double height;

        weight = 52.9;
        height = 1.62;

        double bmi = weight / (height * height);

        System.out.println("My BMI: "+ bmi);
    }
}
