import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

class request_api{
   public static void main(String[] args) throws IOException{
        // pasamos el id si queremos recibir una request en especifico o 0 para todas
      	//String data = MyGETRequest(4);
        //System.out.println(data);
    	POSTRequest("javafinal3", "awa", "awa", "awa");
   }

public static String MyGETRequest(int id_DATA) throws IOException {
    String url_data = "http://localhost/api/get/"; // url del get
    String nodata ="";
    if (id_DATA>0){
        url_data = url_data+id_DATA+"/"; // agregamos la id especifica != 0
    }
    URL urlForGetRequest = new URL(url_data); // hacemos la llamada a la api x url
    String readLine = null;
    HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
    conection.setRequestMethod("GET");
    int responseCode = conection.getResponseCode();
    

    if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(conection.getInputStream()));
        StringBuffer response = new StringBuffer();
        while ((readLine = in .readLine()) != null) {
            response.append(readLine);
        } in .close();
        // print result
        //System.out.println(response.toString());
        // GetAndPost.POSTRequest(response.toString());
        return response.toString();
    } else {
        System.out.println("GET NOT WORKED");
    }
    return nodata;
}

public static void POSTRequest(String np, String ip, String dp, String tp) throws IOException {
    final String POST_PARAMS = "{\"name_p\":\"" + np +"\",\"img_p\":\"" + ip +"\",\"desc_p\":\"" + dp +"\",\"tipo_p\":\"" + tp +"\"}";
    System.out.println(POST_PARAMS);
    URL obj = new URL("http://localhost/apiv2/post/");
    HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
    postConnection.setRequestMethod("POST");
    postConnection.setRequestProperty("Content-Type", "application/json");
    

    postConnection.setDoOutput(true);
    OutputStream os = postConnection.getOutputStream();
    os.write(POST_PARAMS.getBytes());
    os.flush();
    os.close();


    int responseCode = postConnection.getResponseCode();
    System.out.println("POST Response Code :  " + responseCode);
    System.out.println("POST Response Message : " + postConnection.getResponseMessage());

    if (201 == HttpURLConnection.HTTP_CREATED) { //success
        BufferedReader in = new BufferedReader(new InputStreamReader(
            postConnection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in .readLine()) != null) {
            response.append(inputLine);
        } in .close();

        // print result
        System.out.println(response.toString());
        System.out.println("POST WORKED");
    } else {
        System.out.println("POST NOT WORKED");
        System.out.println("CODE ERROR: " + HttpURLConnection.HTTP_CREATED);
    }
}
}