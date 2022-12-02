import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class MaxCategoryTest {
    private MaxCategory maxCategory;
    private ArrayList<Category> arraysDays;


    @BeforeEach
    @DisplayName("������� �������!")
    void setUp() {
        maxCategory = new MaxCategory();
        arraysDays = new ArrayList<>();
        arraysDays.add(new Category("���","24.11.2022",300));
        arraysDays.add(new Category("������","24.11.2022",600));
    }


    @Test
    @DisplayName("���� ������")
    void testOne() {
        Assertions.assertEquals("������ 600", maxCategory.calcMaxCategory("24.11.2022", arraysDays));

        System.out.println("���� ����� ���� ��������");
    }


    @AfterEach
    @DisplayName("����� �����")
    void setDown() {
        System.out.println("������ �������");
    }

}