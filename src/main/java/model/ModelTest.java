package model;

import org.junit.jupiter.api.Test;


public class ModelTest {

    private Model model = new Model();

    @Test
    public void getAllMessage() throws Exception {


    }

    @Test
    public void insertDiscussion() throws Exception {
        Discussion discussion = new Discussion(11235 , "BigForum");
        model.insertDiscussion(discussion);
    }

}