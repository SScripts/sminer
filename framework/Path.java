package sminer.framework;


import org.powerbot.script.methods.MethodContext;
import org.powerbot.script.wrappers.Tile;
import org.powerbot.script.wrappers.TilePath;

public enum Path {

    VAR( new Tile(3186, 3433, 0), new Tile(3186, 3428, 0), new Tile(3181, 3428, 0),
            new Tile(3176, 3428, 0), new Tile(3172, 3425, 0), new Tile(3171, 3420, 0),
            new Tile(3171, 3415, 0), new Tile(3171, 3410, 0), new Tile(3171, 3405, 0),
            new Tile(3171, 3400, 0), new Tile(3173, 3395, 0), new Tile(3175, 3391, 0),
            new Tile(3177, 3386, 0), new Tile(3179, 3381, 0), new Tile(3184, 3380, 0),
            new Tile(3186, 3375, 0), new Tile(3185, 3373, 0)),

    BAR(new Tile(3093, 3491, 0), new Tile(3089, 3489, 0), new Tile(3084, 3486, 0),
            new Tile(3082, 3482, 0), new Tile(3080, 3477, 0), new Tile(3079, 3472, 0),
            new Tile(3080, 3467, 0), new Tile(3084, 3464, 0), new Tile(3086, 3462, 0),
            new Tile(3088, 3457, 0), new Tile(3089, 3452, 0), new Tile(3088, 3447, 0),
            new Tile(3089, 3442, 0), new Tile(3089, 3437, 0), new Tile(3090, 3432, 0),
            new Tile(3089, 3427, 0), new Tile(3086, 3423, 0)),

    ALK( new Tile(3271, 3169, 0), new Tile(3275, 3171, 0), new Tile(3276, 3176, 0),
            new Tile(3278, 3181, 0), new Tile(3281, 3185, 0), new Tile(3282, 3190, 0),
            new Tile(3282, 3195, 0), new Tile(3282, 3200, 0), new Tile(3281, 3205, 0),
            new Tile(3280, 3210, 0), new Tile(3280, 3215, 0), new Tile(3280, 3220, 0),
            new Tile(3281, 3225, 0), new Tile(3282, 3230, 0), new Tile(3285, 3235, 0),
            new Tile(3287, 3239, 0), new Tile(3289, 3244, 0), new Tile(3290, 3249, 0),
            new Tile(3293, 3253, 0), new Tile(3294, 3258, 0), new Tile(3294, 3263, 0),
            new Tile(3294, 3268, 0), new Tile(3295, 3273, 0), new Tile(3298, 3277, 0),
            new Tile(3299, 3282, 0), new Tile(3299, 3287, 0), new Tile(3299, 3292, 0),
            new Tile(3299, 3297, 0));

    private final Tile[] tiles;

    Path(Tile... tiles) {
        this.tiles = tiles;
    }

    public Tile[] tiles() {
        return tiles;
    }
}

