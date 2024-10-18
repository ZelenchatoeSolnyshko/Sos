package Factory;

import Factory.ShapeMaker;

import java.awt.geom.RectangularShape;

public class MyShapeCreator {
    private ShapeMaker shapeMaker;
    private ColorBehaviorMaker colorBehaviorMaker;
    public MyShapeCreator(ShapeMaker shapeMaker, ColorBehaviorMaker colorBehaviorMaker) {
        this.shapeMaker = shapeMaker;
        this.colorBehaviorMaker = colorBehaviorMaker;
    }

    public void setShapeMaker(ShapeMaker shapeMaker) {
        this.shapeMaker = shapeMaker;
    }

    public void setColorBehaviorMaker(ColorBehaviorMaker colorBehaviorMaker) {
        this.colorBehaviorMaker = colorBehaviorMaker;
    }

    public RectangularShape createShape() {
        return shapeMaker.buildShape();
    }
}
