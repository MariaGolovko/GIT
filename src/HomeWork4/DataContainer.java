package HomeWork4;

import java.util.Arrays;

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
     * @param item значение, которое добавляем в data
     * @return возвращает номер позиции в которую были вставлены данные (возвращает -1, если item = null)
     */
    public int add(T item){
        if (item == null){
            return -1;
        }
        int i;
        for( i = 0; i < data.length; i++){
            if (data[i] != null) {
                i++;
            }else {
                data[i] = item;
                return i;
            }
        }
        if ((data.length == 0) || (i == data.length-1)){
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
        if (index < data.length){
        return data[index];
    }else {
            return null;
        }
    }
    /**
     * метод возвращает массив из поля data
     */
    public T[] getItems(){
        return data;
    }

    /**
     * метод boolean delete(int index) удаляет элемент из поля data по индексу
     * @param index номер элемента, который удаляют
     * @return возвращает true, если получилось удалить данные; false, если нет такого индекса
     */
    public boolean delete(int index){
        if (index > data.length-1){
            return false;
        }else {
            for (int i = 0; i < data.length; i++){
                if(i == index){
                    for(int j = i; j < data.length-1; j++){
                        data[j] = data[j+1];
                    }
                    data = Arrays.copyOf(data, data.length-1);
                }
            }
            return true;
        }
    }
}
