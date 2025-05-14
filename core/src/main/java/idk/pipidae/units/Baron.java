
public class Baron implements Title{
    public Baron(Title title){
        base = title;
    }

    public Title getBase(){
        return base;
    }

    protected Action unitDecision(List<Need> needs, List<Order> orders);

    protected void performAction(Action action);

    Title base;
}
