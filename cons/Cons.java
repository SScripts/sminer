package sminer.cons;

import org.powerbot.script.methods.MethodContext;
import org.powerbot.script.wrappers.Area;
import org.powerbot.script.wrappers.Tile;


public class Cons {

    public static int[] ROCK = {};

    public static MethodContext ctx;

    public static final Area BARBAREA = new Area(new Tile[] { new Tile(3072, 3433, 0), new Tile(3071, 3400, 0), new Tile(3087, 3403, 0),
            new Tile(3088, 3434, 0) });

    public static final Area VARAREA = new Area(new Tile[] { new Tile(3181, 3382, 0), new Tile(3170, 3366, 0), new Tile(3178, 3359, 0),
            new Tile(3194, 3372, 0) });

    public static final Area VARBANK = new Area(new Tile[] { new Tile(3179, 3446, 0), new Tile(3179, 3432, 0), new Tile(3195, 3432, 0),
            new Tile(3194, 3447, 0) });

    public static final Area ALKHARID = new Area(new Tile[] { new Tile(3288, 3322, 0), new Tile(3289, 3283, 0), new Tile(3316, 3282, 0),
            new Tile(3314, 3321, 0) });

    public static final Area EDGEBANK = new Area(new Tile[] { new Tile(3089, 3502, 0), new Tile(3088, 3486, 0), new Tile(3101, 3487, 0),
            new Tile(3101, 3500, 0) });

    public static final Area ALBANK = new Area(new Tile[] { new Tile(3267, 3175, 0), new Tile(3267, 3161, 0), new Tile(3274, 3161, 0),
            new Tile(3274, 3175, 0) });
}
