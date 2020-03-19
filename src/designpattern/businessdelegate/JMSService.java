package designpattern.businessdelegate;

/**
 * @author zq.huang
 * @date 2020/2/21
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS service.");
    }
}
