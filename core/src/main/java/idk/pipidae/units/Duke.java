package idk.pipidae.units;

public class Duke extends Baron{
    public Duke(Baron baron){
        base = baron;
    }

    public Baron getBase(){
        return base;
    }

    protected Action unitDecision(List<Need> needs, List<Order> orders);

    protected void performAction(Action action);

    private Baron base;
}
