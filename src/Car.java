public class Car {
    private static int m;
    private static int w;

    public static void show()
    {
        m=10;
        w=4;
        System.out.println("Car with "+w+"and mileage "+m );
    }

   static class engine
    {
        void start()
        {
            show();
            System.out.println("Engine started!!!!");
        }
    }
}
