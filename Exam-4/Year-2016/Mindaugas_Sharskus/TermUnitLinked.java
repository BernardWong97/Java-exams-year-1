

/**
 *
 * @author Mindaugas
 */
public class TermUnitLinked extends UnitLinked{
    // Fields
    private int matureDate;
    private Person lifeInduredName = new Person();

    // Constructors
    public TermUnitLinked(int matureDate, Person lifeInduredName,
            int fund, int policyNo, int commenseDate,
            double premium, Person policyName) {

        super(fund, policyNo, commenseDate, premium, policyName);
        this.matureDate = matureDate;
        this.lifeInduredName = lifeInduredName;
    }

    public TermUnitLinked(int matureDate, Person lifeInduredName,
            int fund, int policyNo, int commenseDate, double premium) {

        super();
        super.setFund(fund);
        super.setInsPolicyNo(policyNo);
        super.setInsCommenceDate(commenseDate);
        super.setInsPremium(premium);
        this.matureDate = matureDate;
        this.lifeInduredName = lifeInduredName;
    }

    public TermUnitLinked(){
        super();
        this.matureDate = 999999;
    }

    // Setters

    public void setMatureDate(int matureDate) {
        this.matureDate = matureDate;
    }

    public void setLifeInduredName(Person lifeInduredName) {
        this.lifeInduredName = lifeInduredName;
    }

    // Getters

    public int getMatureDate() {
        return matureDate;
    }

    public Person getLifeInsuredName() {
        return lifeInduredName;
    }

    // Other

    @Override
    public String toString() {
        //return "TermUnitLinked{" + "matureDate=" + matureDate + ", lifeInduredName=" + lifeInduredName + '}';
          String s = super.toString()+" Lif: "+getLifeInsuredName()+" " + getMatureDate();
     	return s;
    }

}
