package Factory;

import java.awt.*;

public class NoFillCreator extends ColorBehaviorMaker {
    public NoFillCreator() {
        super();
    }

    public NoFillCreator(Color color) {
        super(color);
    }

    public ColorBehaviorMaker createColorBehavior() {
        return new NoFillCreator(color);
    }
}
