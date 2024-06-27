// Nisit Code : 6510450585
// Name : Prakasit Jaiharn

package prakasit.work.monopoly.models;

import javafx.util.Pair;
import java.util.LinkedHashMap;
import java.util.Set;

public class Board {
    private LinkedHashMap<String, Pair<Integer,Square>> squares;

    public Board() {
        this.squares = new LinkedHashMap<>();
        squares.put("Start", new Pair<>(0,new Square("Start")));
        for(int i = 1;i < 40; i++) {
            squares.put("Location : "+i, new Pair<>(i,new Square("Location : "+i)));
        }
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        Pair<Integer, Square> pair = squares.get(oldLoc.getName());
        Set<String> keySet = squares.keySet();
        String[] keyArray = keySet.toArray(new String[keySet.size()]);

        Integer index = (pair.getKey() + fvTot)%40;
        String key = keyArray[index];
        System.out.println("Old : " + oldLoc.getName());
        System.out.println("New : " + key+"\n");
        return squares.get(key).getValue();
    }
}