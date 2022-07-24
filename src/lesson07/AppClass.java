package lesson07;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.*;
import java.util.List;

public class AppClass {
    public static final String CITY = "Санкт-Петербург";
    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("295212")
                .addQueryParameter("apikey", "B49tbpAS5UKFGDNErGMqp39GH9C55IkW" )
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();

        ObjectMapper objectMapper = new ObjectMapper();
        StringReader reader = new StringReader(jsonResponse);

        WeatherResponse weatherResponse = objectMapper.readValue(reader, WeatherResponse.class);
        List<DailyForecast> dailyForecastList = weatherResponse.getDailyForecasts();
        for (DailyForecast forecast : dailyForecastList){
                Double min = forecast.getTemperature().getMinimum().getValue();
                Double max = forecast.getTemperature().getMaximum().getValue();
                String TEMPERATURE = String.format("%.1f", (max + min) / 2);
                String DATE = forecast.getDate().split("T")[0];
                String WEATHER_TEXT = forecast.getDay().getIconPhrase();
                System.out.println("В городе " + CITY + " на дату " + DATE + " ожидается \"" + WEATHER_TEXT
                        + "\" температура - " + TEMPERATURE);
        }
    }

}


