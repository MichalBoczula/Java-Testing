package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String desc, PoemDecorator poemDecorator){
        return poemDecorator.decorate(desc);
    }
}
