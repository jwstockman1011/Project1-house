/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square window2;
    private Triangle roof;
    private Circle sun;
    private Person guy1;
    private Person guy2;
    private Circle horizon;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        horizon = new Circle();
        horizon.changeColor("green");
        horizon.changeSize(700);
        horizon.moveHorizontal(-350);
        horizon.moveVertical(130);
        horizon.makeVisible();
        
        wall = new Square();
        wall.moveHorizontal(-220);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-200);
        window.moveVertical(40);
        window.changeSize(35);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(-155);
        window2.moveVertical(40);
        window2.changeSize(35);
        window2.makeVisible();

        roof = new Triangle(); 
        roof.changeColor("blue");
        roof.changeSize(60, 180);
        roof.moveHorizontal(-60);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(175);            //330
        sun.moveVertical(-70);              //50
        sun.changeSize(80);
        sun.makeVisible();
        
        guy1 = new Person();
        guy1.changeColor("magenta");
        guy1.moveHorizontal(-30);
        guy1.moveVertical(30);
        guy1.makeVisible();
        
        guy2 = new Person();
        guy2.changeColor("blue");
        guy2.moveHorizontal(30);
        guy2.moveVertical(40);
        guy2.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
