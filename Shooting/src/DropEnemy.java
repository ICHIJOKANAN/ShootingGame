
public class DropEnemy extends Enemy
{
	 public DropEnemy(double x,double y,double vx,double vy)
	  {
		  super(x,y,vx,vy);
	        life = +GameWorld.stage;
	  }
	 public void move()
	  {
		  super.move();
		  vy = vy+GameWorld.stage;
	  }
	    public void draw(MyFrame f) {
	        f.setColor(0, 250, 0);
	        f.fillRect(x, y, 30, 10);
	        f.fillRect(x + 10, y + 10, 10, 20);
	    }
}
