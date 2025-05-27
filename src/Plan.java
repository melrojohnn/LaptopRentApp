public class Plan
{
    private String servicePlan;
    private String serviceTypePlan;
    private String servicePlanDesc;

    public Plan(){

    }

    public String getServicePlan() {
        return servicePlan;
    }

    public void setServicePlan(String servicePlan) {
        this.servicePlan = servicePlan;
    }

    public String getServicePlanDesc() {
        return servicePlanDesc;
    }

    public void setServicePlanDesc(String servicePlanDesc) {
        this.servicePlanDesc = servicePlanDesc;
    }

    public String getServiceTypePlan() {
        return serviceTypePlan;
    }

    public void setServiceTypePlan(String serviceTypePlan) {
        this.serviceTypePlan = serviceTypePlan;
    }
}
