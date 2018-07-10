public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decorateshape) {
        super(decorateshape);
    }

    @Override
    public void draw() {
        decorateShape.draw();
        setRedBorder(decorateShape);
    }

    private void setRedBorder(Shape decorateShape) {
        System.out.println("Border Color : Red");
    }
}
