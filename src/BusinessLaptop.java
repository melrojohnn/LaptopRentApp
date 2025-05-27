public class BusinessLaptop extends Laptops {
    private boolean hasOfficeSuite;
    private boolean hasVPN;

    public boolean isHasOfficeSuite() {
        return hasOfficeSuite;
    }

    public void setHasOfficeSuite(boolean hasOfficeSuite) {
        this.hasOfficeSuite = hasOfficeSuite;
    }

    public boolean isHasVPN() {
        return hasVPN;
    }

    public void setHasVPN(boolean hasVPN) {
        this.hasVPN = hasVPN;
    }
}
