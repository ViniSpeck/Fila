public class QueueTest {
    public static void main(String[] args) {
        Queue<Aluno> q = new Queue<>();

        q.enqueue(new Aluno(1, "João", 20));
        q.enqueue(new Aluno(2, "José", 23));
        q.enqueue(new Aluno(3, "Carlos", 21));

        try {
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
