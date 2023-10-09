package jsonparser.kodular;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@DesignerComponent(version = 1,
                   description = "JSON Parser extension created by Francesco",
                   category = ComponentCategory.EXTENSION,
                   nonVisible = true,
                   iconName = "images/extension.png")
@SimpleObject(external = true)
public class JSONParser extends AndroidNonvisibleComponent {
    private JSONObject jsonObj;
    private JSONArray jsonArray;

    public JSONParser(ComponentContainer container) {
        super(container.$form());
    }
    
    @SimpleFunction(description = "Parse JSON String")
    public void ParseJSON(String JSONString) {
        jsonObj = new JSONObject(JSONString);
    }

    @SimpleFunction(description = "Open JSON Array")
    public void OpenJSONArray(String JSONString) {
        jsonArray = jsonObj.getJSONArray(JSONString);
    }

    @SimpleFunction(description = "Open JSON Object")
    public void OpenJSONObject(String JSONString) {
        jsonObj = jsonObj.getJSONObject(JSONString);
    }

    @SimpleFunction(description = "Open JSON Object in Array")
    public void OpenObjectInArrayByIndex(int i) {
        jsonObj = jsonArray.getJSONObject(i);
    }

    @SimpleFunction(description = "Open JSON Array in Array")
    public void OpenArrayInArrayByIndex(int i) {
        jsonArray = jsonArray.getJSONArray(i);
    }

    @SimpleFunction(description = "Open JSON String")
    public String GetStringValue(String attributeName) {
        return jsonObj.getString(attributeName);
    }

    @SimpleFunction(description = "Open JSON Integer")
    public int GetIntegerValue(String attributeName) {
        return jsonObj.getInt(attributeName);
    }

    @SimpleFunction(description = "Open JSON Double")
    public double GetDoubleValue(String attributeName) {
        return jsonObj.getDouble(attributeName);
    }
}
