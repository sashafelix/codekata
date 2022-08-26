package FunWithWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunWithWordsTest {

    @Test
    public void combineAlbums() {
        assertEquals("albums", FunWithWords.combineWords("al", "bums"));
    }

    @Test
    public void combineBarely() {
        assertEquals("barely", FunWithWords.combineWords("bar", "ely"));
    }

    @Test
    public void combineBefoul() {
        assertEquals("befoul", FunWithWords.combineWords("be", "foul"));
    }

    @Test
    public void combineConvex() {
        assertEquals("convex", FunWithWords.combineWords("con", "vex"));
    }

    @Test
    public void combineHereby() {
        assertEquals("hereby", FunWithWords.combineWords("here", "by"));
    }

    @Test
    public void combineJigsaw() {
        assertEquals("jigsaw", FunWithWords.combineWords("jig", "saw"));
    }

    @Test
    public void combineTailor() {
        assertEquals("tailor", FunWithWords.combineWords("tail", "or"));
    }

    @Test
    public void combineweaver() {
        assertEquals("weaver", FunWithWords.combineWords("we", "aver"));
    }
}