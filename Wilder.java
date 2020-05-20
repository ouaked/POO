class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public boolean whoAmI() {
        if (this.aware == false) {
            System.out.println("Je m'appelle " + firstname +  "et je ne suis pas aware");
            return false;
        }

        System.out.println("Je m'appelle firstname et je suis aware");
        return true;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

}
