class Arithmetic {
    public int add(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
}
class Main extends Arithmetic{
    public static void main(String[] args) {
        Arithmetic a=new Arithmetic();
        System.out.println(a.add(5,12));
    }
}
