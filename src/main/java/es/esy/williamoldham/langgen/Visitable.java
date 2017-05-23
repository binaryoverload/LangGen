package es.esy.williamoldham.langgen;

interface Visitable<T> {

    void accept(Visitor<T> visitor);
}
