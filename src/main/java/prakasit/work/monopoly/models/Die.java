package prakasit.work.monopoly.models;

public class Die {
    private int faceValue;

    public Die(int faceValue) {
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public int roll(){
        return (int) Math.ceil(Math.random()*6);
    }
}