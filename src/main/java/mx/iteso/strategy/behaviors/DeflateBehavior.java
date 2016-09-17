package mx.iteso.strategy.behaviors;

public interface DeflateBehavior {
    String DEF_DEFLATE = "I'm deflating!";
    String DEF_INFLATE = "I'm inflating!";
    String NOTDEF_DEFLATE = "I can't deflate!";
    String NOTDEF_INFLATE = "I can't inflate!";
    String deflate();
    String inflate();
}
