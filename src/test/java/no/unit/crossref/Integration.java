package no.unit.crossref;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import no.unit.crossref.model.ApiResponse;
import org.junit.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNotNull;

public class Integration {
    static ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testModel() throws ExecutionException, InterruptedException {

        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest httpRequest = HttpRequest
                .newBuilder(URI.create("http://api.crossref.org/works/10.1007/s00115-004-1822-4"))
                .timeout(Duration.ofSeconds(30))
                .header("Content-type", "application/json")
                .GET()
                .build();
        ApiResponse apiResponse = httpClient.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(Integration::map)
                .get();
        assertNotNull(apiResponse);
    }

    private static ApiResponse map(String json) {
        try {
            return objectMapper.readValue(json, ApiResponse.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
