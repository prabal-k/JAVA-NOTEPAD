public class Main {
    public static void main(String[] args)
    {
        ForFrame frame=new ForFrame();
        try {
            frame.ForFramecalc();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}