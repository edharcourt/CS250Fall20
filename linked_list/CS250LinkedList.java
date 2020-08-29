public class CS250LinkedList<T> implements CS250List<T> {

    private Node<T>head;

    public CS250LinkedList() {
        this.head = null;
    }


    public CS250List<T> push(T data) {
        this.head = new Node<T>(data, this.head);
        return this;
    }

    @Override
    public void print() {
        Node<T> curr = head;

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    @Override
    public CS250LinkedList<T> reverse() {

        if (head == null || head.next == null) {
            return this;
        }

        Node<T> prev = head, curr = head.next;
        head.next = null;

        while (curr != null) {
            Node<T> tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

        head = prev;
        return this;
    }

}
