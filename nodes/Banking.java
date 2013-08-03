package sminer.nodes;


import org.powerbot.script.methods.MethodProvider;
import sminer.cons.Cons;
import sminer.cons.Vars;
import org.powerbot.script.methods.MethodContext;
import org.powerbot.script.util.Delay;



public class Banking extends MethodProvider implements Node {
    public Banking(MethodContext ctx) {
        super(ctx);
    }



    @Override
    public boolean activate() {
        return ctx.backpack.select().size() == 28 && Cons.VARBANK.contains(ctx.players.local())|| Cons.ALBANK.contains(ctx.players.local());
    }

    @Override
    public void execute() {

        Vars.Status = "Deposit";
        ctx.bank.depositInventory();
        if (ctx.backpack.select().size() == 0 && ctx.bank.isOpen()) {
            Delay.sleep(100,250);
            Vars.Status = "Closing Bank";
            ctx.bank.close();


        }else if (ctx.bank.isOpen() && ctx.backpack.select().size() == 0){
            ctx.bank.close();
            Delay.sleep(100,250);
        }

        else {

            Vars.Status = "Opening Bank";
            ctx.bank.open();
        }
    }

}