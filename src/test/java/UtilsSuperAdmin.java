import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class UtilsSuperAdmin {
    public static void main(String[] args) throws IOException, ParseException {
        UtilsSuperAdmin utilsSuperAdmin = new UtilsSuperAdmin();
        utilsSuperAdmin.getUserCredentials(0);
        System.out.println(utilsSuperAdmin.getPhone());
        System.out.println(utilsSuperAdmin.getPassword());
    }

    private String phone;
    private String password;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void getUserCredentials(int position) throws IOException, ParseException {
        String fileName = "./src/test/resources/Users.json";
        JSONParser jsonParser = new JSONParser();
        Object object = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) object;
        JSONObject jsonObject = (JSONObject) jsonArray.get(position);
        setPhone((String) jsonObject.get("phone"));
        setPassword((String) jsonObject.get("password"));
    }
}