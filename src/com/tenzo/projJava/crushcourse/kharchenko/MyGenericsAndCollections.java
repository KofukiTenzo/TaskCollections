package com.tenzo.projJava.crushcourse.kharchenko;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyGenericsAndCollections extends ListWrapper<String>{
    private ArrayList list;

    @Override
    public void addOtherCollection(Collection<? extends String> otherCollection) {
        list = new ArrayList<String>(otherCollection);
    }

    @Override
    public int removeElementsByCollection(Collection<? extends String> collection) {
        list.remove(collection);
        return list.size();
    }

    @Override
    public int countDuplicates(Collection<? extends String> collection) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(collection.contains(list.get(i))) count++;
        }
        return count;
    }

    @Override
    public List<String> getList() {
        return list;
    }

    @Override
    public String getElement(int index) {
        return getList().get(index);
    }

    @Override
    public String beautyString() {
        return list.toString();
    }
}
