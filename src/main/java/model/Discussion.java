package model;

/**
 * Created by windows on 20/06/2017.
 */
public class Discussion {
    private long name;
    private String subForum;

    public Discussion(long disName, String subForum_name){
        this.name = disName;
        this.subForum = subForum_name;

    }

    public String getSubForum() {
        return subForum;
    }


    public long getName() {
        return name;
    }


}
