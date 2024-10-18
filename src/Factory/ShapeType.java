package Factory;
import java.awt.*;
import java.awt.geom.RectangularShape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

public enum ShapeType {
    RECTANGULAR{
        @Override
        public Rectangle2D.Double createShape() {
            return new Rectangle2D.Double();
        }
    },

    ELLIPSE{
        @Override
        public Ellipse2D.Double createShape() {
            return new Ellipse2D.Double();
        }
    };
    public abstract Object createShape();

}
