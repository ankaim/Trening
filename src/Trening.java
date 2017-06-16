
public class Trening {
    public static void main(String[] args) {
        Hause hause = new Hause("Hause", 20);
        hause.viewHaus();
        Door door = new Door("Дверь в доме", 40, 50);
        door.viewDoor();
        door.viewHaus();
        door.mat();

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
        public void viewHaus(){
            System.out.println("Name = "+name+"; Width = "+width);
        }
        void mat(){
            System.out.println("Сделано из кирпича");
        }
    }
    static class Door extends Hause{
        int height;

        public Door(String name, int width, int height) {
            super(name, width);
            this.height = height;
        }

        public void viewDoor(){
            System.out.println("Name = "+name+"; Width = "+width+ "; Height = "+height);
        }

        @Override
        void mat() {
            super.mat();
            System.out.println("Сделанно из дерева");
        }
    }
}
