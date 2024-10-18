package Factory;

import java.awt.*;

public abstract class ColorBehaviorMaker {
    protected Color color;

    public ColorBehaviorMaker() {
        color = Color.BLACK;
    }

    public ColorBehaviorMaker(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract ColorBehaviorMaker createColorBehavior();
}
