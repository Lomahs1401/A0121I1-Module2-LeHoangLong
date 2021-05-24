package my_arraylist;

import java.util.Arrays;

public class MyArrayList<E> {

    /**
     * số lượng phần tử có trong MyArrayList
     */
    private int size = 0;

    /**
     * Sức chứa của MyArrayList
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Mảng chứa các phần tử Object
     */
    Object elements[];

    /**
     * Constructor ko tham số với sức chứa mặc định là 10
     */
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Constructor với sức chứa capacity được truyền vào
     *
     * @param capacity
     */
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
    }

    /**
     * Thêm 1 element tại vị trí index
     *
     * @param element
     * @param index
     */
    public void add(E element, int index) {
        if (index > elements.length) {
            //thông báo lỗi chương trình
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(10);
        }
        if (elements[index] == null) {
            //gán phần tử element tại vị trí index
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; --i) {
                //gán phần tử ở index i-1 vào index i => Dời các phần tử của mảng
                // Sau khi dời, sẽ tạo một index trống.
                elements[i] = elements[i - 1];
            }
            //Gán phần tử element tại vị trí index trống đó.
            elements[index] = element;
            size++;
        }
    }

    /**
     * Xóa 1 phần tử element khỏi mảng và trả về element đó
     * @param index
     * @return
     */
    public E remove (int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; ++i) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }

    /**
     * Trả về số lượng phần tử của mảng elements
     *
     * @return
     */
    public int size() {
        return this.size;
    }

    /**
     * Tạo bảng sao elements mới
     * @return
     */
    public MyArrayList<E> clone() {
        MyArrayList<E> cloneArrayList = new MyArrayList<>();
        cloneArrayList.elements = Arrays.copyOf(this.elements, this.size);
        cloneArrayList.size = this.size;
        return cloneArrayList;
    }

    /**
     * Kiểm tra phần tử element có trong MyArrayList không hay ko
     *
     * @param element
     * @return
     */
    public boolean contains(E element) {
        //phương thức indexOf trả về một giá trị i. Nếu i >= 0 thì
        //biểu thức so sánh này đúng => Phép toán so sánh trả về true, tức return true.
        return this.indexOf(element) >= 0;
    }

    /**
     * Trả về index của phần tử element trong MyArrayList
     *
     * @param element
     * @return
     */
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    /**
     * Thêm 1 phần tử vào mảng
     *
     * @param element
     * @return
     */
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(10);
        }
        elements[size] = element;
        size++;
        return true;
    }

    /**
     * Tăng kích thước của MyArrayList
     *
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            //tạo biến newSize để lưu kích thước của mảng mới
            int newSize = this.elements.length + minCapacity;
            //copy các phần tử của mảng elements cũ sang mảng mới với kích thước là newSize
            elements = Arrays.copyOf(elements, newSize);
        } else {
            //thông báo lỗi cho người dùng
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    /**
     * Lấy 1 element tại vị trí index
     *
     * @param index
     * @return
     */
    public E get(int index) {
        return (E) elements[index];
    }

    /**
     * Xóa hết các phần tử của elements
     */
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; ++i) {
            elements[i] = null;
        }
    }
}
