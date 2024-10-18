package Factory;

import java.awt.*;

public class FillCreator extends ColorBehaviorMaker {
    public FillCreator() {
    }

    public FillCreator(Color color) {
        super(color);
    }

    @Override
    public ColorBehaviorMaker createColorBehavior() {
        return new NoFillCreator(color);
    }
}
