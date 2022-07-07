package mod.gate.skyblock;

import java.util.Locale;

public enum Skills {
    //This entire file should probably be pulled from online at some point rather than hard coded (possibly NEU's repo if we get permission)
    FARMING(0, 60),
    MINING(1, 60),
    COMBAT(2, 60),
    FORAGING(3, 50),
    FISHING(4, 50),
    ENCHANTING(5, 60),
    ALCHEMY(6, 50),
    CARPENTRY(7, 50),
    RUNECRAFTING(8, 25),
    SOCIAL(9, 25),
    TAMING(10, 50),
    DUNGEONEERING(11, 50);
    

    private int id;
    private int max;

    Skills(int id, int max) {
        this.id = id;
        this.max = max;
    }

    public int getId() {
        return id;
    }

    public int getMax() {
        return max;
    }

    public String getName() {
        return this.toString();
    }

    public static Skills getByName(String name) {
        try {
            return valueOf(name.toUpperCase(Locale.ROOT));
        } catch(Exception e) {
            e.printStackTrace();
            return FORAGING;
        }

    }

}
