package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName = "safari";

        String result = "";
        boolean validBrowser = browserName == "chrome " || browserName == "firefox" ||browserName == "opera" || browserName == "safari" || browserName == "edge";
        if (validBrowser){
           if (browserName == "chrome"){
               result= "chrome browser is selected.";
           }else if (browserName == "firefox"){
               result="firefox browser is selected";
           }else if (browserName== "opera") {
               result = "oprea broeser is selected";
           }else if (browserName== "safari") {
               result = "safari is selected";
           }else{
               result = "edge is selected";
           }




        }else {
            result = "Invalid Browseer Name";
        }
        System.out.println(result);
    }
}
