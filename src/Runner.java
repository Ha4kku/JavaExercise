public class Runner {
    public static void main(String[]args) {
        Car random = new Car(2002, "random", 0, "new");
        random.setMiles(200);
        System.out.println(random);

        Rectangle rainbow = new Rectangle(8.5, 6.7, 56.95, 10.82, false);
        System.out.println(rainbow);
    }
}
