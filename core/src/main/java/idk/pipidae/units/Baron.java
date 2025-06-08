package idk.pipidae.units;

public class Baron extends Knight implements Title{
    public Baron(Title title){
        super(title);
    }

    public Title demote(){
        return new Knight(new Lowborn(getName(), getHealth()));
    }
}
