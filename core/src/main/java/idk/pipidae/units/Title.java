package idk.pipidae.units;

import java.util.List;

// TODO: interface tillater ikke protected. Kanskje bruke abstract class?

// Gjør bare alt om til public.

interface Title{
    Title demote();

    //updates the unit using utility ai model
    void update();

    Action unitDecision();

    Title getTitle();

    String getName();

    int getHealth();

    List<Action> getActionlist();
}
