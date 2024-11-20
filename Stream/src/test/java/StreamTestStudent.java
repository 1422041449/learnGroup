import com.learn.stream.po.Student;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamTestStudent {

    private List<Student> students = Lists.list(
            new Student("Alice", 20, 90.0),
            new Student("Bob", 22, 85.5),
            new Student("Charlie", 19, 88.5),
            new Student("David", 21, 92.0),
            new Student("Eva", 18, 94.5)
    );

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


    /**
     * 筛选出年龄>18并且成绩>=90的学生
     */
    @Test
    public void test1() {
        List<Student> list = students.stream().filter(student -> student.getAge() > 18 && student.getScore() >= 90).toList();
        System.out.println(list);
    }

    /**
     * 跳过前5个
     */
    @Test
    public void test2() {
        List<Integer> list = numbers.stream().skip(5).toList();
        System.out.println(list);
    }

    /**
     * 合并多个集合成1个集合
     * 并排序
     */
    @Test
    public void test3(){
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(5, 6),
                Arrays.asList(3, 4)
        );
        List<Integer> list = nestedLists.stream().flatMap(Collection::stream).sorted().toList();
        System.out.println(list);
    }

}
