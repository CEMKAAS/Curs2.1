import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class MaxCategoryTest {
    private MaxCategory maxCategory;
    private ArrayList<Category> arraysDays;


    @BeforeEach
    @DisplayName("Погнали тестить!")
    void setUp() {
        maxCategory = new MaxCategory();
        arraysDays = new ArrayList<>();
        arraysDays.add(new Category("еда","24.11.2022",300));
        arraysDays.add(new Category("одежда","24.11.2022",600));
    }


    @Test
    @DisplayName("Тест первый")
    void testOne() {
        Assertions.assertEquals("одежда 600", maxCategory.calcMaxCategory("24.11.2022", arraysDays));

        System.out.println("Тест номер один выполнен");
    }


    @AfterEach
    @DisplayName("Конец теста")
    void setDown() {
        System.out.println("Хватит тестить");
    }

}