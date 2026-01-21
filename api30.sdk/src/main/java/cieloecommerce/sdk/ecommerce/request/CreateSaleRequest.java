package cieloecommerce.sdk.ecommerce.request;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import cieloecommerce.sdk.Environment;
import cieloecommerce.sdk.Merchant;
import cieloecommerce.sdk.ecommerce.Sale;

/**
 * Create any kind of sale
 */
public class CreateSaleRequest extends AbstractSaleRequest<Sale, Sale> {
  public CreateSaleRequest(Merchant merchant, Environment environment) {
    super(merchant, environment);
  }

  @Override
  public Sale execute(Sale param) throws IOException, CieloRequestException {
    String url = environment.getApiUrl() + "1/sales/";
    // String url = "https://webhook.site/05296c29-4556-4901-9e96-d502d7df5bd8";
    HttpPost request = new HttpPost(url);

    request.setEntity(new StringEntity(new GsonBuilder().create().toJson(param), ContentType.APPLICATION_JSON));

    HttpResponse response = sendRequest(request);

    if ((response.getStatusLine().getStatusCode() < 200) || (response.getStatusLine().getStatusCode() > 299)) {
      String msg = "";
      try {
        StringBuilder sb = new StringBuilder();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        response.getEntity().writeTo(baos);
        String json = baos.toString(StandardCharsets.UTF_8.name());
        Gson gson = new GsonBuilder().create();
        Type listType = new TypeToken<List<Map<String, String>>>() {}.getType();
        List<Map<String, String>> list = gson.fromJson(json, listType);
        String code = list.get(0).get("Code");
        String message = list.get(0).get("Message");
        msg = String.format(". Code: %s. Message: %s", code, message);
      } catch (Exception e) {
        //
      }
      throw new IllegalStateException("Erro no envio da requisicao. HTTP " + response.getStatusLine().getStatusCode() + msg);
    }

    return readResponse(response, Sale.class);
  }
}
