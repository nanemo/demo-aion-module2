package services;

public abstract class Animal {
    private int coordinateX;
    private int coordinateY;
    private final String NAME;
    private final Integer SPEED;
    private final Double SATIATE;
    private Double weight;

    public Animal(int coordinateX, int coordinateY, String NAME, Integer SPEED, Double SATIATE, Double weight) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.NAME = NAME;
        this.SPEED = SPEED;
        this.SATIATE = SATIATE;
        this.weight = weight;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getNAME() {
        return NAME;
    }

    public Integer getSPEED() {
        return SPEED;
    }

    public Double getSATIATE() {
        return SATIATE;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public abstract void move();

    public abstract void moveDirection();

    public abstract void bread();

    public abstract void die();

    @Override
    public String toString() {
        return "Animal{" +
               "coordinateX=" + coordinateX +
               ", coordinateY=" + coordinateY +
               ", NAME='" + NAME + '\'' +
               ", SPEED=" + SPEED +
               ", SATIATE=" + SATIATE +
               ", weight=" + weight +
               '}';
    }
}
