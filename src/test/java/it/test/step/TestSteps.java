package it.test.step;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ChainBase;

public class TestSteps {
    private ChainBase steps;
    private Context context;

    public TestSteps(Context context) {
        this.context = context;
        this.steps = new ChainBase();
    }

    public TestSteps add(Command step) {
        this.steps.addCommand(step);
        return this;
    }

    public void execute() {
        try {
            this.steps.execute(this.context);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            this.steps = new ChainBase();
        }

    }
}
