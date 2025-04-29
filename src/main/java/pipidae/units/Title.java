package pipidae.units;

public abstract class Title{
    public Title(String name, TitleRank title, int age, int health){
        this.name=name;
        this.title=title;
        this.age=age;
        this.health=health;
    }

    //updates the unit using utility ai model
    public void update(List<Need> needs, List<Order> orders){
        Action action = unitDecision(needs, orders);
        performAction(action);
    }

    //Evaluates what needs or orders are more important, then returns the action.
    //Needs denote things such as hunger/thirst.
    //Orders denote given commands from other units.
    protected void unitDecision(List<Need> needs, List<Orders> orders){
        //
    }

    //Performs an action-
    protected void performAction(Action action){
        //
    }
    
    public String getName(){
        return name;
    }
    
    public TitleRank getTitle(){
        return title;
    }
    
    public int getAge(){
        return age;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    
    public void setHealth(int health){
        this.health=health;
    }
    
    private String name;
    private TitleRank title;
    private int age;
    private int health;
}
