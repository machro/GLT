import java.util.List;
import java.util.LinkedList;

public class World {
  private final List<Move> moveCommands;
  private int left, right, up, down;
  
  public World() {
    moveCommands = new LinkedList<>();
  }
  
  private int[] xBounds() {
    int min = 0, max = 0, pos = 0;
    for (Move move : moveCommands) {
      if (move instanceof MoveX) {
        if (move instanceof MoveLeft) {
          pos -= move.distance;
          min = Math.min(min, pos);
        } else {
          pos += move.distance;
          max = Math.max(max, pos);
        }
      }
    }
    return new int[] {min, max};
  }
  
  private int[] yBounds() {
    int min = 0, max = 0, pos = 0;
    for (Move move : moveCommands) {
      if (move instanceof MoveY) {
        if (move instanceof MoveDown) {
          pos -= move.distance;
          min = Math.min(min, pos);
        } else {
          pos += move.distance;
          max = Math.max(max, pos);
        }
      }
    }
    return new int[] {min, max};
  }
  
  private void addMove(Move move) {
    moveCommands.add(move);
  }
  
  public static void main(String... args) {
    World world = new World();
			world.addMove(new MoveUp(10));
			world.addMove(new MoveLeft(50));
			world.addMove(new MoveDown(10));
			world.addMove(new MoveRight(20));
			world.addMove(new MoveUp(30));
    
    int[] xBounds = world.xBounds();
    int[] yBounds = world.yBounds();
    System.out.println("("+ xBounds[0] + ", "+ yBounds[0] + ")");
    System.out.println("("+ xBounds[1] + ", "+ yBounds[1] + ")");
  }
}

abstract class Move {
  final int distance;
  public Move(int distance) {
    this.distance = distance;
  }
}

abstract class MoveX extends Move {
  public MoveX(int distance) {
    super(distance);
  }
}
class MoveLeft extends MoveX {
  public MoveLeft(int distance) {
    super(distance);
  }
}
class MoveRight extends MoveX {
  public MoveRight(int distance) {
    super(distance);
  }
}

abstract class MoveY extends Move {
  public MoveY(int distance) {
    super(distance);
  }
}
class MoveUp extends MoveY {
  public MoveUp(int distance) {
    super(distance);
  }
}
class MoveDown extends MoveY {
  public MoveDown(int distance) {
    super(distance);
  }
}
