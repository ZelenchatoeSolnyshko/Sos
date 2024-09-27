package exe;

public class MyList<T>
{
    private MyNode<T> head;
    private int size;
    private ListStrategy<T> listStrategy;


    public ListStrategy<T> getListStrategy() {
        return listStrategy;
    }

    public void setListStrategy(ListStrategy<T> listStrategy) {
        this.listStrategy = listStrategy;
    }

    public MyNode<T> getHead()
    {
        return head;
    }

    public void setHead(MyNode<T> head) {
        this.head = head;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void add(T elem)
    {
        MyNode<T> newMyNode = new MyNode<>(elem);
        head = (head == null)
                ? newMyNode
                : listStrategy.add(head, newMyNode);
        size++;
    }

    private MyNode<T> SearchElement(T selem)
    {
        MyNode<T> iter = getHead();
        while (iter != null)
        {
            if (iter.getValue() == selem)
            {
                return iter;
            }
            else
            {
                iter = iter.getNext();
            }
        }
        System.out.println("ERROR 404: Element not found\n");
        return null;
    }

    public void remove(T elem)
    {
        head = (head == null)
                    ? null
                    : listStrategy.remove(head);
        size--;
    }

    public void removeHead(T elem)
    {
        MyNode<T> o = getHead();
        head = o.getNext();
        o = null;
        size--;
    }




}