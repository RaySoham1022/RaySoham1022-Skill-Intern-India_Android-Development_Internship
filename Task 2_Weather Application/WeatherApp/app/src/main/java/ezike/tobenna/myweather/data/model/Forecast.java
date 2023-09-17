package ezike.tobenna.myweather.data.model;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * @author tobennaezike
 */
public class Forecast {

    @Json(name = "forecastday")
    private List<ForecastdayItem> forecastday;

    public List<ForecastdayItem> getForecastday() {
        return forecastday;
    }

    public void setForecastday(List<ForecastdayItem> forecastday) {
        this.forecastday = forecastday;
    }
}