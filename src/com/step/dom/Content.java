package com.step.dom;

class Content extends Component {
    @Override
    String refresh() {
        return "Refreshing content" + super.refresh();
    }
}
