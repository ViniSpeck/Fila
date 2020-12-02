
//Queue vai ser parametrizado com um tipo T
public class Queue<T> {
    private Node<T> first;
    private Node<T> last;

    private class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    //explicitando o construtor da fila
    public Queue(){
        first = null;
        last = null;
    }
    //vazia?
    public boolean isEmpty(){
        return (first==null & last==null);
    }

    //enfileirar
    public void enqueue(T data){
        Node<T> aux = new Node<>(data);

        if(isEmpty()){
            last = aux;
            first = aux;
        }
        else {
            last.next = aux;
            last = aux;
        }

    }

    //desenfileirar
    public T dequeue(){
        Node<T> aux;
        T data;

        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Fila Vazia! Impossível desenfileirar.");
        }

        aux = first;
        first = first.next;
        aux.next = null;
        data = aux.data;

        if(first==null){
            last = null;
        }
        return data;
    }

    public T getFirst() {
        return first.data;
    }

    public T getLast() {
        return last.data;
    }
}
