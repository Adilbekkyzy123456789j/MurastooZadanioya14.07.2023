public class Car {


    private String colour;
    private int obem;
    private int ml;


    public Car() {
    }

    public Car(String colour, int obem, int ml) {
        this.colour = colour;
        this.obem = obem;
        this.ml = ml;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getObem() {
        return obem;
    }

    public void setObem(int obem) {
        this.obem = obem;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", obem=" + obem +
                ", ml=" + ml +
                '}';
    }
}
