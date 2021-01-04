package test;

import java.util.LinkedList;
import java.util.List;

public class Chapter {
    private long id;

    private long parentId;

    private List<Chapter> children = new LinkedList<>(); //子章节

    public Chapter(long id, long parentId) {
        this.id = id;
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", children=" + children +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public List<Chapter> getChildren() {
        return children;
    }

    public void setChildren(List<Chapter> children) {
        this.children = children;
    }
}
