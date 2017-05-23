package es.esy.williamoldham.langgen;

interface Visitor<T> {

    Visitor<T> visitTree(Tree<T> tree);

    void visitData(Tree<T> parent, T data);
}