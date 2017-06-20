package model;

import controller.IController;

/**
 * Created by amitp on 20/06/2017
 */
public class Model implements IModel {

    private IController controller;

    @Override
    public void setController(IController controller) {
        this.controller = controller;
    }
}
