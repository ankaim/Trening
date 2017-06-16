
public class Trening {
    public static void main(String[] args) {
        Hause hause = new Hause("Hause", 20);
        hause.view();
    }
    static class Hause{
        String name;
        int width;

        public Hause() {
        }

        public Hause(String name, int width) {
            this.name = name;
            this.width = width;
        }
        public void view(){
            System.out.println("Name = "+name+"; Width = "+width);
        }
    }
    
}
