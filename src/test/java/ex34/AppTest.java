package ex34;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void deleteName() {
        App app = new App();
        String[] array = new String[5];
        array[0] = "Caitlin Fabian";
        array[1] = "Ana Cohen";
        array[2] = "Emily Ross";
        array[3] = "Ellen Tyson";
        array[4] = "Amber Smith";


        String[] newArray = {"Ana Cohen","Emily Ross","Ellen Tyson", "Amber Smith"};


        Assert.assertArrayEquals(newArray, app.deleteName(array, array.length, "Caitlin Fabian"));
    }
}