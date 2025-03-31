package lld.design.patterns.Command;

public class RemoteControl {

    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }
    public void buttonPressed() {
        this.slot.execute();
    }
}

