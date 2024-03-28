package staticproxy;

public class StaticProxyClient {
    public static void main(String[] args) {
        ILawsuit lee = new Lee();
        ILawsuit lawyer = new Lawyer(lee);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
