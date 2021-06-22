package ru.pas;

//import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SquareBoard extends Board {
    public SquareBoard(int size){
        width = size;
        height = size;
    }

    @Override
    void fillBoard(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();
        for (int i = 0; i < height; i ++){
            for (int j = 0; j < width; j++) {
                if (listIterator.hasNext()) {
                    addItem(new Key(i, j), listIterator.next());
                } else {
                    addItem(new Key(i, j), null);
                }
            }
        }
    }

    @Override
    List<Key> availableSpace() {
        List<Key> availableKeys = new ArrayList<>();
        for (int i = 0; i < height; i ++) {
            for (int j = 0; j < width; j++) {
                if(getValue(getKey(i, j)) == null){
                    availableKeys.add(getKey(i, j));
                }
            }
        }
        return availableKeys;
    }

    @Override
    void addItem(Key key, Integer value) {
        board.put(key, value);
    }

    @Override
    Key getKey(int i, int j) {
        for(Key key: board.keySet()){
            if (key.getI() == i && key.getJ() == j){
                return key;
            }
        }
        return null;
    }

    @Override
    Integer getValue(Key key) {
        return board.get(key);
        //return null;
    }

    @Override
    List<Key> getColumn(int j) {
        List<Key> columnKeys = new ArrayList<>();
        for (int i = 0; i < height; i ++) {
            columnKeys.add(getKey(i, j));
        }
        return columnKeys;
    }

    @Override
    List<Key> getRow(int i) {
        List<Key> rowKeys = new ArrayList<>();
        for (int j = 0; j < width; j ++) {
            rowKeys.add(getKey(i, j));
        }
        return rowKeys;
    }

    @Override
    boolean hasValue(Integer value) {
        for(Key key: board.keySet()){
            if (board.get(key) == value){
                return true;
            }
        }
        return false;
    }

    @Override
    List<Integer> getValues(List<Key> keys) {
        List<Integer> valuesByKeys = new ArrayList<>();
        ListIterator<Key> keysIterator = keys.listIterator();
        while (keysIterator.hasNext()){
            valuesByKeys.add(board.get(keysIterator.next()));
        }
        return valuesByKeys;
    }
}
