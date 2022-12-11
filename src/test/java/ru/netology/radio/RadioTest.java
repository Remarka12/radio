package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test

    public void souldSetStation() {

        Radio radio = new Radio();
        radio.setStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetUncorrectStation() {
        Radio radio = new Radio();
        radio.setStation(-10);

        int expected = 0;
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
    public void shouldNextAfterMax() {

        Radio radio = new Radio();
        radio.setStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldOnPrev() {

        Radio radio = new Radio();
        radio.setStation(4);

        radio.prev();

        int expected = 3;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldOnPrevAfterMin() {

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
        radio.setVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
@Test

public void shouldNotSetUncorrectVolume(){

    Radio radio = new Radio();
    radio.setVolume(11);

    int expected = 0;
    int actual = radio.getCurrentVolume();
    Assertions.assertEquals(expected, actual);
}

    @Test

    public void shouldAddVolume() {

        Radio radio = new Radio();
        radio.setVolume(9);
        radio.increaseVolume();


        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldStopAddVolume() {

        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDownVolume() {

        Radio radio = new Radio();
        radio.setVolume(5);

        radio.downVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStopDownVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.downVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMinusVolume(){
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}