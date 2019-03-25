package com.step.dom;

class Image extends Component {
    @Override
    public String refresh() {
        return "Refreshing image" + super.refresh();
    }
}
