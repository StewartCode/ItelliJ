public class Bottle {

    private int volume;


    public Bottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int empty(){
        return this.volume = 0;
    }

    public int fill(){
        return this.volume = 100;
    }

    public int drink(){
        return this.volume -= 10;
    }

}




