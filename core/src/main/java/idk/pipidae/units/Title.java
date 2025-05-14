package idk.pipidae.units;

import java.util.List;

interface Title{
    public Title(String name, int rank, int age, int health);

    public Title demote(Title title);

    public Title getBase();

    //updates the unit using utility ai model
    public void update(List<Need> needs, List<Order> orders);

    protected Action unitDecision(List<Need> needs, List<Order> orders);

    protected void performAction(Action action);
}
