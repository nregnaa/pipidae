package idk.pipidae.units;

public class Duke extends Baron{
    public Duke(Title title){
        super(title);
    }

    public Title demote(){
        return new Baron(new Lowborn(getName(), getHealth()));
    }
}
