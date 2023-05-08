package less2;



public class ListTest {

    public static void main(String[] args) {

        CrutchList<Integer> intList = new CrutchLinkedList<>();

        intList.add(1);
        intList.add(44);
        intList.add(21);
        intList.add(3);

        System.out.println(intList);

        System.out.println(intList.get(2));

        intList.setInPos(3,70);

        System.out.println(intList);

        intList.setInPos(3,70);

        System.out.println(intList);




        System.out.println();
        System.out.println();
        System.out.println();

        CrutchList<Integer> arrList = new CrutchArrayList<>();

        arrList.add(3);
        arrList.add(23);
        arrList.add(42);
        arrList.add(88);
        arrList.add(56);

        System.out.println(arrList);









    }
}
