public class MainFila {

    int vet[] = new int[10], op, elem;

    static int tam_max=10, tam=0;

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = 0; q.rear = 0;
    }

    static int empty(Queue pq) //verificar se está vazio
    {
        if( pq.front == pq.rear )
        {
            return 1;
        }
        return 0;
    }

    static String enqueue(Queue pq, String x)
    {
        if( pq.rear + 1 >= tam_max )
        {
            System.out.println("\nEstouro da capacidade da fila");
        }
        pq.fila[ pq.rear++ ] = x;
        return x;
    }

    static int size(Queue pq)
    {
        return (pq.rear + 1);
    }
    static String front(Queue pq)
    {
        return pq.fila[0];
    }

    static String dequeue(Queue pq)
    {
        String x;
        int i;
        if(empty(pq)==1)
        {
            System.out.println("\nFila vazia");
        }
        x = pq.fila[0];
        for(i=0; i < pq.rear; i++)
        {
            pq.fila[i] = pq.fila[i+1];
        }
        pq.rear--;
        return x;
    }
}


