package ru.netology.radio;

public class Radio {

    private int currentVolume;
    private int numberStation;

    public int getNumberStation() {
        return numberStation;
    }

    public void setStation(int newNumberStation) {
        if (newNumberStation > 9) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }
        numberStation = newNumberStation;
    }

    public int next() {

        if (numberStation != 9) {
            numberStation++;
        } else {
            numberStation = 0;
        }
        return numberStation;
    }

    public int prev() {
        if (numberStation != 0) {
            numberStation--;
        } else {
            numberStation = 9;
        }
        return numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if(currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume(){
        if(currentVolume > 0){
            currentVolume = currentVolume - 1;
        }
    }
}