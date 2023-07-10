
public class Cashier {
    public String fname;
    public String lname;
    public int age;
    public String email;
    public int id;
    public String Password;
    public String experience;
    public String Ph_number;
    public String gender;


    Cashier(){}

    Cashier(String f, String l, int a,String em,int i,String ex,String ph,String g,String pass){
        fname = f;
        lname = l;
        age = a;
        id = i;
        experience = ex;
        email = em;
        gender = g;
        Ph_number = ph;
        Password = pass;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public int getID() {
        return id;
    }
    

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPassword() {
        return Password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPh_number(String ph_number) {
        Ph_number = ph_number;
    }

    public String getGender() {
        return gender;
    }

    public String getExperience() {
        return experience;
    }

    public String getPh_number() {
        return Ph_number;
    }



}

    

