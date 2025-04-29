package pipidae.units;

public abstract class Title{
    public Title(String name, TitleRank title, int age, int health){
        this.name=name;
        this.title=title;
        this.age=age;
        this.health=health;
    }
    public void update(List<Needs> needs, List<Orders> orders){
        Action action = unitDecision(needs, orders);
        performAction(action);
    }
    protected void unitDecision(List<Needs> needs, List<Orders> orders){
        //
    }
    protected void performAction(){
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
