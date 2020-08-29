public class Main {
    public static void main(String [] args) {
        CS250LinkedList<Integer> l = new CS250LinkedList<>();

        l.push(5).push(6).push(7);
        l.print();
        l.reverse();
        l.print();
        return;
    }
}
