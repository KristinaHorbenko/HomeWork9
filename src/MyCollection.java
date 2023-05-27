import java.util.Arrays;

public class MyCollection implements Collection {
    private String[] array;
    private int size;
    public MyCollection() {
        array = new String[10];
        size = 0;
    }
    public void increaseCapacity() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }
    public void display() {
        for (String o : array) {
            System.out.print(o + " ");
        }
    }

    @Override
    public boolean add(String o) {
        array[size++] = o;
        return true;
    }
    @Override
    public boolean add(int index, String o) {
        if (index < 0 || index > size) {
            return false;
        }
        if (size == array.length) {
            increaseCapacity();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = o;
        size++;
        return true;

    }

    @Override
    public boolean delete(String o) {
        for (int i = 0; i < size; i++) {

            if (array[i].equals(o)) {

                return delete(String.valueOf(i));
            }
        }

        return true;

    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];

    }

    @Override
    public boolean contain(String o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        if (size != str.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!array[i].equals(str.get(i))) {
                return false;
            }
        }
        return true;
    }




    @Override
    public boolean clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
        return true;

    }

    @Override
    public int size() {
        return array.length;

       }
  }



