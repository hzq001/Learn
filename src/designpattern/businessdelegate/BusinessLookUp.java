package designpattern.businessdelegate;

/**
 * @author zq.huang
 * @date 2020/2/21
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new  EJBService();
        } else {
            return new JMSService();
        }
    }
}
