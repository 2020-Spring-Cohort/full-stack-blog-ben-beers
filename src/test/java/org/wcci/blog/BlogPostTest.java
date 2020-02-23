package org.wcci.blog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static java.time.LocalDate.*;

public class BlogPostTest {
    BlogPost underTest;
    BlogPost underTestTwo;

    static final String LOREM = "Ad sunt adipisicing consequat elit ex ipsum id pariatur eiusmod irure do. Voluptate aute exercitation quis ad nisi eu anim in amet nisi. Officia aute cillum Lorem et cillum quis ut. Velit proident voluptate irure sint consequat in adipisicing. Consectetur nisi tempor mollit nostrud. Aute excepteur pariatur eiusmod pariatur sunt consequat in non ullamco.\n" +
            "\n" +
            "Eu sunt aliquip dolore do esse consequat ea ea. Fugiat labore occaecat enim aliquip culpa cillum exercitation aliquip ut pariatur. Adipisicing cillum exercitation amet elit voluptate non pariatur ut. Excepteur sint mollit fugiat ut tempor nostrud nostrud est deserunt eiusmod est. Nostrud Lorem nisi Lorem velit id mollit in sint nisi. Ipsum irure velit ipsum quis.\n" +
            "\n" +
            "Ex veniam do adipisicing exercitation sit. Duis laboris tempor voluptate quis fugiat adipisicing cupidatat duis irure fugiat magna. Quis aliqua magna veniam pariatur ad quis minim ipsum eiusmod exercitation reprehenderit. Deserunt est excepteur cillum elit sint sunt ipsum sit sint aliquip tempor. Aute occaecat laborum dolore exercitation. Laborum deserunt in irure nulla esse Lorem ut laboris eu velit pariatur.\n" +
            "\n" +
            "Anim non nostrud sint amet in occaecat esse sit officia ullamco. Adipisicing ipsum aute veniam magna pariatur quis consequat sint duis ad nostrud irure. Lorem veniam et ex magna est do dolor sunt ullamco quis.\n" +
            "\n" +
            "Ut ea tempor sint laborum cupidatat occaecat enim sit nulla culpa. Eu Lorem proident occaecat fugiat veniam in quis do sit. Laborum nostrud do aliquip non velit consequat sit id ad laboris. Consectetur amet velit Lorem laboris enim laboris anim voluptate irure incididunt culpa sint laboris. Elit pariatur id minim pariatur.";

    static final String LOREM_TWO = "Amet laboris aliqua sunt proident cupidatat nulla eiusmod. Et occaecat ipsum ea velit eu aute non et commodo. Dolor aute qui veniam nostrud.\n" +
            "\n" +
            "    Ad eiusmod consequat tempor anim proident irure proident ipsum mollit Lorem ipsum aliquip cupidatat officia. Ea irure esse tempor et ipsum enim cupidatat est consequat. Aliquip exercitation eiusmod pariatur dolor labore.\n" +
            "\n" +
            "    Nostrud consectetur consequat ullamco exercitation proident reprehenderit. Voluptate ullamco elit cupidatat cupidatat et consectetur velit nulla ipsum reprehenderit anim enim aliqua. Quis cupidatat id nisi ad cupidatat excepteur esse nostrud dolore eu dolor ea fugiat. Nisi duis reprehenderit aliquip voluptate duis.\n" +
            "\n" +
            "    Sint labore culpa pariatur reprehenderit dolore fugiat ipsum consectetur non esse. Cupidatat dolore dolor dolore nisi tempor non non laboris fugiat incididunt aliquip laborum et. Deserunt eu velit tempor aliqua veniam eiusmod velit fugiat nulla. Incididunt commodo consectetur ullamco sunt irure proident ullamco ex fugiat. Laborum nulla ipsum enim ut velit eu nostrud cillum nostrud proident esse.\n" +
            "\n" +
            "    Laboris sint magna velit officia pariatur eiusmod cillum ut. Commodo in aute officia consectetur culpa eu elit irure non do veniam laboris consectetur eiusmod. Aute pariatur laborum ex occaecat. Qui consequat irure qui ut ex et et amet veniam. Consequat in officia aute tempor eiusmod reprehenderit nulla ea.";

    @BeforeEach
    public void setUp(){
        underTest = new BlogPost("Ben",LocalDate.of(2020,2,22),LOREM);
        underTestTwo = new BlogPost("Bob",LocalDate.of(2020,2,21),LOREM_TWO);
    }

    @Test
    public void blogPostShouldHaveAnAuthor(){
        assert(underTest.getAuthor() == "Ben");
    }

    @Test
    public void blogPostShouldHaveBobForAnAuthor(){
        assert(underTestTwo.getAuthor() == "Bob");
    }

    @Test
    public void blogPostShouldHaveADate(){
        assert(underTest.getDate().equals(of(2020, 2, 22)));
    }

    @Test
    public void otherBlogPostShouldHaveDifferentDate(){
        assert(underTestTwo.getDate().equals(of(2020,2,21)));
    }

    @Test
    public void postShouldHaveText(){
        assert(underTest.getText().equals(LOREM));
    }

    @Test
    public void otherPostShouldHaveSomeOtherLoremIpsumText(){
        assert(underTestTwo.getText().equals(LOREM_TWO));
    }



}
