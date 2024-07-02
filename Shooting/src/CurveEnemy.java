
public class CurveEnemy extends Enemy
{
	 public CurveEnemy (double x, double y, double vx, double vy) 
	  {
	      super(x, y, vx, vy);
	        life =+GameWorld.stage;
	  }
	public void move()
	  {
		  super.move();
		  if(x < GameWorld.player.x) 
		  {
			  x+=GameWorld.stage;
		  }
		  if(x > GameWorld.player.x) 
		  {
			  x-=GameWorld.stage;
		  }

		   
	  }

    public void draw(MyFrame f) {
        f.setColor(0, 0, 0);
        f.fillOval(x, y, 30, 30);
        f.setColor(200, 200, 200);
        f.fillOval(x + 5, y, 20, 30);
    }
}
