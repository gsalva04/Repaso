public class RepasoTest {
    public static void main(String[] args) throws Exception {

        Repaso r = new Repaso ();

        System.out.println(r.suma());
        System.out.println(r.multiplicacion());
        try {
            System.out.println(r.division());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
