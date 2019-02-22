/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.osk.infotrans.wsdl;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 *
 * @author DKTS-UAGolovanov
 */
@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();
    
    @PostConstruct
    public void initData() {
            Country spain = new Country();
            spain.setName("Spain");
            spain.setCapital("Madrid");
            spain.setCurrency(Currency.EUR);
            spain.setPopulation(46704314);

            countries.put(spain.getName(), spain);

            Country poland = new Country();
            poland.setName("Poland");
            poland.setCapital("Warsaw");
            poland.setCurrency(Currency.PLN);
            poland.setPopulation(38186860);

            countries.put(poland.getName(), poland);

            Country uk = new Country();
            uk.setName("United Kingdom");
            uk.setCapital("London");
            uk.setCurrency(Currency.GBP);
            uk.setPopulation(63705000);

            countries.put(uk.getName(), uk);
    }

    public Country findCountry(String name) {
            Assert.notNull(name, "The country's name must not be null");
            return countries.get(name);
    }
}
