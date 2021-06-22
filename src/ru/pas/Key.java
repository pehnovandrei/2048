package ru.pas;

public class Key {
    int i;
    int j;
    Key(int n, int m){
        i = n;
        j = m;
    }
    void setI(int n){
        i = n;
    }
    void setJ(int m){
        j = m;
    }
    int getI (){
        return i;
    }
    int getJ(){
        return j;
    }
}
