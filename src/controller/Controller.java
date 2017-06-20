/**
 * Created by amitp on 20/06/2017
 */
public class Controller implements IController {

    private IView view;
    private IModel model;

    public Controller(IView view, IModel model) {
        this.view = view;
        this.model = model;
    }
}
