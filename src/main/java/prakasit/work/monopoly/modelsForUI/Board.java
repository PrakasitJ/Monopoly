// Nisit Code : 6510450585
// Name : Prakasit Jaiharn

package prakasit.work.monopoly.modelsForUI;

import javafx.util.Pair;

import java.util.LinkedHashMap;
import java.util.Set;

public class Board {
    private LinkedHashMap<String, Pair<Integer, Square>> squares;

    public Board() {
        this.squares = new LinkedHashMap<>();

        squares.put("Go", new Pair<>(0, new Square("Go")));
        squares.put("Mediterranean Avenue", new Pair<>(1, new Square("Mediterranean Avenue")));
        squares.put("Community Chest 1", new Pair<>(2, new Square("Community Chest 1")));
        squares.put("Baltic Avenue", new Pair<>(3, new Square("Baltic Avenue")));
        squares.put("Income Tax", new Pair<>(4, new Square("Income Tax")));
        squares.put("Reading Railroad", new Pair<>(5, new Square("Reading Railroad")));
        squares.put("Oriental Avenue", new Pair<>(6, new Square("Oriental Avenue")));
        squares.put("Chance 1", new Pair<>(7, new Square("Chance 1")));
        squares.put("Vermont Avenue", new Pair<>(8, new Square("Vermont Avenue")));
        squares.put("Connecticut Avenue", new Pair<>(9, new Square("Connecticut Avenue")));
        squares.put("Jail", new Pair<>(10, new Square("Jail")));
        squares.put("St. Charles Place", new Pair<>(11, new Square("St. Charles Place")));
        squares.put("Electric Company", new Pair<>(12, new Square("Electric Company")));
        squares.put("States Avenue", new Pair<>(13, new Square("States Avenue")));
        squares.put("Virginia Avenue", new Pair<>(14, new Square("Virginia Avenue")));
        squares.put("Pennsylvania Railroad", new Pair<>(15, new Square("Pennsylvania Railroad")));
        squares.put("St. James Place", new Pair<>(16, new Square("St. James Place")));
        squares.put("Community Chest 2", new Pair<>(17, new Square("Community Chest 2")));
        squares.put("Tennessee Avenue", new Pair<>(18, new Square("Tennessee Avenue")));
        squares.put("New York Avenue", new Pair<>(19, new Square("New York Avenue")));
        squares.put("Free Parking", new Pair<>(20, new Square("Free Parking")));
        squares.put("Kentucky Avenue", new Pair<>(21, new Square("Kentucky Avenue")));
        squares.put("Chance 2", new Pair<>(22, new Square("Chance 2")));
        squares.put("Indiana Avenue", new Pair<>(23, new Square("Indiana Avenue")));
        squares.put("Illinois Avenue", new Pair<>(24, new Square("Illinois Avenue")));
        squares.put("B&O Railroad", new Pair<>(25, new Square("B&O Railroad")));
        squares.put("Atlantic Avenue", new Pair<>(26, new Square("Atlantic Avenue")));
        squares.put("Ventnor Avenue", new Pair<>(27, new Square("Ventnor Avenue")));
        squares.put("Water Works", new Pair<>(28, new Square("Water Works")));
        squares.put("Marvin Gardens", new Pair<>(29, new Square("Marvin Gardens")));
        squares.put("Go to Jail", new Pair<>(30, new Square("Go to Jail")));
        squares.put("Pacific Avenue", new Pair<>(31, new Square("Pacific Avenue")));
        squares.put("North Carolina Avenue", new Pair<>(32, new Square("North Carolina Avenue")));
        squares.put("Community Chest 3", new Pair<>(33, new Square("Community Chest 3")));
        squares.put("Pennsylvania Avenue", new Pair<>(34, new Square("Pennsylvania Avenue")));
        squares.put("Short Line Railroad", new Pair<>(35, new Square("Short Line Railroad")));
        squares.put("Chance 3", new Pair<>(36, new Square("Chance 3")));
        squares.put("Park Place", new Pair<>(37, new Square("Park Place")));
        squares.put("Luxury Tax", new Pair<>(38, new Square("Luxury Tax")));
        squares.put("Boardwalk", new Pair<>(39, new Square("Boardwalk")));

    }

    public Square getSquare(Square oldLoc, int fvTot) {
        if (oldLoc == null) {
            System.out.println("Error: oldLoc is null");
            return null;
        }

        Pair<Integer, Square> pair = squares.get(oldLoc.getName());
        if (pair == null) {
            System.out.println("Error: No square found for name " + oldLoc.getName());
            return null;
        }

        Set<String> keySet = squares.keySet();
        String[] keyArray = keySet.toArray(new String[0]);

        Integer index = (pair.getKey() + fvTot) % 40;
        String key = keyArray[index];

        System.out.println("Old: " + oldLoc.getName());
        System.out.println("New: " + key + "\n");

        Pair<Integer, Square> newPair = squares.get(key);
        if (newPair == null) {
            System.out.println("Error: No square found for key " + key);
            return null;
        }

        return newPair.getValue();
    }
}