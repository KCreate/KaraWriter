import javakara.JavaKaraProgram;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class KaraWriter extends JavaKaraProgram {
    public void myProgram() {
        // Iterate over the string
        for (char a: "HALLO ROGER AEPLI WIE GEHT ES IHNEN".toCharArray()) {
            String c = String.valueOf(a);
            kara.turnRight();
            writeLetter(getCharacterMap(c));
            kara.turnLeft();
            moveBy(4);
        }
    }

    public void moveBy(int amount) {
        for (int i=0; i<amount; i++) {
            kara.move();
        }
    }

    public int[] getCharacterMap(String letter) {
        Map<String, int[]> characters = new HashMap<String, int[]>();
        characters.put("A", new int[]{
             0,1,0,
             1,1,1,
             1,0,1
        });
        characters.put("B", new int[]{
             1,1,0,
             1,1,1,
             1,1,1
        });
        characters.put("C", new int[]{
             1,1,1,
             1,0,0,
             1,1,1
        });
        characters.put("D", new int[]{
             1,1,0,
             1,0,1,
             1,1,0
        });
        characters.put("E", new int[]{
             1,1,1,
             1,1,0,
             1,1,1
        });
        characters.put("F", new int[]{
             1,1,1,
             1,1,0,
             1,0,0
        });

        characters.put("G", new int[]{
             1,1,0,
             1,0,1,
             1,1,1
        });
        characters.put("H", new int[]{
             1,0,1,
             1,1,1,
             1,0,1
        });
        characters.put("I", new int[]{
             1,1,1,
             0,1,0,
             1,1,1
        });
        characters.put("J", new int[]{
             0,0,1,
             1,0,1,
             1,1,1
        });
        characters.put("K", new int[]{
             1,0,1,
             1,1,0,
             1,0,1
        });
        characters.put("L", new int[]{
             1,0,0,
             1,0,0,
             1,1,1
        });

        characters.put("M", new int[]{
             1,1,1,
             1,1,1,
             1,0,1
        });
        characters.put("N", new int[]{
             1,1,1,
             1,0,1,
             1,0,1
        });
        characters.put("O", new int[]{
             1,1,1,
             1,0,1,
             1,1,1
        });
        characters.put("P", new int[]{
             1,1,1,
             1,1,1,
             1,0,0
        });
        characters.put("Q", new int[]{
             1,1,1,
             1,1,1,
             0,0,1
        });
        characters.put("R", new int[]{
             1,1,1,
             1,0,0,
             1,0,0
        });

        characters.put("S", new int[]{
             0,1,1,
             0,1,0,
             1,1,0
        });
        characters.put("T", new int[]{
             1,1,1,
             0,1,0,
             0,1,0
        });
        characters.put("U", new int[]{
             1,0,1,
             1,0,1,
             1,1,1
        });
        characters.put("V", new int[]{
             1,0,1,
             1,0,1,
             0,1,0
        });
        characters.put("W", new int[]{
             1,0,1,
             1,1,1,
             1,1,1
        });
        characters.put("X", new int[]{
             1,0,1,
             0,1,0,
             1,0,1
        });

        characters.put("Y", new int[]{
             1,0,1,
             0,1,0,
             0,1,0
        });
        characters.put("Z", new int[]{
             1,1,0,
             0,1,0,
             0,1,1
        });
        characters.put(" ", new int[]{
             0,0,0,
             0,0,0,
             0,0,0
        });

        return characters.get(letter);
    }

    public void writeLetter(int[] letter) {
        // initial move
        moveBy(1);

        // check for each position
        if (letter[0]==1) {
            kara.putLeaf();
        }
        moveBy(1);

        if (letter[3]==1) {
            kara.putLeaf();
        }
        moveBy(1);

        if (letter[6]==1) {
            kara.putLeaf();
        }
        kara.turnLeft();
        moveBy(1);

        if (letter[7]==1) {
            kara.putLeaf();
        }
        moveBy(1);

        if (letter[8]==1) {
            kara.putLeaf();
        }
        kara.turnLeft();
        moveBy(1);

        if (letter[5]==1) {
            kara.putLeaf();
        }
        moveBy(1);

        if (letter[2]==1) {
            kara.putLeaf();
        }
        kara.turnLeft();
        moveBy(1);

        if (letter[1]==1) {
            kara.putLeaf();
        }
        kara.turnLeft();
        moveBy(1);

        if (letter[4]==1) {
            kara.putLeaf();
        }
        kara.turnLeft();
        kara.turnLeft();
        moveBy(2);
        kara.turnLeft();
        moveBy(1);
        kara.turnLeft();
    }
}
