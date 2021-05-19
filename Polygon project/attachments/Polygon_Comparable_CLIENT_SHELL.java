/**
 * Mr. Marques
 * Polygon_Comparable CLIENT has an ArrayList of Polygons called PolygonShapesList that 'adds' to the end of it,
 * 'adds at an index specified', 'removes' from it at an index specified, 'sets' at an index specified, and
 * 'gets' a Polygon and finds its area.  It also finds the Polygon with the largest and smallest area.
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Polygon_Comparable_CLIENT_SHELL
{
    // **************************************************************************************************
    // ***************************************** init() (MAIN) ******************************************
    // **************************************************************************************************    
    public static void main()
    {
        // Declare + define ArrayList 'polygonShapesList' of type Polygon_Comparable
        ArrayList<Polygon_Comparable> polygonShapesList = new ArrayList<Polygon_Comparable>();
        String polygonShapesListItems="";
        int mainMenuSelection;

        do 
        { 
            polygonShapesListItems="";
            for (int i = 0; i< polygonShapesList.size(); i++)
                polygonShapesListItems += "(" + i + ") " + polygonShapesList.get(i) + "\n";

            mainMenuSelection = Integer.parseInt( JOptionPane.showInputDialog(" Enter your menu selection: \n " +
                    polygonShapesListItems + "\n\n\n" +
                    "(0) Quit. \n" +
                    "(1) Add a new Polygon at the end of the list. \n" +
                    "(2) Add a new Polygon at an index 'i' in the list. \n" +
                    "(3) Remove a Polygon at an index 'i' in the list. \n" +
                    "(4) Set a new Polygon to an index 'i' in the list. \n" +
                    "(5) Get a Polygon at an index 'i' in the list and find the Area of it. \n" +
                    "(6) Find the Polygon with the largest area. \n" +
                    "(7) Find the Polygon with the smallest area.\n"));

            switch (mainMenuSelection) 
            {
                case 0 : JOptionPane.showMessageDialog(null,"Good Bye!");  System.exit(0); break;
                case 1 : addPolygonToEndOfList(polygonShapesList); break;
                case 2 : addPolygonAtAnIndex(polygonShapesList); break;            
                case 3 : removePolygonAtAnIndex(polygonShapesList); break;
                case 4 : setPolygonAtAnIndex(polygonShapesList); break;            
                case 5 : getAndFindAreaOfPolygonAtAnIndex(polygonShapesList); break;
                case 6 : findPolygonWithLargestArea(polygonShapesList); break;
                case 7 : findPolygonWithSmallestArea(polygonShapesList); break;
                default:
                JOptionPane.showMessageDialog(null," Thanks for playing PolygonShapesList game! \n Have a good Day!!");
                System.exit(0);
                break;       
            }

        } while (1==1);
    }

    public static void addPolygonToEndOfList(ArrayList<Polygon_Comparable> pList)
    {
        int polygonSelection;
        boolean badSelection;
        int pListEndPosition;

        pListEndPosition = ( (pList.size() == 0) ? 0 : pList.size()-1);

        do 
        {
            polygonSelection = Integer.parseInt (JOptionPane.showInputDialog(" Enter your menu selection from these categories: \n " +
                    "(1) Triangle  (2) Quadralateral  (3) Agon  (4) Rounds \n") ); //Polygon.showCategories()); 
            badSelection=false;
            switch (polygonSelection) 
            {
                case 1 : addTriangleAtAnIndex(pList,pListEndPosition);  break;
                case 2 : addQuadrilateralAtAnIndex(pList,pListEndPosition);  break;
                case 3 : addAgonAtAnIndex(pList,pListEndPosition);  break;
                case 4 : addRoundAtAnIndex(pList,pListEndPosition);  break;                                    
                default: 
                JOptionPane.showMessageDialog(null," ERROR! \n Please choose only from the listed categories");
                badSelection = true;
                break;
            }

        } while (badSelection == true);

    }    
    // ***********************************************************************************************
    public static void addPolygonAtAnIndex(List<Polygon_Comparable> pList)
    {
        int polygonSelection;
        boolean badSelection;
        int indexSelection;

        do 
        {
            indexSelection = Integer.parseInt(JOptionPane.showInputDialog("Enter an index number 0 - " + (pList.size()-1)));
            if ( !( 0 <= indexSelection && indexSelection <= pList.size()-1))
                JOptionPane.showMessageDialog(null,"Enter ONLY numbers 0 - " + (pList.size()-1),"Warning",JOptionPane.PLAIN_MESSAGE);  // "Enter ONLY numbers 0 - " + pList.size()-1, "Warning!!",JOptionPane.WARNING_MESSAGE);
        } while (! (0 <= indexSelection && indexSelection <= pList.size()-1) );

        do 
        {
            polygonSelection = Integer.parseInt (JOptionPane.showInputDialog(" Enter your menu selection from these categories: \n " +
                    "(1) Triangle  (2) Quadralateral  (3) Agon  (4) Rounds \n") ); //Polygon.showCategories()); 
            badSelection=false;
            switch (polygonSelection) 
            {
                case 1 : addTriangleAtAnIndex(pList,indexSelection);  break;
                case 2 : addQuadrilateralAtAnIndex(pList,indexSelection);  break;
                case 3 : addAgonAtAnIndex(pList,indexSelection);  break;
                case 4 : addRoundAtAnIndex(pList,indexSelection);  break;                                    
                default: 
                JOptionPane.showMessageDialog(null," ERROR! \n Please choose only from the listed categories");
                badSelection = true;
                break;
            }

        } while (badSelection == true);          

    }
    // --------------------------------------------------------------------------------------------
    public static void addTriangleAtAnIndex(List pList,int index)
    {
        int choice;
        double b, h;

        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Triangle from the following list: \n"
                + " (1) Scalene  (2) Isoscelese  (3) Equilateral ") );  //   + Triangles.typesAvailable()) );  
        b = Double.parseDouble( JOptionPane.showInputDialog(null, "Please type in the base of the Triangle: \n") );    
        h = Double.parseDouble( JOptionPane.showInputDialog(null, "Please type in the height of the Triangle: \n") );          

        switch (choice) 
        {
            case 1:  
            Scalene sc = new Scalene(b, h);
            pList.add(index, sc);
            break;
            case 2:  
            Isosceles is = new Isosceles(b, h);
            pList.add(index, is);
            break;
            case 3:  
            Equilateral eq = new Equilateral(b, h);
            pList.add(index, eq);
            break;            
        }
    }

    public static void addQuadrilateralAtAnIndex(List pList,int index)
    {
        int choice;
        double b1,b2,h;

        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Quadrilateral from the following list: \n"
                + " (1) Trapezium (2) Trapezoid (3) Parallelogram  (4) Rhombus (5) Rectangle (6) Square   ") );

        b1 = Double.parseDouble( JOptionPane.showInputDialog(null," Enter the base: \n") );        
        h = Double.parseDouble( JOptionPane.showInputDialog(null," Enter the height: \n") );        
        switch (choice) 
        {
            case 1:  
            b2 = Double.parseDouble( JOptionPane.showInputDialog(null," Enter 2nd base: \n") );
            Trapezium tm = new Trapezium(b1, b2, h);
            pList.add(index, tm);
            break;
            case 2: 
            b2 = Double.parseDouble( JOptionPane.showInputDialog(null," Enter 2nd base: \n") );
            Trapezoid td = new Trapezoid(b1, b2, h);
            pList.add(index, td); 
            break;
            case 3:  
            b2 = Double.parseDouble( JOptionPane.showInputDialog(null," Enter 2nd base: \n") );
            Parallelogram p = new Parallelogram(b1, b2, h);
            pList.add(index, p);
            break;
            case 4: 
            b2 = b1;
            Rhombus rh = new Rhombus(b1, b2, h);
            pList.add(index, rh);
            break;
            case 5:
            b2 = h;
            Rectangle re = new Rectangle(b1, b2, h);
            pList.add(index, re);
            break;
            case 6:               
            b2 = b1;
            Square sq = new Square(b1, b2, h);
            pList.add(index, sq);
            break;
        }            

    }    

    public static void addAgonAtAnIndex(List pList,int index)
    {
        int choice;
        double side;

        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Agon from the following list: \n"
                + " (1)Pentagon (2) Hexagon (3) Heptagon (4) Octagon (5) Nonagon (6) Decagon (7) Dodecagon \n") );
        side = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the length of the side: \n" ) );
        switch (choice) 
        {
            case 1: 
            Pentagon pe = new Pentagon(side);
            pList.add(index, pe);
            break;
            case 2: 
            Hexagon he = new Hexagon(side);
            pList.add(index, he);
            break;
            case 3:
            Heptagon hp = new Heptagon(side);
            pList.add(index, hp);
            break;
            case 4:
            Octagon oc = new Octagon(side);
            pList.add(index, oc);
            break;
            case 5: 
            Nonagon no = new Nonagon(side);
            pList.add(index, no);
            break;
            case 6: 
            Decagon de = new Decagon(side);
            pList.add(index, de);
            break;
            case 7: 
            Dodecagon dc = new Dodecagon(side);
            pList.add(index, dc);
            break;
        }            

    }    

    public static void addRoundAtAnIndex(List pList,int index)
    {
        int choice;
        double radius1, radius2;

        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Round from the following list: \n"
                + " (1) Circle + \n (2) SemiCircle + \n (3) Ellipse + \n  ") );
        radius1 = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the length of the radius: \n" ) );

        switch (choice) {
            case 1: 
            Circle c = new Circle(radius1);
            pList.add(index, c);
            break;
            case 2: 
            SemiCircle sc = new SemiCircle(radius1);
            pList.add(index, sc);
            break;
            case 3: 
            radius2 = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the length of the radius2: \n" ) );
            Ellipse e = new Ellipse(radius1, radius2);
            pList.add(index, e);
            break;
        }            

    }    

    public static void removePolygonAtAnIndex(ArrayList pList)
    {
        int i;
        String output="";
        int indexSelection;

        for (i = 0; i < pList.size(); i++)
            output += "(" + i +") " + (Polygon_Comparable)pList.get(i) +"\n";

        do 
        {
            indexSelection = Integer.parseInt( JOptionPane.showInputDialog("Please enter a selection for Deletion from the list: \n" + output));
            if ( !( 0 <= indexSelection && indexSelection <= pList.size()-1))
                JOptionPane.showMessageDialog(null,"Enter ONLY numbers 0 - " + (pList.size()-1),"Warning",JOptionPane.PLAIN_MESSAGE);  
            // "Enter ONLY numbers 0 - " + pList.size()-1, "Warning!!",JOptionPane.WARNING_MESSAGE);
        } while ( !(0 <= indexSelection && indexSelection <= pList.size()-1));

        // delete selected
        pList.remove(indexSelection);

        output="";
        for (i=0; i<pList.size(); i++)
            output += "(" + i +") " + (Polygon_Comparable)pList.get(i) +"\n";
        JOptionPane.showMessageDialog(null," Remove is successful.  The new list is: \n" + output);

    }

    public static void setPolygonAtAnIndex(List pList)
    {
        int polygonSelection;
        boolean badSelection;
        int indexSelection;

        do
        {
            indexSelection = Integer.parseInt(JOptionPane.showInputDialog("Enter an index number 0 - " + (pList.size()-1)));
            if ( !( 0 <= indexSelection && indexSelection <= pList.size()-1))
                JOptionPane.showMessageDialog(null, "Enter ONLY numbers 0 - " + (pList.size()-1), "Warning!!",JOptionPane.WARNING_MESSAGE);
        } while ( !( 0 <= indexSelection && indexSelection <= pList.size()-1));

        do 
        {
            polygonSelection = Integer.parseInt (JOptionPane.showInputDialog(" Enter your menu selection from these categories: \n " +
                    "(1) Triangle  (2) Quadralateral  (3) Agon  (4) Rounds \n") ); //Polygon.showCategories()); 
            badSelection=false;
            switch (polygonSelection) 
            {
                case 1 : setTriangleAtAnIndex(pList,indexSelection);  break;
                case 2 : setQuadrilateralAtAnIndex(pList,indexSelection);  break;
                case 3 : setAgonAtAnIndex(pList,indexSelection);  break;
                case 4 : setRoundAtAnIndex(pList,indexSelection);  break;                                    
                default: 
                JOptionPane.showMessageDialog(null," ERROR! \n Please choose only from the listed categories");
                badSelection = true;
                break;
            }

        } while (badSelection == true);

    }

    public static void setTriangleAtAnIndex(List pList,int index)
    {
        int choice;
        double b, h;

        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Triangle from the following list: \n"
                + " (1) Scalene  (2) Isoscelese  (3) Equilateral ") );  //   + Triangles.typesAvailable()) );  
        b = Double.parseDouble( JOptionPane.showInputDialog(null, "Please type in the base of the Triangle: \n") );    
        h = Double.parseDouble( JOptionPane.showInputDialog(null, "Please type in the height of the Triangle: \n") );          

        switch (choice) 
        {
            case 1:  
            Scalene sc = new Scalene(b, h);
            pList.set(index, sc);
            break;
            case 2:  
            Isosceles is = new Isosceles(b, h);
            pList.set(index, is);
            break;
            case 3:  
            Equilateral eq = new Equilateral(b, h);
            pList.set(index, eq);
            break;            
        }
    }

    public static void setQuadrilateralAtAnIndex(List pList,int index)
    {
        int choice;
        double b1,b2,h;

        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Quadrilateral from the following list: \n"
                + " (1) Trapezium (2) Trapezoid (3) Parallelogram  (4) Rhombus (5) Rectangle (6) Square   ") );

        b1 = Double.parseDouble( JOptionPane.showInputDialog(null," Enter the base: \n") );        
        h = Double.parseDouble( JOptionPane.showInputDialog(null," Enter the height: \n") );        
        switch (choice) 
        {
            case 1:  
            b2 = Double.parseDouble( JOptionPane.showInputDialog(null," Enter 2nd base: \n") );
            Trapezium tm = new Trapezium(b1, b2, h);
            pList.set(index, tm);
            break;
            case 2: 
            b2 = Double.parseDouble( JOptionPane.showInputDialog(null," Enter 2nd base: \n") );
            Trapezoid td = new Trapezoid(b1, b2, h);
            pList.set(index, td); 
            break;
            case 3:  
            b2 = Double.parseDouble( JOptionPane.showInputDialog(null," Enter 2nd base: \n") );
            Parallelogram p = new Parallelogram(b1, b2, h);
            pList.set(index, p);
            break;
            case 4: 
            b2 = b1;
            Rhombus rh = new Rhombus(b1, b2, h);
            pList.set(index, rh);
            break;
            case 5:
            b2 = h;
            Rectangle re = new Rectangle(b1, b2, h);
            pList.set(index, re);
            break;
            case 6:               
            b2 = b1;
            Square sq = new Square(b1, b2, h);
            pList.set(index, sq);
            break;
        }        

    }    

    public static void setAgonAtAnIndex(List pList,int index)
    {
        int choice;
        double side;

        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Agon from the following list: \n"
                + " (1)Pentagon (2) Hexagon (3) Heptagon (4) Octagon (5) Nonagon (6) Decagon (7) Dodecagon \n") );
        side = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the length of the side: \n" ) );
        switch (choice) 
        {
            case 1: 
            Pentagon pe = new Pentagon(side);
            pList.set(index, pe);
            break;
            case 2: 
            Hexagon he = new Hexagon(side);
            pList.set(index, he);
            break;
            case 3:
            Heptagon hp = new Heptagon(side);
            pList.set(index, hp);
            break;
            case 4:
            Octagon oc = new Octagon(side);
            pList.set(index, oc);
            break;
            case 5: 
            Nonagon no = new Nonagon(side);
            pList.set(index, no);
            break;
            case 6: 
            Decagon de = new Decagon(side);
            pList.set(index, de);
            break;
            case 7: 
            Dodecagon dc = new Dodecagon(side);
            pList.set(index, dc);
            break;
        }                    

    }    

    public static void setRoundAtAnIndex(List pList,int index)
    {
        int choice;
        double radius1, radius2;

        choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select a Round from the following list: \n"
                + " (1) Circle + \n (2) SemiCircle + \n (3) Ellipse + \n  ") );
        radius1 = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the length of the radius: \n" ) );

        switch (choice) {
            case 1: 
            Circle c = new Circle(radius1);
            pList.add(index, c);
            break;
            case 2: 
            SemiCircle sc = new SemiCircle(radius1);
            pList.add(index, sc);
            break;
            case 3: 
            radius2 = Double.parseDouble( JOptionPane.showInputDialog(null, "Please enter the length of the radius2: \n" ) );
            Ellipse e = new Ellipse(radius1, radius2);
            pList.add(index, e);
            break;
        }                  

    }        

    public static void getAndFindAreaOfPolygonAtAnIndex(ArrayList<Polygon_Comparable> pList)
    {
        int i;
        String output="";
        int areaSelection;
        Polygon_Comparable p;

        for (i = 0; i < pList.size(); i++)
            output += "(" + i +") " + (Polygon_Comparable) pList.get(i) +"\n";

        areaSelection = Integer.parseInt( JOptionPane.showInputDialog("Please enter a selection for Area from the list: \n" + output));

        // get Polygon and find area
        p = pList.get(areaSelection);        
        JOptionPane.showMessageDialog(null, "Area of the " + p.getMyType() + " " + p.getMyCategory() + " = " + p.getMyArea());

    }    

    public static void findPolygonWithLargestArea(ArrayList<Polygon_Comparable> pList)
    {
        double maxArea = Double.MIN_VALUE;
        Polygon_Comparable max = pList.get(0);

        for (int i = 0; i < pList.size(); i++)
        {
            if (pList.get(i).getMyArea() > maxArea)
            {
                max = pList.get(i);
                maxArea = max.getMyArea();
            }
        }

        JOptionPane.showMessageDialog(null, "Polygon with the Largest Area is " + max.getMyType() + " " + max.getMyCategory() + " = " + max.getMyArea());
    }

    public static void findPolygonWithSmallestArea(ArrayList<Polygon_Comparable> pList)
    {
        double minArea = Double.MAX_VALUE;
        Polygon_Comparable min = pList.get(0);

        for (int i = 0; i < pList.size(); i++)
        {
            if (pList.get(i).getMyArea() < minArea)
            {
                min = pList.get(i);
                minArea = min.getMyArea();
            }
        }

        JOptionPane.showMessageDialog(null, "Polygon with the Smallest Area is " + min.getMyType() + " " + min.getMyCategory() + " = " + min.getMyArea());
    }    

} // CLIENT
