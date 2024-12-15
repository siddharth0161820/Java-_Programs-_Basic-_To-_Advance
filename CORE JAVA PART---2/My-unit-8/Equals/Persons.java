package Equals;

import java.util.Objects;

public class Persons {
    //1>Instance variables
    private  String personsName;
    private  int personsAge;
    private String personsId;

    //2>Create constructor  using given attributes of persons

    public Persons(String personsName, int personsAge, String personsId) {
        this.personsName = personsName;
        this.personsAge = personsAge;
        this.personsId = personsId;
    }

    //5>defining equals() for the person

//    @Override
//    public boolean equals(Object obj) {
//        //defining equals()
//        if(!(obj instanceof Persons)) {
//            //obj se check kr skte wo obj ek particular class ka hein ya nhi
//            //using obj we can check persons is an obj of particular class or not
//           return false;
//        }
//        //if persons  is the obj of the particular class then
//        //convert obj to person
//        Persons myypersons =(Persons)obj;
//        //now we can compare
//        return myypersons.personsName.equals(personsName) &&
//                myypersons.personsAge == personsAge && //age is number so can directly compare with ==
//                myypersons.personsId.equals(personsId);
//    }
//
//
//    //6> Defining /generating hashcodes()
//    //hashcode should be consistent(same value ke liye same hashcode hona chaiye...).
//
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(personsName, personsAge, personsId);
//    }
    //////DEFINING EQUALS AND HASHCODES BY IDE FOLLOWED BY BELOW STATAEMENT
//If equals() is overridden, hashCode() should also be overridden to
//    maintain consistency between these methods.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persons persons = (Persons) o;
        return personsAge == persons.personsAge && Objects.equals(personsName, persons.personsName) && Objects.equals(personsId, persons.personsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personsName, personsAge, personsId);
    }


    //3> create toString()

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persons{");
        sb.append("personsName='").append(personsName).append('\'');
        sb.append(", personsAge=").append(personsAge);
        sb.append(", personsId='").append(personsId).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //4>getter setter fot the class

    public String getPersonsName() {
        return personsName;
    }

    public void setPersonsName(String personsName) {
        this.personsName = personsName;
    }

    public int getPersonsAge() {
        return personsAge;
    }

    public void setPersonsAge(int personsAge) {
        this.personsAge = personsAge;
    }

    public String getPersonsId() {
        return personsId;
    }

    public void setPersonsId(String personsId) {
        this.personsId = personsId;
    }
}
