import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class AttractiveCritter extends Critter {

    public void act() {
        if (getGrid() == null) {
            return;
        }
        ArrayList<Actor> actors = getActors();
        ArrayList<Location> allActors = getGrid().getOccupiedLocations();
        attractActors(allActors);
        processActors(actors);
        ArrayList<Location> moveLocs = getMoveLocations();
        Location loc = selectMoveLocation(moveLocs);
        makeMove(loc);
    }

    public void attractActors(ArrayList<Location> actorsLocation) {
        for (Location loc: actorsLocation) {
            Actor a = getGrid().get(loc);
            int direction = loc.getDirectionToward(getLocation());
            Location newLoc = loc.getAdjacentLocation(direction);
            if (getGrid().isValid(newLoc) && getGrid().get(newLoc) == null) {
                a.moveTo(newLoc);
            }
        }
    }
}
