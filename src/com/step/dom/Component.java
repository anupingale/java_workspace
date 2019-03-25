package com.step.dom;

import java.util.ArrayList;
import java.util.List;

class Component {
    List<Component>  children;

    Component() {
        this.children = new ArrayList<>();
    }

    String refresh() {
        StringBuilder refreshResult = new StringBuilder();
        for (Component child : this.children) {
            refreshResult.append("\n" + child.refresh());
        }
        return refreshResult.toString();
    }

    void appendChild(Component component) {
        this.children.add(component);
    }

}
