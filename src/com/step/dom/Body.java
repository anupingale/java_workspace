package com.step.dom;

class Body extends Component {
    @Override
    String refresh() {
        return "Refreshing body" + super.refresh();
    }
}
