package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test

    public void souldSetStation() {

        Radio radio = new Radio();
        radio.setStation(1);

        int expected = 1;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldOnNext() {

        Radio radio = new Radio();
        radio.setStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldOnPrev() {

        Radio radio = new Radio();
        radio.setStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetVolume() {

        Radio radio = new Radio();
        radio.setVolume(4);

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldAddVolume(){

        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();


        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDownVolume(){

        Radio radio = new Radio();
        radio.setVolume(1);

        radio.downVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}