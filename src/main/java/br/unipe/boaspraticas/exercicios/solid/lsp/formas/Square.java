package br.unipe.boaspraticas.exercicios.solid.lsp.formas;

public class Square extends Rectangle {
    private int side;

    public void setSide(int side) {
        this.side = side;
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }
}
