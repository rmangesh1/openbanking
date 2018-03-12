package eu.dnb.openbanking.client;

import eu.dnb.openbanking.domain.Customer;
import eu.dnb.openbanking.domain.vo.CustomerPatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by rmang on 12-03-2018.
 */
public class OpenBankingService {

    public static final Logger logger = LoggerFactory.getLogger(OpenBankingService.class);

    public String baseUrl;

    public RestTemplate restTemplate;

    public OpenBankingService(String baseUrl, RestTemplate restTemplate) {
        this.baseUrl = baseUrl;
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<Customer> getCustomer(String customerId) {
        logger.info("Customer id : "+customerId);
        return restTemplate.getForEntity(baseUrl + "/customers/{customerId}", Customer.class, customerId);
    }

    public Customer patchCustomer(String customerId, CustomerPatch customerPatch) {
        logger.info("Customer patch : "+customerPatch);
        return restTemplate.patchForObject(baseUrl + "/customers/{customerId}", customerPatch,  Customer.class, customerId);
    }

}
