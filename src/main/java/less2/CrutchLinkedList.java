package less2;

public class CrutchLinkedList<T> implements CrutchList<T> {

    private Item<T> firsElement;
    private Item<T> lastElement;

    public class Item<T> {
        private T value;

        private Item<T> next;
        private Item<T> previous;

        public Item(T value) {
            this.value = value;
        }
    }

    private Item<T> getItemByIndex(int index) {
        Item<T> item = firsElement;
        try {
            if (item == null) {
                throw new NullPointerException("В листе нет элементов");
            }
            for (int i = 0; i < index; i++) {
                if (item.next != null) {
                    item = item.next;
                } else {
                    throw new NullPointerException("Элемента с индексом " + index + " не существет.");
                }
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return item;
    }


    @Override
    public T get(int index) {
        return getItemByIndex(index).value;
    }

    @Override
    public void add(T element) {
        if (firsElement == null) {
            firsElement = new Item<>(element);
            lastElement = firsElement;
        } else {
            Item<T> item = new Item<>(element);
            lastElement.next = item;
            item.previous = lastElement;
            lastElement = item;
        }

    }

    @Override
    public void replaceWith(int index, T element) {
        Item<T> itemNew = new Item<>(element);
        if (index == 0) {
            itemNew.next = firsElement.next;
            firsElement = itemNew;
            return;
        }
        Item<T> item = getItemByIndex(index);
        if (item == lastElement) {
            itemNew.previous = lastElement.previous;
            lastElement = itemNew;
        } else {
            Item<T> nextItem=item.next;
            Item<T> prevItem=item.previous;
            itemNew.next=nextItem;
            nextItem.previous=itemNew;
            itemNew.previous=prevItem;
            prevItem.next=itemNew;
        }

    }

    @Override
    public void setInPos(int index, T element) {
        Item<T> itemNew = new Item<>(element);
        if (index == 0) {
            firsElement.previous = itemNew;
            itemNew.next = firsElement;
            firsElement = itemNew;
            return;
        }
        Item<T> item = getItemByIndex(index - 1);
        if (item == lastElement) {
            lastElement.next = itemNew;
            itemNew.previous = lastElement;
            lastElement = itemNew;
        } else {
            itemNew.previous = item;
            Item<T> nextItem=item.next;
            itemNew.next=nextItem;
            nextItem.previous=itemNew;
            item.next=itemNew;
        }
    }




    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Item<T> item = firsElement;
        do {
            str.append(item.value.toString() + ", ");
            item = item.next;
        } while (item.next != null);
        str.append(item.value.toString());
        return str.toString();
    }
}
