public class RobotMover {
    public String moveSequence;
    RobotMover(int numMoves) {
	moveSequence = "";
    for (int i = 0; i < numMoves; i++) {
    	int random = (int)(Math.random() * 4 + 1);
        if (random == 1)
        	moveSequence += "up_";
        else if (random == 2)
        	moveSequence += "down_";
        else if (random == 3)
        	moveSequence += "left_";
        else
        	moveSequence += "right_";
    }
}
}