import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void changestation1() {
        Radio radio = new Radio(20);
fi
        radio.setCurrentstation(14);

        int expected = 6;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changestation2() {
        Radio radio = new Radio();

        radio.setCurrentstation(-10);

        int expected = 0;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changestation3() {
        Radio radio = new Radio();

        radio.setCurrentstation(20);

        int expected = 0;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changestation4() {
        Radio radio = new Radio();

        radio.setCurrentstation(-1);

        int expected = 0;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changestation6() {
        Radio radio = new Radio();

        radio.setCurrentstation(0);

        int expected = 0;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changestation7() {
        Radio radio = new Radio();

        radio.setCurrentstation(1);

        int expected = 1;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changestation8() {
        Radio radio = new Radio();

        radio.setCurrentstation(8);

        int expected = 8;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changestation9() {
        Radio radio = new Radio();

        radio.setCurrentstation(9);

        int expected = 9;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changestation0() {
        Radio radio = new Radio();

        radio.setCurrentstation(10);

        int expected = 0;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextstation1() {
        Radio radio = new Radio();
        radio.setCurrentstation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextstation2() {
        Radio radio = new Radio();
        radio.setCurrentstation(4);

        radio.next();

        int expected = 5;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextstation3() {
        Radio radio = new Radio();
        radio.setCurrentstation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextstation4() {
        Radio radio = new Radio();
        radio.setCurrentstation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void changevolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(65);

        int expected = 65;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changevolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changevolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(150);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changevolume5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changevolume6() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changevolume7() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changevolume8() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changevolume9() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void changevolume0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void prevstation1() {
        Radio radio = new Radio();
        radio.setCurrentstation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevstation2() {
        Radio radio = new Radio();
        radio.setCurrentstation(4);

        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevstation3() {
        Radio radio = new Radio();
        radio.setCurrentstation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevstation4() {
        Radio radio = new Radio();
        radio.setCurrentstation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentstation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);

        radio.prevVolume();

        int expected = 39;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.prevVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.prevVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.nextVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);

        radio.nextVolume();

        int expected = 41;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.nextVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
