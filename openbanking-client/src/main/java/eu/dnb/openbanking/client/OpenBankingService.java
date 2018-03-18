package eu.dnb.openbanking.client;

import eu.dnb.openbanking.domain.Customer;
import eu.dnb.openbanking.domain.vo.CustomerPatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
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

    public ResponseEntity<Customer> patchCustomer(String customerId, CustomerPatch customerPatch) {
        logger.info("Customer id : "+customerId + ", Customer patch : "+customerPatch);
        HttpEntity<CustomerPatch> customerPatchHttpEntity = new HttpEntity<CustomerPatch>(customerPatch);
        return restTemplate.exchange(baseUrl + "/customers/{customerId}", HttpMethod.PATCH, customerPatchHttpEntity,  Customer.class, customerId);
    }

}
