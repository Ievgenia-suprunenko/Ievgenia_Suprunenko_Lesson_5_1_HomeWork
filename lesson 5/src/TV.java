public class TV {
    int channel;
    int volumeLevel;

    public TV() {
        channel = 99;
        volumeLevel = 1;
    }

    public TV(int channel, int volumeLevel) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
    }

    void volumeUp() {
        volumeLevel = volumeLevel + 1;
    }

    void volumeDown() {
        volumeLevel = volumeLevel - 1;
    }

    void channelUp() {
        channel = channel - 1;
    }

    void channelDown() {
        channel = channel - 1;
    }
}
