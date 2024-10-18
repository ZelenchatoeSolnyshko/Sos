package exe;

public class MainList
{
    public static void main(String[] args)
    {
        QueueStrategy<Integer> queueStrategy = new QueueStrategy<>();
        StackStrategy<Integer> stackStrategy = new StackStrategy<>();
        MyList<Integer> listic = new MyList<Integer>();
        listic.setListStrategy(queueStrategy);
        listic.add(1);
        listic.add(2);
        listic.setListStrategy(stackStrategy);
        listic.add(4);
        listic.add(8);
        System.out.println("List before:");
        MyNode<Integer> lumine1 = listic.getHead();
        while(lumine1 != null)
        {
            System.out.println(lumine1.getValue());
            lumine1 = lumine1.getNext();
        }
        int size1 = listic.getSize();
        System.out.println("size:");
        System.out.println(   size1);


        System.out.println("List after add:");
        listic.add(16);
        MyNode<Integer> lumine2 = listic.getHead();
        while(lumine2 != null)
        {
            System.out.println(lumine2.getValue());
            lumine2 = lumine2.getNext();
        }
        int size2 = listic.getSize();
        System.out.println("size:");
        System.out.println(   size2);



        listic.remove(8);
        System.out.println("List after remove:");
        MyNode<Integer> lumine3 = listic.getHead();
        while(lumine3 != null)
        {
            System.out.println(lumine3.getValue());
            lumine3 = lumine3.getNext();
        }
        int size3 = listic.getSize();
        System.out.println("size:");
        System.out.println(  size3);
    }
}

 /*     long s = 5L;
        float f = 5.0f;
        char symbol = '0';
        String str = "fga";
        boolean isNot = true;
        String str1 = str + "AAA";
        String str2 = str1.concat("ass");
        int a = 5;
        int b = 7;
        double e = 40.0;
        double f = 8.0;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(e * f);
        System.out.println(e / f);

        String str = "fig";
        String str1 = str + "AAA";
        String str2 = str1.concat("ase");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        String digit = "625";
        int kv25 = Integer.parseInt(digit);
        System.out.println(a + kv25);
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 8;
        arr[4] = 16;
        for (int k : arr)
        {
            System.out.println(k);
        }
        System.out.println("\n");

        her k = new her("Kolya", 25);
        her m = new her("Masha", 19);
        System.out.println(k);
        System.out.println(m);*/