package com.info.earthquakes.controller;

import com.info.earthquakes.core.response.ApiResponse;
import com.info.earthquakes.dto.FeatureCollection;
import com.info.earthquakes.service.EarthquakesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/earthquakes")
public class EarthquakesController {

    @Autowired
    EarthquakesService earthquakesService;

    @GetMapping("/get")
    @ResponseBody
    public ApiResponse<FeatureCollection> getEarthquakesWithPastdayAndCountrycode(@RequestParam  Long pastday, String countrycode) {
        return ApiResponse.<FeatureCollection>builder()
                .body(earthquakesService.getEarthquakesWithPastdayAndCountrycode(pastday, countrycode))
                .success()
                .buildInstance();
    }
}
