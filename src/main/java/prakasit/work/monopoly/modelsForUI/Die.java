// Nisit Code : 6510450585
// Name : Prakasit Jaiharn

package prakasit.work.monopoly.modelsForUI;

public class Die {
    private int faceValue;

    public Die(){};
    public int getFaceValue() {
        return faceValue;
    }

    public void roll(){
        this.faceValue =  (int) Math.ceil(Math.random()*6);
    }
}