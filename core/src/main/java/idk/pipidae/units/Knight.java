package idk.pipidae.units;

public class Knight implements Title{
    public Knight(Title title){
        this.title = title;
    }

    public Title demote(){
        return new Lowborn(getName(), getHealth());
    }

    public void update(){
        unitDecision().perform();
    }

    public Action unitDecision(){
        return new Walk(this);
    }

    public String getName(){
        return title.getName;
    }

    public int getHealth(){
        return title.getHealth;
    }

    public List<Action> getActionlist(){
        return title.getActionlist();
    }

    protected final Title title;
}
