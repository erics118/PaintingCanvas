import painter.drawable.Text;

public class App extends painter.App {
    public App() {
        // TODO: i know this is bad, will change
        globalPainter.canvas.elements.add(new Text(100, 100, "whee", 30));
        globalPainter.canvas.elements.add(new Text(0, 100, "0", 30));
    }

    /**
     * This method will be run every frame as a sort of "render function"
     * You don't have to put anything here, it's just an alternative to the draw function.
     *
     * @param args Command-Line arguments
     */
    @Override
    public void render(String[] args) {
        Text t = (Text) globalPainter.canvas.elements.get(0);
        ((Text) globalPainter.canvas.elements.get(1)).text = String.valueOf(++t.x);
    }
}