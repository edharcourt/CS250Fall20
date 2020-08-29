public interface CS250List<T> {

    // insert data at the front
    CS250List<T> push(T data);

    // print the linked list to the console
    void print();

    // reverse the linked list in place modifying this.
    CS250List<T> reverse();
}
