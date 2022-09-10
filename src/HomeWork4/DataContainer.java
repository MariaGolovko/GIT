package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer<T> {
    private T[] data;

    DataContainer(T[] data){
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    /**метод int add(T item) который добавляет данные во внутреннее поле data и возвращает номер позиции в которую были вставлены данные, начиная с 0.
     *
     * @param item значение, которое передаем в data
     * @return возвращает номер позиции в которую были вставлены данные (возвращает -1, если item = null)
     */
    public int add(T item){
        if (item == null){
            return -1;
        }

        for( int i = 0; i < data.length; i++){
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        if (data.length == 0){
            data = Arrays.copyOf(data, data.length+1);
            data[data.length-1] = item;
        }
        return data.length-1;
    }


    /**
     * метод T get(int index). Данный метод получает из DataContainer'а, из поля data, предварительно сохранённый объект (item) который мы передали через метод add.
     * @param index номер позиции в которую были вставлены данные
     * @return объект (значение), которое сохранено под индексом index, возвращает null, если длина массива меньше указанного индекса
     */
    public T get(int index){
        if (index >=0 && index < data.length){
        return data[index];
    }else {
            return null;
        }
    }
    /**
     * метод возвращает массив (его копию!!!) из поля data
     */
    public T[] getItems(){
        return Arrays.copyOf(data, data.length);
    }

    /**
     * метод boolean delete(int index) удаляет элемент из поля data по индексу
     * @param index номер элемента, который удаляют
     * @return возвращает true, если получилось удалить данные; false, если нет такого индекса
     */
    public boolean delete(int index){
        if (index <=0 && index > data.length-1){
            return false;
        }

        for (int i = index; i < data.length; i++){
            data[i - 1] = data[i];
            }
        data = Arrays.copyOf(data, data.length-1);

        return true;
    }

    /**
     * метод boolean delete(T item) будет удалять элемент из нашего поля data
     * @param item значение элемента, которое будет удалено
     * @return возвращает true, если элемент с таким значением удален; false - если значение item = null или если элемента с таким значением нет
     */
    public boolean delete(T item){
        if (item == null){
            return false;
        }
        for (int i = 0; i < data.length; i++){
            if (Objects.equals(data[i], item)){
                //return delete(i);

                data[i] = data[i+1];
                data = Arrays.copyOf(data, data.length-1);
                return true;

            }
        }return false;
    }

    /**
     * метод void sort(Comparator<T> comparator) занимается сортировкой данных записанных в поле data
     * @param comparator передаваемый объект
     */
    public void sort(Comparator<T> comparator){
        boolean sorted;
        do{
            sorted = true;
            for (int i = 0; i < data.length; i++){
                if ((comparator.compare(data[i], data[i+1]) > 0)){
                    sorted = false;
                    T tmp = data[i+1];
                    data[i+1] = data[i];
                    data[i] = tmp;
                }
            }
        } while (!sorted);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        boolean needComma = false;
        for (T item : data){
            if (item != null) {
                if (needComma) {
                    builder.append(", ");
                } else {
                    needComma = true;
                }
                builder.append(item);
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public static <T> void sort(DataContainer<T> container){

    }

    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator){
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < container.data.length - 1; i++){
                if (comparator.compare(container.data[i], container.data[i + 1]) > 0){
                    sorted = false;
                    T tmp = container.data[i + 1];
                    container.data[i + 1] = container.data[i];
                    container.data[i] = tmp;
                }
            }
        }while (!sorted);
    }
}
