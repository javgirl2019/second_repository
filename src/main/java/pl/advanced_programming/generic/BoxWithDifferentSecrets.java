package pl.advanced_programming.generic;

public class BoxWithDifferentSecrets <T,U> {

    private T secret1;
    private U secret2;

    public BoxWithDifferentSecrets(T secret1, U secret2) {
        this.secret1 = secret1;
        this.secret2 = secret2;
    }

    public T getSecret1() {
        return secret1;
    }

    public U getSecret2() {
        return secret2;
    }

    @Override
    public String toString() {
        return "BoxWithDifferentSecrets{" +
                "secret1=" + secret1 +
                ", secret2=" + secret2 +
                '}';
    }
}
