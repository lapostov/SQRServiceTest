import ru.netology.sqr.HowManySquares.services.SQRService;

public class Main {
    public static void Main(String[] args) {
        int low = 100;
        int high = 300;


        SQRService service = new SQRService();
        System.out.println(service.calcSQRService);
    }
}

