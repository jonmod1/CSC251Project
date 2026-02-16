public class Policy


{

    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokingStatus;
    private double height;
    private double weight;
    
    
    public Policy()
    
    {
        policyNumber = 0;
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        smokingStatus = "";
        height = 0.0;
        weight = 0.0;
    }
    
    
    public Policy(int policyNumber, String providerName,
          String policyholderFirstName, String policyholderLastName,
          int policyholderAge, String smokingStatus,
          double height, double weight)
          
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }
    
    public int getPolicyNumber()
    {
        return policyNumber;
    }

    public String getProviderName()
    {
        return providerName;
    }

    public String getPolicyholderFirstName()
    {
        return policyholderFirstName;
    }

    public String getPolicyholderLastName()
    {
        return policyholderLastName;
    }

    public int getPolicyholderAge()
    {
        return policyholderAge;
    }

    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }
    
    
    public void setPolicyNumber(int policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    public void setPolicyholderFirstName(String policyholderFirstName)
    {
        this.policyholderFirstName = policyholderFirstName;
    }

    public void setPolicyholderLastName(String policyholderLastName)
    {
        this.policyholderLastName = policyholderLastName;
    }

    public void setPolicyholderAge(int policyholderAge)
    {
        this.policyholderAge = policyholderAge;
    }

    public void setSmokingStatus(String smokingStatus)
    {
        this.smokingStatus = smokingStatus;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }
 
 
    public double calculateBMI()
    {
        return (weight * 703) / (height * height);
    }
    
    public double calculatePrice()
    {
        double price = 600.0;

        if (policyholderAge > 50)
        {
            price += 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker"))
        {
            price += 100.0;
        }

        double bmi = calculateBMI();

        if (bmi > 35)
        {
            price += (bmi - 35) * 20;
        }

        return price;
    }
}   