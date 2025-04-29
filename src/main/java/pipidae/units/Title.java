package pipidae.units;

public abstract class Title{
    public Title(String name, String title, int age, int health){
        this.name=name;
        this.title=title;
        this.age=age;
        this.health=health;
    }
    public void update(List<> needs, List<> orders){
        Action action = unitDecision(needs, orders);
        performAction(action);
    }
    protected void unitDecision(List<> needs, List<> orders){
        //
    }
    protected void performAction(){
        //
    }
    public String getName(){
        return name;
    }
    public String getTitle(){
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
    private String title;
    private int age;
    private int health;
}
