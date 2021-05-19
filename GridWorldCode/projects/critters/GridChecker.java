import info.gridworld.grid.*;
import info.gridworld.actor.*;

import java.util.*;

public class GridChecker {
    private static BoundedGrid<Actor> gr;
    
    public static void main() {
        gr = new BoundedGrid<Actor>(20, 20);
        ActorWorld world = new ActorWorld(gr);
        for (int i = 0; i < 40; i++) {
            world.add(generateRandomLocation(world), new Critter());
        }
        Actor popularActor = actorWithMostNeighbors();
        System.out.print("The most popular Actor is at ");
        System.out.println(popularActor.getLocation());
        List<Location> locs = getOccupiedWithinTwo(new Location(0,0));
        System.out.println(locs.toString());
        world.show();
    }
    
    private static Location generateRandomLocation(ActorWorld world) {
        int row = 0;
        int col = 0;
        Location loc;
        int limit = 10;
        do {
            row = (int) (Math.random() * world.getGrid().getNumRows());
            col = (int) (Math.random() * world.getGrid().getNumCols());
            // System.out.println(row + "  " + col);
            loc = new Location(row, col);
            limit--;
            if (limit == 0) {
                throw new ExceptionInInitializerError();
            }
        } while (world.getGrid().get(loc) != null);
        return loc;
    }
    
    public static Actor actorWithMostNeighbors() {
        Actor a = null;
        int totalNeighbors = 0;
        for (Location loc : gr.getOccupiedLocations()) {
            ArrayList<Location> ls = gr.getOccupiedAdjacentLocations(loc);
            if (ls.size() > totalNeighbors) {
                a = gr.get(loc);
                totalNeighbors = ls.size();
            }
        }
        return a;
    }

    public static List<Location> getOccupiedWithinTwo(Location loc) {
        List<Location> totalOccupied = new ArrayList<Location>();
        int startRow = loc.getRow() - 2;
        int startCol = loc.getCol() - 2;
        int endRow = loc.getRow() + 2;
        int endCol = loc.getCol() + 2;
        while (startRow < 0) startRow++;
        while (startCol < 0) startCol++;
        while (endRow > gr.getNumRows()) endRow--;
        while (endCol > gr.getNumCols()) endCol--;
        System.out.println("startRow = " + startRow + " ");
        for (int i = startRow; i < endRow; i++) {
            for (int j = startCol; j < endCol; j++) {
                Location cloc = new Location(i,j);
                if (gr.get(new Location(i,j)) != null) {
                    totalOccupied.add(cloc);
                }
            }
        }

        return totalOccupied;

    }
}