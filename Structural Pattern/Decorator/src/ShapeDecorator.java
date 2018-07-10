public class ShapeDecorator implements Shape {
    protected Shape decorateShape;

    public ShapeDecorator(Shape decorateshape) {
        this.decorateShape = decorateshape;

    }

    @Override
    public void draw() {
        decorateShape.draw();
    }
}
