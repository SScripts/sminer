package sminer.nodes;


import org.powerbot.script.methods.MethodProvider;
import sminer.cons.Cons;
import sminer.cons.Vars;
import org.powerbot.script.methods.MethodContext;
import org.powerbot.script.util.Timer;
import org.powerbot.script.wrappers.GameObject;

public class Mining extends MethodProvider implements Node {
    public Mining(MethodContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return ctx.backpack.size() < 28
                && (Cons.BARBAREA.contains(ctx.players.local())
                || Cons.VARAREA.contains(ctx.players.local()))
                || Cons.ALKHARID.contains(ctx.players.local())
                && !ctx.objects.select().id(Cons.ROCK).nearest().first().isEmpty();
    }

    @Override
    public void execute() {
        for (GameObject rock : ctx.objects) {
            if (rock.isOnScreen()) {
                if (rock.interact("Mine")) {
                    Vars.Status = "Mining";
                    Timer t = new Timer(3000);
                    while (t.isRunning() && rock.isValid()) {
                        sleep(100, 150);
                    }
                }
            } else {
                ctx.camera.turnTo(rock);
                Vars.Status = "Looking for the rock";
                if (!rock.isOnScreen() && rock.getLocation().distanceTo(ctx.players.local()) > 5) {
                    ctx.movement.stepTowards(rock);
                    sleep(600, 1600);
                }
            }
        }
    }
}
