package designpattern.businessdelegate;

/**
 * @author zq.huang
 * @date 2020/2/21
 */
public class BusinessDelegate {
    private BusinessLookUp lookUpService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
