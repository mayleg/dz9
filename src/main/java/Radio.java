public class Radio {
    private int currentstation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }
    public void next() {
        if (currentstation != maxStation) {
            currentstation++;
        } else {
            currentstation = 0;
        }
    }
    public void prev() {
        if (currentstation != 0) {
            currentstation --;
        } else {
            currentstation = maxStation;
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
        if (currentstation > maxStation) {
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
