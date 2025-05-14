
public class Knight implements Title{
    public Knight(Title title){
        base = title;
    }

    public Title getBase(){
        return base;
    }

    public void update(List<Need> needs, List<Order> orders){
        performAction(unitDecision(needs, orders));
    }

    Title base;
}
