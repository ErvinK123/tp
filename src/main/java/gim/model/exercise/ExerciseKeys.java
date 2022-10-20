package gim.model.exercise;

import java.util.ArrayList;

/**
 * A class that contains the Keys in the Exercise Hashmap.
 */
public class ExerciseKeys {

    private ArrayList<String> keyArrayList;

    /**
     * Creates a {@code ExerciseKeys}.
     */
    public ExerciseKeys(ArrayList<String> arrL) {
        keyArrayList = arrL;
    }

    /**
     * Returns the formatted display based on the current state of the Hashmap.
     * @return String
     */
    public String getDisplay() {
        if (keyArrayList.size() == 0) {
            return "You have no stored exercises in the system!";
        }
        StringBuilder sb = new StringBuilder("Stored exercises:\n");
        for (int i = 1; i < keyArrayList.size() + 1; i++) {
            sb.append(i);
            sb.append(". ");
            sb.append(keyArrayList.get(i - 1));
            sb.append("\n");
        }
        return sb.toString();
    }

}