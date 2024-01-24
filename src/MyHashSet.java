
    import java.util.Arrays;

    public class MyHashSet<T> {
        private static final int INITIAL_CAPACITY = 5;
        private Object[] elements = new Object[INITIAL_CAPACITY];
        private int size;

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void add(T element) {
            if (!contains(element)) {
                ensureCapacity();
                elements[size++] = element;
            }
        }

        public boolean contains(T element) {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(element)) {
                    return true;
                }
            }
            return false;
        }

        public void remove(T element) {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(element)) {

                    System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                    size--;
                    return;
                }
            }
        }

        private void ensureCapacity() {
            if (size == elements.length) {
                elements = Arrays.copyOf(elements, size * 2);
            }
        }
    }

