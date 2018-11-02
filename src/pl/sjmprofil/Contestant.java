package pl.sjmprofil;

public abstract class Contestant {

    private String name;

    public Contestant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
