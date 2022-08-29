package main;

import property.util.ActionsForOrganisms;

/** This class runnable and get the move action for animals*/
public class FixedOrganismMoveExecutionRunnable implements Runnable {
    private ActionsForOrganisms actionsForOrganisms = new ActionsForOrganisms();
    @Override
    public void run() {
        try {
            actionsForOrganisms.moveHerbivores();
            actionsForOrganisms.movePredators();
         } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
