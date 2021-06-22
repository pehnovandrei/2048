package ru.pas;

import java.util.List;

public class GameHelper {
    List<Integer> moveAndMergeEqual(List <Integer> list){
        int currentIndex, nullCounter;
        currentIndex = 0;
        nullCounter = 0;
        for (Integer integer : list) {
            if (integer == null){
                nullCounter++;
            }else {
                if (nullCounter > 0){
                    list.set(currentIndex, null);
                    list.set(currentIndex - nullCounter, integer);
                }
                if (currentIndex - nullCounter > 0 && list.get(currentIndex - nullCounter).equals(list.get(currentIndex - nullCounter - 1))){
                    list.set(currentIndex - nullCounter - 1, integer*2);
                    list.set(currentIndex - nullCounter, null);
                }
            }
            currentIndex++;
        }
        currentIndex = 0;
        nullCounter = 0;
        for (Integer integer : list) {
            if (integer == null){
                nullCounter++;
            }else {
                if (nullCounter > 0){
                    list.set(currentIndex, null);
                    list.set(currentIndex - nullCounter, integer);
                }
            }
            currentIndex++;
        }
        return list;
    }
}
