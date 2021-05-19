import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

public class OERunner {
    public static void main() {
        ActorWorld world = new ActorWorld();
        //world.add(new Location(0, 1), new OpossumCritter());
        world.add(new Location(0, 1), new StockpileCritter());
        world.add(new Location(0, 2), new Rock());
        world.add(new Location(0, 3), new Flower());
        world.show();
    }
}