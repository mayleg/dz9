public class Radio {
    private int currentstation;
    private int currentVolume;
    public void next() {
        if (currentstation != 9) {
            currentstation++;
        } else {
            currentstation = 0;
        }
    }
    public void prev() {
        if (currentstation != 0) {
            currentstation --;
        } else {
            currentstation = 9;
        }
    }

    public void nextVolume() {
        if (currentVolume != 100) {
            currentVolume ++;
        } else currentVolume = 100;
    }

    public void prevVolume() {
        if (currentVolume != 0) {
            currentVolume --;
        } else currentVolume = 0;
    }

    public int getCurrentstation() {
        return currentstation;
    }

    public void setCurrentstation(int currentstation) {
        if (currentstation < 0) {
            return;
        }
        if (currentstation > 9) {
            return;
        }
        this.currentstation = currentstation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
