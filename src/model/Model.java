package model;

import controller.IController;

import java.sql.ResultSet;

/**
 * Created by amitp on 20/06/2017
 */
public class Model implements IModel {

    DBUtils db = new  DBUtils();

    private IController controller;

    @Override
    public void setController(IController controller) {
        this.controller = controller;
    }

    public ResultSet getAllMessage(String topic)
    {
        String query = "SELECT * FROM message_table WHERE discution_id = "+"'"+topic+"'";
        ResultSet result = db.select(query);
        return result;

    }

    public boolean insertDiscussion(Discussion discussion){
        long name = discussion.getName();
        String subForum = discussion.getSubForum();
        String query = "INSERT INTO discussion_table(openning_message_id, sub_forum_id ) VALUES ( "+"'"+name+"',"+"'"+subForum+"')";
        db.insert(query);
        return true;
    }

}
