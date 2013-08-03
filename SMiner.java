package sminer;


import sminer.framework.Master;
import sminer.nodes.*;
import sminer.cons.Vars;
import org.powerbot.event.PaintListener;
import org.powerbot.script.Manifest;
import org.powerbot.script.PollingScript;
import org.powerbot.script.methods.Skills;
import sminer.nodes.Banking;

import java.awt.*;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;


@Manifest(name = "SMiner", description = "Mines Ore´s", authors = {"SScripts"}, version = 1.1)
public class SMiner extends PollingScript implements PaintListener {


    gui g = new gui();


    private final Queue<Node> bankNodes = new ConcurrentLinkedQueue<>();
    private final Queue<Node> craftNodes = new ConcurrentLinkedQueue<>();


    public SMiner() {
        getExecQueue(State.START).offer(new Runnable() {

            @Override
            public void run() {



                final gui gui = new gui();

                final Master master = gui.getSelectedEnum();

                final Node bank = new Banking(ctx);
                final Node toMine = Walk.createMinePathInstance(ctx, master.path());

                final Node mine = new Mining(ctx);
                final Node toBank = Walk.createBankPathInstance(ctx, master.path());

                craftNodes.addAll(Arrays.asList(mine, toMine));
                bankNodes.addAll(Arrays.asList(bank, toBank));
            }
        });
    }




    @Override
    public int poll() {

        if (Vars.dontstart) {
            return 250;
        }
        final Queue<Node> tree = ctx.backpack.select().size() == 28 ? bankNodes : craftNodes;
        for (Node node : tree) {
            if(node.activate()) {
                node.execute();
                break;
            }
        }
        return 150;

    }



    public static void startScript(){
        Vars.dontstart = false;
    }



    @Override
    public void start() {

        Vars.StartEXP = ctx.skills.getExperience(Skills.MINING);
        g.setSize(260,323);
        g.setVisible(true);

    }

    @Override
    public void repaint(Graphics g) {

        if (ctx.game.getClientState()  == 11) {


            g.setColor(Color.GREEN);
            g.setFont(Vars.font1);
            g.drawString("Time Run:", 80, 100);
            g.drawString("" + Vars.runTime.toElapsedString(), 180, 100);
            g.drawString("EXP Gaind:" + (ctx.skills.getExperience(Skills.MINING)-Vars.StartEXP), 80, 125);
            g.drawString("EXP/H:"+ (getPerHour(ctx.skills.getExperience(Skills.MINING)-Vars.StartEXP)), 80, 150);
            g.drawString("Status:" + Vars.Status, 80, 175);

        }

    }
    private static int getPerHour(final int value) {
        if (Vars.runTime != null && Vars.runTime.getElapsed() > 0) {
            return (int) (value * 3600000d / Vars.runTime.getElapsed());
        } else {
            return 0;
        }
    }
}


