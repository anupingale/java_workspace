package com.step.dom;

class Text extends Component {
    @Override
    public String refresh() {
        return "Refreshing text" + super.refresh();
    }
}
