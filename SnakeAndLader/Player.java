public class Player {
    String name;
    int location;

    Player(String name, int location) {
        this.name = name;
        this.location = location;
    }

    public void setlocation(int newLoc) {
        location = newLoc;
    }

    public int getLocation() {
        return location;
    }
}
