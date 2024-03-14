public class enumTest {

    /** listez toutes les directions possibles */
    enum Direction {
        north, east, west, south;
    }

    /** trouvez le nord */
    public static void main(String[] args) {

        Direction direction = Direction.north;
        switch (direction) {
            case north:
                System.out.println("You are heading North");
                break;
            case east:
                System.out.println("You are heading East");
                break;
            case west:
                System.out.println("You are heading West");
                break;
            case south:
                System.out.println("You are heading South");
                break;
        }   
    }
    
}
