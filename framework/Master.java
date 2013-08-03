package sminer.framework;


public enum Master {

    VAR(Path.VAR),
    BAR(Path.BAR),
    ALK(Path.ALK);

    private final Path path;

    private Master(final Path path) {

        this.path = path;

    }

    public Path path() {
        return path;
    }
}
