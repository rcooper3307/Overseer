package Beings;

public class Being {
    String Title;
    int healthVial;
    int xLoc, yLoc;

    public Being (String title, int healthVial, int xLoc, int yLoc)
    {
        this.Title = title;
        this.healthVial = healthVial;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }
    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }
}
