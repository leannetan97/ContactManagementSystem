package contactmanagementsoftware;

import java.util.HashMap;
import java.util.Scanner;

public class Relatives extends Acquaintances{
    public static int numberRel = 0;
    private static Scanner reader = new Scanner(System.in);
    
    Relatives(){
        super();
        numberRel++;
        otherInformations = new ROtherInformations();
    }

    
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String Name) {
        super.setName(Name); 
    }

    @Override
    public String getMobileNo() {
        return super.getMobileNo();
    }

    @Override
    public void setMobileNo(String MobileNo) {
        super.setMobileNo(MobileNo);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String Email) {
        super.setEmail(Email);
    }
    
    public String getBDate() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("RelativesBirthday");
    }

    public String getLDate() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("LastDateMet");
    }
    
    @Override
    public void setOtherInformations(String[] othersInfoArray){
        String relativesBirthday = othersInfoArray[0];
        String lastDateMet = othersInfoArray[1];
        HashMap<String,String> otherInformationsHashMap = new HashMap();
        otherInformationsHashMap.put("RelativesBirthday", relativesBirthday);
        otherInformationsHashMap.put("LastDateMet", lastDateMet);
        otherInformations.setOtherInformations(otherInformationsHashMap);
    }
}
