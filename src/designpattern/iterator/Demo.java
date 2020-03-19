package designpattern.iterator;

/**
 * @author zq.huang
 * @date 2020/2/14
 */
public class Demo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator=nameRepository.getIterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
