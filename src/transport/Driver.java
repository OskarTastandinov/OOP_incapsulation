package transport;

public class Driver {
    private String FIO; // ФИО
    private String driversLicense; // Наличие водительских прав
    private String Experience; // Стаж

    public Driver(String FIO, String driversLicense) {
        this.FIO = FIO;
        this.driversLicense = driversLicense;
    }
    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = driversLicense;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }
}

