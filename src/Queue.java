public class Queue {
    private Node first;
    private Node last;

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
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
    public void enqueue(){
        
    }

    //desenfileirar
}
