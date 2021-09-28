package ex38;

import org.junit.jupiter.api.Test;
import org.junit.Assert;


class AppTest {

    @Test
    void splitToArray() {
        App app = new App();
        String oldString = "1 2 3 4 5 6";
        int[] array = {1,2,3,4,5,6};
        Assert.assertArrayEquals(array, app.splitToArray(oldString));
    }

    @Test
    void filterEvenNumbers(){
        App app = new App();
        int[] array = {1,2,3,4,5,6};
        int[] newArray = {2,4,6};
        Assert.assertArrayEquals(newArray, app.filterEvenNumbers(array));
    }
}