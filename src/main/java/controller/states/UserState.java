package controller.states;

import controller.IController;
import model.IModel;
import view.IView;

/**
 * Created by amitp on 20/06/2017
 */
public abstract class UserState implements IController {

    protected IView view;
    protected IModel model;

    protected UserState(IView view, IModel model) {
        this.view = view;
        this.model = model;
    }
}
