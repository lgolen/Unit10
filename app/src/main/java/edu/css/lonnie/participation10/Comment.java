package edu.css.lonnie.participation10;

/*
* This class provides a way to store comments and their IDs.
*/
public class Comment {
    // a Comment consists of the ID and a string containing the comment
    private long id;
    private String comment;

    // returns the ID of the comment instance
    public long getId() {
        return id;
    }

    // sets the ID of the comment
    public void setId(long id) {
        this.id = id;
    }

    // returns the comment text
    public String getComment() {
        return comment;
    }

    // sets the comment text
    public void setComment(String comment) {
        this.comment = comment;
    }

    // Will be used by the ArrayAdapter in the ListView
    // Override the toString() method to return the comment private variable
    @Override
    public String toString() {
        return comment;
    }
}